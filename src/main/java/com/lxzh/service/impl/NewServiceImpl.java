package com.lxzh.service.impl;

import com.lxzh.aspect.Paginate;
import com.lxzh.bean.ImageBean;
import com.lxzh.bean.New;
import com.lxzh.mapper.NewsMapper;
import com.lxzh.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: lijian
 * @create: 2019-09-29
 **/
@Transactional
@Service
public class NewServiceImpl implements NewService {
    @Autowired
    private NewsMapper newsMapper;
    @Override
    public void addNews(New news, ImageBean imageBean) {
        newsMapper.addNews(news);
        newsMapper.insertImage(imageBean);

    }

    @Override
    @Paginate
    public Object listNews(New news) {
        return newsMapper.listNews(news);
    }

    @Override
    public New getNewDetail(New news) {
        return newsMapper.getNewDetail(news);
    }
}
