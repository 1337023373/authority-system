package com.hengheng.service.impl;

import cn.hutool.core.convert.Convert;
import com.hengheng.entity.User;
import com.hengheng.dao.UserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hengheng.pojo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hengheng
 * @since 2024-10-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements com.hengheng.service.UserService {

    /**
     * 获取所有用户
     *
     * @return
     */
    @Override
    public List<UserVO> getAll() {
        List<User> list = this.list();
        return list.stream().map(user -> Convert.convert(UserVO.class, user)).collect(Collectors.toList());
    }
}
