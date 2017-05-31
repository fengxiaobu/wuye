package cn.rzhd.wuye.vo;

import java.io.Serializable;
import java.util.Date;

/** webservice服务常量类
 * @author liudaoke
 *
 */
public class LiandoServiceConstant implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 秘钥 
	 */
	public static final String SERVICE_KEY = "liando";
	/**
	 * 公司
	 */
	public static final String DATA_TYPE_CORP = "CORP";
	/**
	 * 公司数据的上次查询时间
	 */
	public static Date CORP_LAST_TIME;
	/**
	 * 项目
	 */
	public static final String DATA_TYPE_PROJECT = "PROJECT";
	/**
	 * 房产
	 */
	public static final String DATA_TYPE_HOUSE = "HOUSE";
	/**
	 * 销售客户
	 */
	public static final String DATA_TYPE_SELL_CUSTOMER = "SELLCUST";
	/**
	 * 租赁客户
	 */
	public static final String DATA_TYPE_RENT_CUSTOMER = "RENTCUST";
	/**
	 * 开发公司费用
	 */
	public static final String DATA_TYPE_KF_FEE = "KFFEE";
	/**
	 * 物业公司费用
	 */
	public static final String DATA_TYPE_WY_FEE = "WYFEE";
	/**
	 * 开发公司入住费用
	 */
	public static final String DATA_TYPE_KF_RZ_FEE = "KFRZFEE";
	/**
	 * 物业公司入住费用
	 */
	public static final String DATA_TYPE_WY_RZ_FEE = "WYRZFEE";
	
	/**
	 * 销售合同
	 */
	public static final String DATA_TYPE_SIGN = "SIGN";
	/**
	 * 租赁合同
	 */
	public static final String DATA_TYPE_PACT = "PACT";
	/**
	 * 物业收款单
	 */
	public static final String DATA_TYPE_WY_RECEIPT = "WYSKD";
	/**
	 * 开发收款单
	 */
	public static final String DATA_TYPE_KF_RECEIPT = "KFSKD";
	/**
	 * 临时费用单
	 */
	public static final String DATA_TYPE_TEMP_RECEIPT = "LSFYD";
	/**
	 * 收费项目
	 */
	public static final String DATA_TYPE_FEE_TYPE = "SFXM";
	/**
	 * 银行账号
	 */
	public static final String DATA_TYPE_BANK_ACCOUNT = "YHZH";
	
	/**
	 * 发票信息
	 */
	public static final String DATA_TYPE_INVOICE = "FP";
	
	/**
	 * 数据源名称-测试环境有可能和正式环境不一样
	 */
//	public static final String DATA_SOURCE_NAME = "nc55";//正式系统叫 nc55
	
//	public static final String DATA_SOURCE_NAME = "ncd9088";
	public static final String DATA_SOURCE_NAME = "design";

	public static Date getCorpLastTime() {
		return CORP_LAST_TIME;
	}

	public static void setCorpLastTime(Date corpLastTime) {
		CORP_LAST_TIME = corpLastTime;
	}
}
