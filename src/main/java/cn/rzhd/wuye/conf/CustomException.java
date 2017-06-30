package cn.rzhd.wuye.conf;
/**
 * @ClassName CustomException
 * @Description 把前端控制器异常交给异常处理器来处理预期异常
 * @author qinjuncai
 * @Date 2017年6月30日 下午3:47:53
 * @version 1.0.0
 */
public class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//异常信息
    public String message;
    
    public CustomException (String message){
    	super(message);
    	this.message = message;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
