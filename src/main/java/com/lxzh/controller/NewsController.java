package com.lxzh.controller;

import com.lxzh.bean.ImageBean;
import com.lxzh.bean.New;
import com.lxzh.bean.Result;
import com.lxzh.service.NewService;
import com.lxzh.util.FileUtil;
import com.lxzh.util.UuidUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lijian
 * @create: 2019-09-28
 **/
@RestController
@RequestMapping("/news")
@Slf4j
public class NewsController {
    @Autowired
    private NewService newService;

    @RequestMapping("/addNews")
    public Result addNews(New news) {
        log.info(news.toString());
        String id = UuidUtil.createID();
        news.setId(id);
        ImageBean imageBean = FileUtil.uploadImage(news.getFile());
        imageBean.setForeignId(id);
        newService.addNews(news,imageBean);
        return new Result("0","新增成功");

    }
    @RequestMapping("/newsList")
    public Object newsList(New news) {
        return newService.listNews(news);
    }
    @RequestMapping("/newsDetail")
    public New getNewsDetail(New news) {
       return newService.getNewDetail(news);
    }


}
