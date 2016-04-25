package com.mfja.controller;

import java.util.Map;
//import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;

import com.mfja.domain.MfjaAuthUser;
import com.mfja.service.MfjaAuthUserService;

// Result enum class import
import com.lib.enumLib.ResStatusEnum;


@Controller
@RequestMapping("/user")
public class MfjaAuthUserController {
	
	@Resource(name="mfjaAuthUserServiceImpl")
	private MfjaAuthUserService mfjaAuthUserService;
	
	public MfjaAuthUserService getUserService() {
		return mfjaAuthUserService;
	}
	
	public void setUserService(MfjaAuthUserService mfjaAuthUserService) {
		this.mfjaAuthUserService = mfjaAuthUserService;
	}
	
	@ResponseBody
	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	public Map<String, Object> loginIndex(HttpServletRequest request, Model model) {
		MfjaAuthUser userLogin=new MfjaAuthUser();
		
		
//		String un = request.getParameter("username");
//		String pw = request.getParameter("password");
		userLogin.setUsername(request.getParameter("username"));
		userLogin.setPassword(request.getParameter("password"));
		
		MfjaAuthUser user=new MfjaAuthUser();
		
		if(this.mfjaAuthUserService.getLoginUser(userLogin)){
			user=this.mfjaAuthUserService.getUserByusername(userLogin.getUsername());
			ResStatusEnum.ErrStatus.SUCCESS.setRes();
		}else{
			user=null;
		}
		ResStatusEnum.ErrRes.RES.setErrRes(user);
		return ResStatusEnum.ErrRes.RES.getValue();
	}
	
	@RequestMapping(value="/register.do", method=RequestMethod.POST)
	public String registerIndex(HttpServletRequest request, Model model) {
		MfjaAuthUser userRegister=new MfjaAuthUser();
		String un = request.getParameter("username");
		String pw = request.getParameter("password");
		userRegister.setUsername(un);
		userRegister.setPassword(pw);
		System.out.println(un + "ÃÜÂëÊÇ" + pw);
		
		if(userRegister.getUsername()!=null) {
			if(request.getParameter("userAlias")==null) {
				userRegister.setUseralias("Åº¾ý");
			}else{
				userRegister.setUseralias(String.valueOf(request.getParameter("userAlias")));
			}
			System.out.println(userRegister.getUsername() + "ÏÔÊ¾×¢²áÃû×Ö");
			int id = this.mfjaAuthUserService.inster(userRegister);
			MfjaAuthUser user=this.mfjaAuthUserService.getUserById(id);
			model.addAttribute("user", user);
		}else{
			model.addAttribute("username can not be null");
		}
		return "indexuser";
	}

}
