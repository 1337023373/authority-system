package com.hengheng.controller;

import com.hengheng.pojo.vo.UserVO;
import com.hengheng.service.UserService;
import com.hengheng.utils.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hengheng
 * @since 2024-10-27
 */
@RestController
@RequestMapping("/system/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    @ApiOperation(tags = "获取所有用户",value = "获取所有用户")
    public Result<List<UserVO>> getAll(){
        return Result.ok(userService.getAll());
    }

}
