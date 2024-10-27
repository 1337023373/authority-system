package com.hengheng.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author hengheng
 * @since 2024-10-27
 */
@TableName("sys_department")
@ApiModel(value = "Department对象", description = "")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("部门编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("部门名称")
    private String departmentName;

    @ApiModelProperty("部门电话")
    private String phone;

    @ApiModelProperty("部门地址")
    private String address;

    @ApiModelProperty("所属部门编号")
    private Long pid;

    @ApiModelProperty("所属部门名称")
    private String parentName;

    @ApiModelProperty("排序")
    private Integer orderNum;

    @ApiModelProperty("是否删除(0-未删除 1-已删除)")
    private Byte isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Department{" +
            "id = " + id +
            ", departmentName = " + departmentName +
            ", phone = " + phone +
            ", address = " + address +
            ", pid = " + pid +
            ", parentName = " + parentName +
            ", orderNum = " + orderNum +
            ", isDelete = " + isDelete +
        "}";
    }
}
