package uz.jsf.training.web.beans;

import java.io.Serializable;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named("user")
//@ManagedBean(name = "user")
@SessionScoped
public class UserBean implements Serializable {
    private String name = "";
    private String password;
    
    public String getName() {
        return name;
    }
    
    public void setName (String newName) {
        name = newName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String newPassword) {
        password = newPassword;
    }
    
    public String getGreeting() {
        if (name.length() == 0) return "";
        else return "Welcome to JSF2 + Ajax, " + name + "!";
    }
}
