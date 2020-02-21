package com.lxzh.service;


import com.lxzh.bean.ImageBean;
import com.lxzh.bean.New;

/**
 * @description:
 * @author: lijian
 * @create: 2019-09-29
 **/
public interface NewService {
    //    新增新闻
    void addNews(New news, ImageBean imageBean);
    //查询新闻列表
    Object listNews(New news);
    //    查询新闻详情
    New getNewDetail(New news);
}
