package com.escalade.domain.service.contract;

import com.escalade.domain.model.image.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ImageService {

    public void saveImage(MultipartFile img) throws IOException;
    public Image getImageByName(String name);
    public Image getImageById(int id);
    public List<Image> getAllImage();
    //public List<String> getAllImgData();


}
