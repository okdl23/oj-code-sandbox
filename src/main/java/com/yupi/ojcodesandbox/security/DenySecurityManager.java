package com.yupi.ojcodesandbox.security;

import java.security.Permission;

/**
 * 禁用所有的安全管理器
 */
public class DenySecurityManager extends SecurityManager {

    //检查所有权限
    @Override
    public void checkPermission(Permission perm){
        throw new SecurityException("权限异常:" + perm.toString());
    }
}
