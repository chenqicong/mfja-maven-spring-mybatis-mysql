package com.mfja.controller;

import java.util.List;
import java.util.Map;
//import java.util.HashMap;




import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;


import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;




import com.mfja.domain.MfjaGallery;
import com.mfja.service.MfjaGalleryService;

// Result enum class import
import com.lib.enumLib.ResStatusEnum;

@Controller
@RequestMapping("/gallery")
public class MfjaGalleryController {
	
	@Resource(name="MfjaGalleryServiceImpl")
	public MfjaGalleryService mfjaGalleryService;
	
	@ResponseBody
	@RequestMapping(value="list.do", method = RequestMethod.POST)
	public Map<String, Object> galleryList(HttpServletRequest request, Model model){
		int counter = Integer.parseInt(request.getParameter("counter"));
		int page = Integer.parseInt(request.getParameter("page"));
		int size = Integer.parseInt(request.getParameter("size"));
		int type = Integer.parseInt(request.getParameter("type"));
		
		int startPos = (page-1)* size;
		
		List<MfjaGallery> gallery = this.mfjaGalleryService.selectGalleryList(type, startPos, size);
		ResStatusEnum.ErrStatus.SUCCESS.setRes();
		
		ResStatusEnum.ErrRes.RES.setErrRes(gallery);
		return ResStatusEnum.ErrRes.RES.getValue();
		
	}

}
