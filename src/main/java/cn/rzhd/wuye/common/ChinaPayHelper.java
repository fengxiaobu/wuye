package cn.rzhd.wuye.common;

import cn.rzhd.wuye.utils.StringTimeUtil;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * luopa 在 2017/6/9 创建.
 *
 * chinaPay支付帮助类
 */
public class ChinaPayHelper {

    public RequestVO getSign(RequestVO requestVO) throws IOException {
        Properties properties = PropertiesLoaderUtils.loadAllProperties("payconfig.properties");
        requestVO.setVersion(properties.getProperty("pay.Version"));
        requestVO.setMerId(properties.getProperty("pay.MerId"));
        requestVO.setAccessType(properties.getProperty("pay.AccessType"));
        requestVO.setBusiType(properties.getProperty("pay.BusiType"));
        requestVO.setCurryNo(properties.getProperty("pay.CurryNo"));
        requestVO.setMerPageUrl(properties.getProperty("pay.MerPageUrl"));
        requestVO.setMerBgUrl(properties.getProperty("pay.MerBgUrl"));
        requestVO.setPayTimeOut(properties.getProperty("pay.PayTimeOut"));
        requestVO.setTranType(properties.getProperty("pay.TranType"));

        Date date = new Date();
        String tranDate = StringTimeUtil.TranDate(date);
        String tranTime = StringTimeUtil.TranTime(date);
        requestVO.setTimeStamp(StringTimeUtil.TimeStamp(date));
        requestVO.setTranDate(tranDate);
        requestVO.setTranTime(tranTime);
        return requestVO;
    }


}
