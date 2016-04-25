package com.mfja.IDao;

import com.mfja.domain.MfjaGallery;

public interface MfjaGalleryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MfjaGallery record);

    int insertSelective(MfjaGallery record);

    MfjaGallery selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MfjaGallery record);

    int updateByPrimaryKey(MfjaGallery record);
}