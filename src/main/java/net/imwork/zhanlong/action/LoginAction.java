package net.imwork.zhanlong.action;

import com.opensymphony.xwork2.ActionSupport;
import net.imwork.zhanlong.service.LoginService;

/**
 * @author Administrator
 */
public class LoginAction extends ActionSupport
{
    private String username;
    private String password;

    private LoginService service;

    public void setService(LoginService service)
    {
        this.service = service;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String execute() throws Exception
    {
        if (service.isLogin(username, password))
        {
            return SUCCESS;
        }
        return ERROR;
    }
}
