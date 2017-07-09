package cn.rzhd.wuye.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.rzhd.wuye.bean.Account;
import cn.rzhd.wuye.mapper.AccountMapper;
import cn.rzhd.wuye.utils.ExportExcelUtils;
import cn.rzhd.wuye.vo.query.AccountQuery;


@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	AccountMapper Mapper;

	@RequestMapping("/index")
	public String index() {
		return "/payment/account";
	}

	@RequestMapping("/accountData")
	public String accountData(Model model,AccountQuery query) {
		List<Account> accounts = Mapper.getWaterElectric(query);
		for (Account account : accounts) {
			account.setFeetype("物业类型");
		}
		model.addAttribute("query", query);
		model.addAttribute("accounts", accounts);
		return "/payment/account";
	}
	
	
	@RequestMapping(value ="/exportExcel")
    public ModelAndView exportExcel(HttpServletRequest request,HttpServletResponse response,AccountQuery query){  
		System.out.println(query.getType());
        try {  
            // 查出用户数据  
        	List<Account> accounts = Mapper.getWaterElectric(query);
        	for (Account account : accounts) {
    			account.setFeetype("物业类型");
    		}
            String title ="对账表";  
            String[] rowsName=new String[]{"序号","收款公司","收款账户","费用类型","应缴（总）","已缴（总）"};  
            List<Object[]>  dataList = new ArrayList<Object[]>();  
            Object[] objs = null;  
            for (int i = 0; i < accounts.size(); i++) {  
            	Account po =accounts.get(i);
                objs = new Object[rowsName.length];  
                objs[0] = i;  
                objs[1] = po.getCollecting_company();
                objs[2] = po.getCollecting_account();
                objs[3] = po.getFeetype();
                objs[5] = po.getPayable();
                objs[6] = po.getPaid_in();
                dataList.add(objs);  
            }  
            //   
            ExportExcelUtils ex =new ExportExcelUtils(title, rowsName, dataList,response);  
            ex.exportData();  
              
              
        } catch (Exception e) {  
            e.printStackTrace();  
        }  

        return null;  
    }

	@RequestMapping("/accountDetails")
	public String accountDetails() {

		return "/payment/accountDetails";
	}
}
