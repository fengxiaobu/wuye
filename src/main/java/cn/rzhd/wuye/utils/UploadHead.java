package cn.rzhd.wuye.utils;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class UploadHead {

	//上传头像
	public static String uploadPic(MultipartFile file,HttpServletRequest request){
		String path = request.getSession().getServletContext().getRealPath("/upload") ;
		String originName = file.getOriginalFilename() ;
		if(originName.contains(".")){
			String end = originName.substring(originName.indexOf(".")) ;
			String filename = IDUtils.genImageName()+end ;
			File file1 = new  File(path) ;
			if(!file1.exists()){
				file1.mkdirs() ; //创建文件夹
			}
			File fileupload = new File(file1, filename) ;
			try {
				file.transferTo(fileupload);
				return "upload/"+filename ;
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "false" ;	
	}
	
	//上传baner图
	public static String uploadPic(MultipartFile file,String filePath,HttpServletRequest request){
		String path = request.getSession().getServletContext().getRealPath("/"+filePath) ;
		String originName = file.getOriginalFilename() ;
		if(originName.contains(".")){
			String end = originName.substring(originName.indexOf(".")) ;
			String filename = IDUtils.genImageName()+end ;
			File file1 = new  File(path) ;
			if(!file1.exists()){
				file1.mkdirs() ; //创建文件夹
			}
			File fileupload = new File(file1, filename) ;
			try {
				file.transferTo(fileupload);
				return filePath+"/"+filename ;
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "false" ;	
	}
}
