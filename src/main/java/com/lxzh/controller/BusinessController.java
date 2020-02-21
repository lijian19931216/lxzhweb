package com.lxzh.controller;

import com.lxzh.bean.BusiBean;
import com.lxzh.bean.Result;
import com.lxzh.service.BusiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lijian
 * @create: 2019-10-11
 **/
@RestController
@RequestMapping("/busi")
@Slf4j
public class BusinessController {
    @Autowired
    private BusiService busiService;

    @RequestMapping("/addBusi")
    public Result addBusi(BusiBean busiBean) {
        log.info(busiBean.toString());
        busiService.addBusi(busiBean);
        return new Result("0","新增成功");
    }

    @RequestMapping("/busiDetail")
    public BusiBean getBusiDetail(BusiBean busiBean) {
        log.info(busiBean+"");
        return busiService.getBusiDetail(busiBean);
    }


}
