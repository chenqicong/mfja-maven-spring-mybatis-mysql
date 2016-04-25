package com.mfja.service.impl;

//import java.util.HashMap;
//import java.util.Map;
//
//import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfja.IDao.MfjaAuthUserMapper;
import com.mfja.domain.MfjaAuthUser;
import com.mfja.service.MfjaAuthUserService;


@Service("mfjaAuthUserServiceImpl")
public class MfjaAuthUserServiceImpl implements MfjaAuthUserService {
	
	@Autowired
	private MfjaAuthUserMapper mfjaAuthUserDao;
	
	public MfjaAuthUser getUserById(int id) {
		System.out.println(id+this.mfjaAuthUserDao.selectId(id).getUsername());
		return this.mfjaAuthUserDao.selectId(id);
	}
	
	public Boolean getLoginUser(MfjaAuthUser userLogin) {
		if (userLogin.getUsername().equals("")||(userLogin.getPassword().equals(""))){
			return false;
		}else{
			MfjaAuthUser user=new MfjaAuthUser();
			if(this.mfjaAuthUserDao.selectLogin(userLogin.getUsername())!=null){
				user=mfjaAuthUserDao.selectLogin(userLogin.getUsername());
				if(user.toString().isEmpty()){
					return false;
				}else{
					if(user.getPassword().equals(userLogin.getPassword())){
						return true;
					}else{
						return false;
					}
				}
			}else{
				return false;
			}
		}
	}
	
	public MfjaAuthUser user(MfjaAuthUser user) {
		return null;
	}
	
	public MfjaAuthUser selectLogin(String username) {
		return this.mfjaAuthUserDao.selectLogin(username);
	}
	
	public MfjaAuthUser selectByPrimaryKey(int id) {
		return this.mfjaAuthUserDao.selectByPrimaryKey(id);
	}
	
	public MfjaAuthUser getUserByusername(String username) {
		// TODO Auto-generated method stub
		return this.mfjaAuthUserDao.selectLogin(username);
	}


	public int inster(MfjaAuthUser user) {
		// TODO Auto-generated method stub
		int i=this.mfjaAuthUserDao.insert(user);
		return i;
	}
	
}
