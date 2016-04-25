package com.mfja.service;

import com.mfja.domain.MfjaAuthUser;;

public interface MfjaAuthUserService {  	

	public MfjaAuthUser user(MfjaAuthUser user);
	
	public MfjaAuthUser selectLogin(String username);

	public MfjaAuthUser getUserById(int i);

	public MfjaAuthUser selectByPrimaryKey(int i);
	
	public MfjaAuthUser getUserByusername(String username);
	
	public int inster(MfjaAuthUser user);
	
	public Boolean getLoginUser(MfjaAuthUser user);

}