package com.mfja.domain;

import java.util.Date;
import java.util.List;

import com.mfja.domain.MfjaGalleryCont;

public class MfjaGallery {
    private Integer id;

    private String title;

    private String content;

    private Short type;

    private Date rectime;
    
    private List<MfjaGalleryCont> mfjaGalleryContList;
    
    private List<MfjaGalleryImg> mfjaGalleryImgList;
    
    public List<MfjaGalleryImg> getMfjaGalleryImgList() {  
        return mfjaGalleryImgList;  
    }
    
    public void setMfjaGalleryImgList(List<MfjaGalleryImg> mfjaGalleryImgList) {  
        this.mfjaGalleryImgList = mfjaGalleryImgList;  
    }
    
    public List<MfjaGalleryCont> getMfjaGalleryContList() {  
        return mfjaGalleryContList;  
    }
    
    public void setMfjaGalleryContsList(List<MfjaGalleryCont> mfjaGalleryContList) {  
        this.mfjaGalleryContList = mfjaGalleryContList;  
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Date getRectime() {
        return rectime;
    }

    public void setRectime(Date rectime) {
        this.rectime = rectime;
    }
}