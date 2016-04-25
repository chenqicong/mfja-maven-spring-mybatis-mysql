package com.mfja.service;

import java.util.List;

import com.mfja.domain.MfjaGallery;


public interface MfjaGalleryService {
	
	public MfjaGallery gallery(MfjaGallery gallery);
	
	public MfjaGallery selectGallery(int id);
	
	public MfjaGallery selectGalleryDtl(int id);
	
	public List<MfjaGallery> selectGalleryList(int type, int startPos, int limit);
	
	public MfjaGallery selectGalleryByTitle(String title);
	
}
