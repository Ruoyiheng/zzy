package com.yuyou.zizaiyou.article.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Data
@TableName("destination")
public class Destination implements Serializable {
    @TableId(type= IdType.AUTO)
    private Long id;
    private String name;        //名称
    private String english;  //英文名
    private Long parentId; //上级目的地
    private String parentName;  //上级目的名
    private String info;    //简介
    private String coverUrl;
    @TableField(exist = false)
    private List<Destination> children = new ArrayList<>();
}