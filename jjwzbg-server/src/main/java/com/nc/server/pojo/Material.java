package com.nc.server.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lzc
 * @since 2022-04-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_material")
@ApiModel(value="Material对象", description="")
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    @TableField("measure_id")
    private Integer measureId;


    @TableField("small_id")
    private Integer smallId;



    private BigDecimal price;

    private String remark;

    private String size;

    @TableField(exist = false)
    private Integer stId;

    @TableField(exist = false)
    private Integer btId;

    @TableField(exist = false)
    private Integer meId;

    @TableField(exist = false)
    private String stName;

    @TableField(exist = false)
    private String btName;

    @TableField(exist = false)
    private String meName;

    @TableField(exist = false)
    private Long count;

    @TableField(exist = false)
    private Long max;

    @TableField(exist = false)
    private Long min;

    @TableField(exist = false)
    private BigDecimal wprice;

    @TableField(exist = false)
    private Integer wmid;

}
