package cn.rzhd.wuye.common;

import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.*;
import com.github.pagehelper.StringUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/7/9.
 * 上传ERP公共类
 */
public class UpdateToERP {
    /**
     *
     * @param list 根据付款记录ID查询得出的费用数据
     * @param id    付款记录ID
     * @param type  LiandoServiceConstant.DATA_TYPEXXXXXXX(物业费/开发费)
     * @return
     */
    public static Map<String,String> updateToERP(List<FeeVO> list,String type) {
        Map<String,String> result = new HashMap();
        String billid = null;
        String billno = null;
        FeeVO[] temp = new FeeVO[list.size()];
        FeeVO[] data = list.toArray(temp);
        RequesterVO req = new RequesterVO();
        req.setKey(LiandoServiceConstant.SERVICE_KEY);
        req.setBilltype(type);
        req.setFeedata(data);
        req.setPk_corp(data[0].getPk_corp());
        String recieve = WebService.msgRecieve(req);
        cn.rzhd.wuye.vo.ResponseVO resp = JsonUtils.jsonToPojo(recieve, cn.rzhd.wuye.vo.ResponseVO.class);
        if("Y".equals(resp.getIssuccess()) && StringUtil.isEmpty(resp.getErrorinfo())){
            billid = resp.getBillid();
            billno = resp.getBillno();
            result.put("billid",billid);
            result.put("billno",billno);
        }
        return result;
    }
}
