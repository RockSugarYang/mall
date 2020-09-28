package com.yzb.mall.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class RespResult<MODEL,MODELS> extends ClientObject{

    private boolean isSuccess;

    private String code = "0";

    private String message;

    private MODEL model;

    private List<MODELS> models;

    private Integer total;
}
