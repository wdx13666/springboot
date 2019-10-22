
package com.wdx.springbootmybatisplus.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wdx.springbootmybatisplus.entity.SysUser;
import com.wdx.springbootmybatisplus.mapper.SysUserMapper;
import com.wdx.springbootmybatisplus.service.SysUserService;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wdx
 * @since 2019-06-19
 */

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}

