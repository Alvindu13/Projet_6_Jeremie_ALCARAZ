package com.escalade.domain.dao.contract;

import com.escalade.domain.model.image.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

public interface IImageDao {

    public void saveImage(String name, byte[] imgBytes) throws IOException;
    public Image getImageByName(String name);
    public Image getImageById(int id);
    public List<Image> getAllImages();

}
