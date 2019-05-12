package com.escalade.domain.dao.contract;

import com.escalade.domain.model.image.Image;

import java.util.List;
import java.util.Vector;

public interface IImageDao {

    public void saveImage(String name, byte[] content);
    public Image getImageByName(String name);
    public Image getImageById(int id);
    public List<Image> getAllImages();

}
