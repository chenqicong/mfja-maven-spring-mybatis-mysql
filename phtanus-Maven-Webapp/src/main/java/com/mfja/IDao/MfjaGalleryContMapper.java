package com.mfja.IDao;

import com.mfja.domain.MfjaGalleryCont;

public interface MfjaGalleryContMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MfjaGalleryCont record);

    int insertSelective(MfjaGalleryCont record);

    MfjaGalleryCont selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MfjaGalleryCont record);

    int updateByPrimaryKeyWithBLOBs(MfjaGalleryCont record);

    int updateByPrimaryKey(MfjaGalleryCont record);
}