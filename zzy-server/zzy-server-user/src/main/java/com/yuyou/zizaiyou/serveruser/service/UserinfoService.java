package com.yuyou.zizaiyou.serveruser.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuyou.zizaiyou.dto.RegInfo;
import com.yuyou.zizaiyou.po.Userinfo;

/**
* @author xa5fun
* @description 针对表【userinfo】的数据库操作Service
* @createDate 2024-12-05 16:51:48
*/
public interface UserinfoService extends IService<Userinfo> {

	/*
	 * @Author xa5fun
	 * @Description 根据手机号查询用户
	 * @Param [phone]
	 * @return com.yuyou.zizaiyou.domin.Userinfo
	 **/
	Userinfo getbyphone(String phone);

	/**
	 * @Author xa5fun
	 * @Description 用户注册
	 * @Param [regInfo]
	 * @return com.yuyou.zizaiyou.dto.RegInfo
	 **/
	void register(RegInfo regInfo);
}