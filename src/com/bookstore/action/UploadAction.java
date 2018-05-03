
package com.bookstore.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;


public class UploadAction extends ActionSupport{
	  // 封装上传文件域的属性
    private File photo;
    // 封装上传文件类型的属性
    private String photoContentType;
    // 封装上传文件名的属性
    private String photoFileName;
    // 接受依赖注入的属性
    private String savePath;
    //将photo存放位置传给前台
    private String picture;
    public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	@Override
    public String execute() {
    	  FileOutputStream fos = null;
          FileInputStream fis = null;
          Reader reader=null;
          try {
              // 建立文件输出流
              Date date=new Date();
              SimpleDateFormat sdf=new SimpleDateFormat("HHmmssSSS");
             //找到后缀位置
              int index = getPhotoFileName().lastIndexOf('.');
              //获取后缀名
              String suffix=getPhotoFileName().substring(index,getPhotoFileName().length());
              //重命名文件
              setPhotoFileName(sdf.format(date)+suffix);
              fos = new FileOutputStream(getSavePath() + "\\" + getPhotoFileName());
              // 建立文件上传流
              fis = new FileInputStream(getPhoto());
              byte[] buffer = new byte[1024];
              int len = 0;
              while ((len = fis.read(buffer)) > 0) {
                  fos.write(buffer, 0, len);
              }
              
              System.out.println(getSavePath() + "\\" + getPhotoFileName());
              
              HttpSession session=ServletActionContext.getRequest().getSession();
              session.setAttribute("picture_upload", getPhotoFileName());
              addActionError("图片上传成功");
          } catch (Exception e) {
              System.out.println("文件上传失败");
              e.printStackTrace();
          } finally {
              close(fos, fis);
          }
          return SUCCESS;
      }

	

	public File getPhoto() {
		return photo;
	}



	public void setPhoto(File photo) {
		this.photo = photo;
	}



	public String getPhotoContentType() {
		return photoContentType;
	}

	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	public String getSavePath() {
		return ServletActionContext.getServletContext().getRealPath(savePath); 
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	private void close(FileOutputStream fos, FileInputStream fis) {
        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("FileInputStream关闭失败");
                e.printStackTrace();
            }
        }
        if (fos != null) {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("FileOutputStream关闭失败");
                e.printStackTrace();
            }
        }
	}

}