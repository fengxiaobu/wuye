package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.Company;
import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.mapper.HouseInfoDetailsMapper;
import cn.rzhd.wuye.service.ICompanyService;
import cn.rzhd.wuye.service.IHouseInfoDetailsService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.HouseVO;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import com.github.pagehelper.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

import java.util.List;

/**
 * Created by hasee on 2017/6/5.
 */
public class HouseInfoDetailsServiceTest extends BaseTest {

    @Autowired
    IHouseInfoDetailsService service;
    @Autowired
    ICompanyService companyService;
    @Autowired
    HouseInfoDetailsMapper mapper;

    @Test
    public void getByIdTest1() {
        String vhname = "总部大观3号地一期1号楼1单元 1813";
        List<HouseVO> houseVOs = service.getHouseInfoDetails(vhname);
        for (HouseVO houseVO : houseVOs) {
            System.out.println(houseVO);
        }
    }

    @Test
	public void test1() throws Exception {
		System.out.println(mapper.getAll().size());
	}
    
    @Test
    public void getAll() throws Exception {
        List<HouseVO> houseVOs = service.getBackAll();
        System.out.println(houseVOs.size());
    }

    @Test
    public void addHouseInfoDetailsTest() {
        RequesterVO req = new RequesterVO();
        req.setKey(LiandoServiceConstant.SERVICE_KEY);
        req.setBilltype(LiandoServiceConstant.DATA_TYPE_HOUSE);
        List<Company> list = companyService.getAll();

        for (Company company : list) {
            String pk_corp = company.getPkCorp();
            req.setPk_corp(pk_corp);
            String houseInfoDetailsStr = WebService.getBaseData(req);
            ResponseVO houseInfoDetailsResult = JsonUtils.jsonToPojo(houseInfoDetailsStr, ResponseVO.class);
            if ("Y".equals(houseInfoDetailsResult.getIssuccess()) && StringUtil.isEmpty(houseInfoDetailsResult.getErrorinfo())) {
                HouseVO[] housedata = houseInfoDetailsResult.getHousedata();
                for (HouseVO houseVO : housedata) {
                    service.addHouseInfoDetails(houseVO);
                }
            }

        }
    }
}

