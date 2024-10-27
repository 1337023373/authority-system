package com.hengheng.service;

import com.hengheng.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hengheng.pojo.vo.UserVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hengheng
 * @since 2024-10-27
 */
public interface UserService extends IService<User> {

    /**
     * 获取所有用户
     * @return
     */
    List<UserVO> getAll();
}
