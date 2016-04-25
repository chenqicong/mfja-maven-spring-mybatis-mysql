package com.mfja.service.impl;


//import java.util.HashMap;
//import java.util.Map;
//
//import javax.annotation.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfja.IDao.MfjaGalleryMapper;
import com.mfja.domain.MfjaGallery;
import com.mfja.service.MfjaGalleryService;



@Service("MfjaGalleryServiceImpl")
public class MfjaGalleryServiceImpl implements MfjaGalleryService {
	
	@Autowired
	private MfjaGalleryMapper mfjaGallerydao;
	
	public MfjaGallery gallery(MfjaGallery gallery){
		return null;
	}
	
	public MfjaGallery selectGallery(int id){
		return null;
	}
	
	public MfjaGallery selectGalleryDtl(int id){
		return null;
	}
	
	public List<MfjaGallery> selectGalleryList(int type, int startPos, int limit){
		if (type == 0){
			return this.mfjaGallerydao.selectGallyList(startPos, limit);
		}else{
			return this.mfjaGallerydao.selectGallyListByType(type, startPos, limit);
		}
	}
	
	public MfjaGallery selectGalleryByTitle(String title){
		return null;
	}

}
