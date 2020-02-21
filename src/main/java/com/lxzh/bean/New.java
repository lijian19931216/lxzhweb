package com.lxzh.bean;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description:
 * @author: lijian
 * @create: 2019-09-29
 **/
@Data
public class New extends BaseBean {
    private String id;
    private String title;
    private String time ;
    private String content;
    private int type;

    /**
     * 封面图：图片表的id
     */
    private String image;
    private MultipartFile file;
    private String descInfo;
}
