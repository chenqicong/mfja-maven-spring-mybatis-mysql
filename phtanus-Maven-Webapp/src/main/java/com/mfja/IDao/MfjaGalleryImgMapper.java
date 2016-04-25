package com.mfja.IDao;

import com.mfja.domain.MfjaGalleryImg;

public interface MfjaGalleryImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MfjaGalleryImg record);

    int insertSelective(MfjaGalleryImg record);

    MfjaGalleryImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MfjaGalleryImg record);

    int updateByPrimaryKey(MfjaGalleryImg record);
}