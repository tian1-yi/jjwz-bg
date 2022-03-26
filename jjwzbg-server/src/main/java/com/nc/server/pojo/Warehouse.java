package com.nc.server.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 仓库表
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_warehouse")
@ApiModel(value="Warehouse对象", description="仓库表")
public class Warehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "邮编")
    private String postcode;

    @ApiModelProperty(value = "联系电话")
    private String phone;

    @ApiModelProperty(value = "联系人名字")
    private String name;

    @ApiModelProperty(value = "仓库名称")
    private String title;

    @ApiModelProperty(value = "县id")
    private Integer countyId;

    @TableField(exist = false)
    @ApiModelProperty(value = "县")
    private County county;

    @TableField(exist = false)
    @ApiModelProperty(value = "市")
    private City city;

    @TableField(exist = false)
    @ApiModelProperty(value = "省")
    private Province province;

    @TableField(exist = false)
    @ApiModelProperty(value = "管理员")
    private AdminInfo admin;

}
