package com.nc.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 用户仓库中间表表
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_warehouse_admin")
@ApiModel(value="WarehouseAdmin对象", description="用户仓库中间表表")
public class WarehouseAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户id")
    @TableField("admin_id")
    private Integer adminId;

    @ApiModelProperty(value = "仓库id")
    @TableField("warehouse_id")
    private Integer warehouseId;


}
