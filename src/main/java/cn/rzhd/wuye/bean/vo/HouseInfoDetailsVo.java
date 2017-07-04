package cn.rzhd.wuye.bean.vo;

import cn.rzhd.wuye.bean.HouseInfoDetails;

/**
 * @ClassName HouseInfoDetailsVo
 * @Description 房产信息返回页面对象
 * @author qinjuncai
 * @Date 2017年7月4日 下午8:19:38
 * @version 1.0.0
 */
public class HouseInfoDetailsVo extends HouseInfoDetails{
    
    /**
     * @Field @serialVersionUID : TODO
     */
    private static final long serialVersionUID = 1L;
    
    //客户名称
    private String vcname;

    
    public String getVcname() {
        return vcname;
    }

    
    public void setVcname(String vcname) {
        this.vcname = vcname;
    }
    
    
}
