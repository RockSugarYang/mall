package com.yzb.mall.impl;

import com.yzb.mall.dto.BrandRespDTO;
import com.yzb.mall.service.BrandService;
import com.yzb.mall.tunnel.database.PmsBrandDOMapper;
import com.yzb.mall.tunnel.database.dataobject.PmsBrandDO;
import com.yzb.mall.tunnel.database.dataobject.PmsBrandDOExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private PmsBrandDOMapper pmsBrandDOMapper;

    @Override
    public List<BrandRespDTO> listAllBrand() {
        List<PmsBrandDO> list = pmsBrandDOMapper.selectByExample(new PmsBrandDOExample());
        List<BrandRespDTO> resp = list.stream().map(v->{
            BrandRespDTO model = new BrandRespDTO();
            model.setId(v.getId());
            model.setName(v.getName());
            return model;
        }).collect(Collectors.toList());
        return resp;
    }
}
