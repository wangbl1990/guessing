package com.mifan.guessingapi.request.order;

import com.mifan.guessingapi.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class MyOrderListRequest extends BaseRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private int pageNum;

    private int pageSize;
}
