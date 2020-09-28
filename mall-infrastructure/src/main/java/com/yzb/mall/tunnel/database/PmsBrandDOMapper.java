package com.yzb.mall.tunnel.database;

import com.yzb.mall.tunnel.database.dataobject.PmsBrandDO;
import com.yzb.mall.tunnel.database.dataobject.PmsBrandDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBrandDOMapper {
    long countByExample(PmsBrandDOExample example);

    int deleteByExample(PmsBrandDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsBrandDO record);

    int insertSelective(PmsBrandDO record);

    List<PmsBrandDO> selectByExampleWithBLOBs(PmsBrandDOExample example);

    List<PmsBrandDO> selectByExample(PmsBrandDOExample example);

    PmsBrandDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsBrandDO record, @Param("example") PmsBrandDOExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsBrandDO record, @Param("example") PmsBrandDOExample example);

    int updateByExample(@Param("record") PmsBrandDO record, @Param("example") PmsBrandDOExample example);

    int updateByPrimaryKeySelective(PmsBrandDO record);

    int updateByPrimaryKeyWithBLOBs(PmsBrandDO record);

    int updateByPrimaryKey(PmsBrandDO record);
}