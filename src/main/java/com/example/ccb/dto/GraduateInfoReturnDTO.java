package com.example.ccb.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data //这样就可以省去麻烦的写属性的get，set，tostring方法
@ApiModel(value = "学校录入毕业信息后的返回")
public class GraduateInfoReturnDTO {
    @ApiModelProperty("录入的毕业信息Id")
    private Integer id;

    @ApiModelProperty(value = "证书编号")
    private String certificateNum;
}
