package com.mifan.guessingapi.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

@Data
@NoArgsConstructor
public class BaseRequest {

    @ApiModelProperty(  name = "userCode" , value = "用户Id token转换不涉及前段上送" , hidden = true )
    private String userCode;

    @ApiModelProperty(  name = "clinetIp" , value = "用户IP" ,hidden = true )
    private String clinetIp;

    @ApiModelProperty(  name = "deviceCode" , value = "用户设备编码" )
    @NotBlank(message = "用户设备编码不能为空")
    private String deviceCode;

    @ApiModelProperty(  name = "deviceType" , value = "用户设备类型" )
    @NotBlank(message = "用户设备类型不能为空")
    private String deviceType;

    @ApiModelProperty(  name = "version" , value = "应用版本" )
    @NotBlank(message = "应用版本不能为空")
    private String version;

}
