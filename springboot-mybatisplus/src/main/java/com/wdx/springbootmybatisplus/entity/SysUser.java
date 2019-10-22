package com.wdx.springbootmybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wdx
 * @since 2019-06-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sf_sys_user")
public class SysUser extends Model<SysUser>   {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;
    /**
     * 账号
     */
    @TableField(value = "user_name")
    private String username;
    /**
     * 姓名
     */
    private String fullName;
    /**
     * 密码
     */
    private String password;
    /**
     * 盐
     */
    private String salt;
    /**
     * qq关联
     */
    private String openId;




    @Override
    protected Serializable pkVal() {
        return this.userId;
    }


}
