package com.yzb.mall.controller;

import com.yzb.mall.co.BrandCO;
import com.yzb.mall.dto.BrandRespDTO;
import com.yzb.mall.dto.RespResult;
import com.yzb.mall.service.BrandService;
import com.yzb.mall.util.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Api("品牌管理")
@RestController
@RequestMapping("/brand")
public class PmsBrandController {

    @Autowired
    private BrandService brandService;

    @ApiOperation("获取所有品牌列表")
    @GetMapping(value = "listAll")
    public RespResult getBrandList() {
        List<BrandRespDTO> list = brandService.listAllBrand();
        List<BrandCO> result = list.stream().map(v->{
            BrandCO co = new BrandCO();
            co.setId(v.getId());
            co.setName(v.getName());
            return co;
        }).collect(Collectors.toList());
        return ResultUtils.success(result);
    }
}
