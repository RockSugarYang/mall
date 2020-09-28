package com.yzb.mall.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public abstract class ClientObject implements Serializable {

    private Map<String, Object> extValues = new HashMap<String, Object>();

    public Object getExtField(String key){
        if(extValues != null){
            return extValues.get(key);
        }
        return null;
    }

    public void putExtField(String fieldName, Object value){
        this.extValues.put(fieldName, value);
    }
}
