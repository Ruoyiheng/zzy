package com.yuyou.zizaiyou.serveruser.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuyou.zizaiyou.domin.Userinfo;
import com.yuyou.zizaiyou.serveruser.mapper.UserinfoMapper;
import com.yuyou.zizaiyou.serveruser.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Oakley
* @description 针对表【userinfo】的数据库操作Service实现
* @createDate 2024-12-05 16:51:48
*/
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo>
    implements UserinfoService {

}



