package com.escalade.svc.contracts;

import com.escalade.data.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ImageService {

    public void saveImage(Image img) throws IOException;
    public Image getImageByName(String name);
    public Image getImageById(int id);
    public Iterable<Image> getAllImage();
    //public List<String> getAllImgData();


}
