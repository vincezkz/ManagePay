package com.zkz.model;
import java.io.Serializable;
import java.util.Date;
public class User implements Serializable {
	private int id;  
    private String username;  
    private int islogin;  
    private String place;
    private Date createtime;
    private Date recentlogintime;
    private String password;
    public User() {}  
    
    
    public int getId() {  
        return id;  
    }  
  
    public void setId(int id) {  
        this.id = id;  
    }  
    
    public String getUsername() {  
        return username;  
    }  
  
    public void setUsername(String username) {  
        this.username = username;  
    } 
    
    public int getIslogin() {  
        return islogin;  
    }  
  
    public void setIslogin(int islogin) {  
        this.islogin = islogin;  
    } 
    
    public int getPlace() {  
        return islogin;  
    }  
  
    public void setPlace(String place) {  
        this.place = place;  
    }
    public Date getCreatetime() {  
        return createtime;  
    }  
  
    public void setCreatetime(Date createtime) {  
        this.createtime = createtime;  
    }
    
    public Date getRecentlogintime() {  
        return recentlogintime;  
    }  
  
    public void setRecentlogintime(Date recentlogintime) {  
        this.recentlogintime = recentlogintime;  
    }
    
    public String getPassword() {  
        return password;  
    }  
  
    public void setPassword(String password) {  
        this.password = password;  
    }
}
