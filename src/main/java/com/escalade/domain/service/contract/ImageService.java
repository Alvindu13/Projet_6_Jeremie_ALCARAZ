package com.escalade.domain.service.contract;

import com.escalade.domain.model.image.Image;

import java.util.List;

public interface ImageService {

    public void saveImage();
    public Image getImageByName(String name);
    public Image getImageById(int id);
    public List<Image> getAllImage();
    //public List<String> getAllImgData();


}
