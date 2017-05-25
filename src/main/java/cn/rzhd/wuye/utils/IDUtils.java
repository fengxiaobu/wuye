package cn.rzhd.wuye.utils;

import java.util.Random;
import java.util.UUID;

/**
 * 各种id生成策略
 * <p>Title: IDUtils.java</p>
 * <p>Package com.irzhd.weiye.util </p>
 * <p>Description:  </p>
 * @author   qinjuncai   
 * @date     2016年7月14日 下午4:57:33 
 * @version  V1.0
 */
public class IDUtils {

	/**
	 * 图片名生成
	 */
	public static String genImageName() {
		//取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		//long millis = System.nanoTime();
		//加上三位随机数
		Random random = new Random();
		int end3 = random.nextInt(999);
		//如果不足三位前面补0
		String str = millis + String.format("%03d", end3);
		
		return str;
	}
	
	/**
	 * id生成32位
	 */
	public static String genId() {
		UUID uuid  = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}
	/**
	 * id生成
	 */
	public static String genId15() {
		//取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		//long millis = System.nanoTime();
		//加上两位随机数
		Random random = new Random();
		int end2 = random.nextInt(99);
		//如果不足两位前面补0
		return millis + String.format("%02d", end2);
	}
	
	public static void main(String[] args) {
		for(int i=0;i< 100;i++)
		System.out.println(genId15());
		/*UUID uuid  = UUID.randomUUID();
		String str = uuid.toString().replace("-", "");
		System.out.println(str+"leng="+str.length());*/
	}
}
