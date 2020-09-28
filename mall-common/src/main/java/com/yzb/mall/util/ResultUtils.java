package com.yzb.mall.util;


import com.yzb.mall.constant.MessageConstant;
import com.yzb.mall.dto.RespResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/**
 * web返回结果辅助类
 */
public class ResultUtils {

    /**
     * 返回成功结果
     * @param data  单个MODEL结果
     * @param <MODEL> 单个类型
     * @param <MODELS> 多个类型
     * @return RespResult
     */
    public static <MODEL,MODELS> RespResult<MODEL,MODELS> success(MODEL data) {
        RespResult<MODEL,MODELS> result=new RespResult<>();
        result.setMessage(MessageConstant.CALL_SUCCESS);
        result.setModel(data);
        result.setModels(null);
        result.setSuccess(true);
        return result;
    }

    /**
     * 返回成功结果
     * @param dataList 多个MODELS结果
     * @param <MODEL> 单个类型
     * @param <MODELS> 多个类型
     * @return RespResult
     */
    public static <MODEL,MODELS> RespResult<MODEL,MODELS> success(List<MODELS> dataList) {
        RespResult<MODEL,MODELS> result=new RespResult<>();
        result.setMessage(MessageConstant.CALL_SUCCESS);
        result.setModel(null);
        result.setModels(dataList);
        result.setSuccess(true);
        return result;
    }

    /**
     * 返回成功结果
     * @param data  单个MODEL结果
     * @param dataList 多个MODELS结果
     * @param <MODEL> 单个类型
     * @param <MODELS> 多个类型
     * @return RespResult
     */
    public static <MODEL,MODELS> RespResult<MODEL,MODELS> success(MODEL data, List<MODELS> dataList) {
        RespResult<MODEL,MODELS> result=new RespResult<>();
        result.setMessage(MessageConstant.CALL_SUCCESS);
        result.setModel(data);
        result.setModels(dataList);
        result.setSuccess(true);
        return result;
    }

    /**
     * 返回成功结果
     * @param dataList 多个MODELS结果
     * @param total 合计
     * @param <MODEL> 单个类型（没用）
     * @param <MODELS> 多个类型
     * @return RespResult
     */
    public static <MODEL,MODELS> RespResult<MODEL,MODELS> success(List<MODELS> dataList, int total) {
        RespResult<MODEL,MODELS> result=new RespResult<>();
        result.setMessage(MessageConstant.CALL_SUCCESS);
        result.setModels(dataList);
        result.setTotal(total);
        result.setSuccess(true);
        return result;
    }


    /**
     * 返回成功结果
     * @param model model结果
     * @param dataList 多个MODELS结果
     * @param total 合计
     * @param <MODEL> 单个类型（没用）
     * @param <MODELS> 多个类型
     * @return RespResult
     */
    public static <MODEL,MODELS> RespResult<MODEL,MODELS> success(MODEL model,List<MODELS> dataList, int total) {
        RespResult<MODEL,MODELS> result=new RespResult<>();
        result.setMessage(MessageConstant.CALL_SUCCESS);
        result.setModel(model);
        result.setModels(dataList);
        result.setTotal(total);
        result.setSuccess(true);
        return result;
    }


    /**
     * 返回成功结果
     * @param model model结果
     * @param dataList 多个MODELS结果
     * @param <MODEL> 单个类型（没用）
     * @param <MODELS> 多个类型
     * @return RespResult
     */
    public static <MODEL,MODELS> RespResult<MODEL,MODELS> success(MODEL model, Map extra, List<MODELS> dataList) {
        RespResult<MODEL,MODELS> result=new RespResult<>();
        result.setMessage(MessageConstant.CALL_SUCCESS);
        result.setModel(model);
        result.setExtValues(extra);
        result.setModels(dataList);
        result.setSuccess(true);
        return result;
    }

    /**
     * 列表数据返回，处理分页信息
     * @param countFunc  计算合计值
     * @param queryListFunc 用于计算合计的集合
     * @param <MODEL> 返回单个对象的泛型
     * @param <MODELS> 返回多个对象的泛型
     * @return ResultVO<MODEL,MODELS>
     */
    public static<MODEL,MODELS>  RespResult<MODEL,MODELS> success(Supplier<Integer> countFunc, Supplier<List<MODELS>> queryListFunc){
        Integer total = (null != countFunc) ? countFunc.get() : 0;
        List<MODELS> data = (total > 0) ? queryListFunc.get() : new ArrayList<>();
        return success(data, total);
    }

    /**
     * 返回出错信息
     * @param msg 错误信息
     * @param <MODEL> 返回单个对象的泛型
     * @param <MODELS> 返回多个对象的泛型
     * @return ResultVO<MODEL,MODELS>
     */
    public static<MODEL,MODELS> RespResult<MODEL,MODELS> fail(String msg){
        RespResult<MODEL,MODELS> result=new RespResult<>();
        result.setMessage(msg);
        result.setSuccess(false);
        return result;
    }

    /**
     * 单纯告诉前端后端执行成功,不返回任何数据
     * @return
     */
    public static RespResult success() {
        RespResult result = new RespResult();
        result.setSuccess(true);
        return result;
    }

}
