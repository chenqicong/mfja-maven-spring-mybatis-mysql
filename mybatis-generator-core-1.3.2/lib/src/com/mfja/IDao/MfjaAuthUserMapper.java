package com.mfja.IDao;

import com.mfja.domain.MfjaAuthUser;

public interface MfjaAuthUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MfjaAuthUser record);

    int insertSelective(MfjaAuthUser record);

    MfjaAuthUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MfjaAuthUser record);

    int updateByPrimaryKey(MfjaAuthUser record);
}