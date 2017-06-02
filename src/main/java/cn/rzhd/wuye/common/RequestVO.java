package cn.rzhd.wuye.common;

/**
 * luopa 在 2017/6/1 创建.
 */
public class RequestVO {

    //版本号
    private String Version;
    // 接入类型
    private String AccessType;
    // 接入机构号
    private String InstuId;
    // 收单机构号
    private String AcqCode;
    // 商户号
    private String MerId;
    // 商户订单号
    private String MerOrderNo;
    // 商户交易日期
    private String TranDate;
    //商户交易时间
    private String TranTime;
    // 订单金额
    private String OrderAmt;
    // 交易类型
    private String TranType;
    // 业务类型
    private String BusiType;
    // 交易币种
    private String CurryNo;
    // 分账类型
    private String SplitType;
    // 分账方式
    private String SplitMethod;
    // 分账信息
    private String MerSplitMsg;
    // 支付机构号
    private String BankInstNo;
    // 商户前台通知地址
    private String MerPageUrl;
    // 商户后台通知地址
    private String MerBgUrl;
    //  商品信息
    private String CommodityMsg;
    //商户私有域
    private String MerResv;
    // 交易扩展域
    private String TranReserved;
    // 有卡交易信息域
    private String CardTranData;
    // 支付超时时间
    private String PayTimeOut;
    // 防钓鱼时间戳
    private String TimeStamp;
    // 防钓鱼客户浏览器IP
    private String RemoteAddr;
    // 风控数据
    private String RiskData;
    // 签名
    private String Signature;

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getAccessType() {
        return AccessType;
    }

    public void setAccessType(String accessType) {
        AccessType = accessType;
    }

    public String getInstuId() {
        return InstuId;
    }

    public void setInstuId(String instuId) {
        InstuId = instuId;
    }

    public String getAcqCode() {
        return AcqCode;
    }

    public void setAcqCode(String acqCode) {
        AcqCode = acqCode;
    }

    public String getMerId() {
        return MerId;
    }

    public void setMerId(String merId) {
        MerId = merId;
    }

    public String getMerOrderNo() {
        return MerOrderNo;
    }

    public void setMerOrderNo(String merOrderNo) {
        MerOrderNo = merOrderNo;
    }

    public String getTranDate() {
        return TranDate;
    }

    public void setTranDate(String tranDate) {
        TranDate = tranDate;
    }

    public String getTranTime() {
        return TranTime;
    }

    public void setTranTime(String tranTime) {
        TranTime = tranTime;
    }

    public String getOrderAmt() {
        return OrderAmt;
    }

    public void setOrderAmt(String orderAmt) {
        OrderAmt = orderAmt;
    }

    public String getTranType() {
        return TranType;
    }

    public void setTranType(String tranType) {
        TranType = tranType;
    }

    public String getBusiType() {
        return BusiType;
    }

    public void setBusiType(String busiType) {
        BusiType = busiType;
    }

    public String getCurryNo() {
        return CurryNo;
    }

    public void setCurryNo(String curryNo) {
        CurryNo = curryNo;
    }

    public String getSplitType() {
        return SplitType;
    }

    public void setSplitType(String splitType) {
        SplitType = splitType;
    }

    public String getSplitMethod() {
        return SplitMethod;
    }

    public void setSplitMethod(String splitMethod) {
        SplitMethod = splitMethod;
    }

    public String getMerSplitMsg() {
        return MerSplitMsg;
    }

    public void setMerSplitMsg(String merSplitMsg) {
        MerSplitMsg = merSplitMsg;
    }

    public String getBankInstNo() {
        return BankInstNo;
    }

    public void setBankInstNo(String bankInstNo) {
        BankInstNo = bankInstNo;
    }

    public String getMerPageUrl() {
        return MerPageUrl;
    }

    public void setMerPageUrl(String merPageUrl) {
        MerPageUrl = merPageUrl;
    }

    public String getMerBgUrl() {
        return MerBgUrl;
    }

    public void setMerBgUrl(String merBgUrl) {
        MerBgUrl = merBgUrl;
    }

    public String getCommodityMsg() {
        return CommodityMsg;
    }

    public void setCommodityMsg(String commodityMsg) {
        CommodityMsg = commodityMsg;
    }

    public String getMerResv() {
        return MerResv;
    }

    public void setMerResv(String merResv) {
        MerResv = merResv;
    }

    public String getTranReserved() {
        return TranReserved;
    }

    public void setTranReserved(String tranReserved) {
        TranReserved = tranReserved;
    }

    public String getCardTranData() {
        return CardTranData;
    }

    public void setCardTranData(String cardTranData) {
        CardTranData = cardTranData;
    }

    public String getPayTimeOut() {
        return PayTimeOut;
    }

    public void setPayTimeOut(String payTimeOut) {
        PayTimeOut = payTimeOut;
    }

    public String getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        TimeStamp = timeStamp;
    }

    public String getRemoteAddr() {
        return RemoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        RemoteAddr = remoteAddr;
    }

    public String getRiskData() {
        return RiskData;
    }

    public void setRiskData(String riskData) {
        RiskData = riskData;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }
}
