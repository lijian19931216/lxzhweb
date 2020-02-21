package com.lxzh.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: lijian
 * @create: 2019-09-29
 **/
public class PathUtils {
    public static String getContexPath(HttpServletRequest request){
        return request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()
                +request.getContextPath();
    }
}
