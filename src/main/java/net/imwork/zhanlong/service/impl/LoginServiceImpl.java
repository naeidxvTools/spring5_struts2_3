package net.imwork.zhanlong.service.impl;

import net.imwork.zhanlong.service.LoginService;

/**
 * @author Administrator
 */
public class LoginServiceImpl implements LoginService
{
    @Override
    public boolean isLogin(String username, String password)
    {
        if ("zhanlong".equalsIgnoreCase(username) && "m123".equalsIgnoreCase(password))
        {
            return true;
        }
        return false;
    }
}
