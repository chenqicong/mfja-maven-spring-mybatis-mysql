package com.mfja.IDao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mfja.domain.MfjaGallery;

public interface MfjaGalleryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MfjaGallery record);

    int insertSelective(MfjaGallery record);

    MfjaGallery selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MfjaGallery record);

    int updateByPrimaryKey(MfjaGallery record);
    
    List<MfjaGallery> selectGallyList(@Param("offset") Integer startPos, @Param("limit") Integer limit);
    
    List<MfjaGallery> selectGallyListByType(@Param("type") Integer type, @Param("offset") Integer startPos, @Param("limit") Integer limit);
}