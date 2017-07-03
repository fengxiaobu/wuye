package cn.rzhd.wuye.conf;

import cn.rzhd.wuye.bean.Permission;
import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.service.IPermissionService;
import cn.rzhd.wuye.service.IUserService;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AuthRealm extends AuthorizingRealm {
    @Autowired
    private IUserService service;
    @Autowired
    private IPermissionService permissionService;


    /**
     * 此方法用于登录验证
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken utoken = (UsernamePasswordToken) token;//获取用户输入的token
        String username = utoken.getUsername();//获取token中输入的username
        Logger.getLogger(getClass()).info("身份认证成功，登录用户：" + username);
        User user = service.getByUsername(username);//通过用户名获取到密码
        //参数为
        // 1.通过username在数据库中查询到的user对象
        // 2.token中输入的密码
        // 3.自定义域的类名
        return new SimpleAuthenticationInfo(user, utoken.getPassword(), this.getClass().getName());//放入shiro.

    }

    /**
     * 此方法用于权限验证
     *
     * @param principal
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        User user = (User) principal.getPrimaryPrincipal();//从shiro中获取到登录的user
        List<String> permissions = new ArrayList<>();//准备一个集合接收权限的权限代码
        List<Permission> myPermissions = permissionService.getPermissionsByUser(user.getUsername());//获取登录user的所有权限
        if ("admin".equals(user.getUsername())) {//如果登录用户账号为admin,则赋予全部权限
            List<Permission> allPermissions = permissionService.getAllPermissions();//获取所有权限
            for (Permission permission : allPermissions)//遍历所有权限
                permissions.add(permission.getCode());//将所有权限的权限代码放入空集合
        } else {//如果登录用户账号不为username
            if (myPermissions.size() > 0) {//判断登录用户的权限数量
                for (Permission permission : myPermissions) {//将登录用户的权限遍历
                    permissions.add(permission.getCode());//将登录用户的权限的权限代码放入空集合
                }
            }
        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissions);//将权限放入shiro中.
        return info;
    }

}
