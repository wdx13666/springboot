package com.wdx.springbootmybatisplus.controller;

import com.wdx.springbootmybatisplus.entity.SysUser;
import com.wdx.springbootmybatisplus.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wdx
 * @since 2019-06-19
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

/*

    @Autowired
    private SysUserService sysUserService;
*/

    @Autowired
    private SysUserMapper sysUserMapper;

    @GetMapping
    public SysUser hello(){
        SysUser byId = sysUserMapper.selectById(1);
        return byId;
    }



}

