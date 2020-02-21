package com.lxzh.mapper;


import com.lxzh.bean.ImageBean;
import com.lxzh.bean.New;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: lijian
 * @create: 2019-09-29
 **/
public interface NewsMapper {
//    新增新闻
    void addNews(New news);
    //图片
    void insertImage(ImageBean imageBean);
//查询新闻列表
    List<Map> listNews(New news);
//    查询新闻详情
    New getNewDetail(New news);
}
