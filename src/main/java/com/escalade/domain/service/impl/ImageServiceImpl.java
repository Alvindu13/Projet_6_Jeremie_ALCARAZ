package com.escalade.domain.service.impl;

import com.escalade.domain.dao.impl.ImageDao;
import com.escalade.domain.model.image.Image;
import com.escalade.domain.service.contract.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("imageService")
public class ImageServiceImpl implements ImageService {


    @Autowired
    private ImageDao dao;

    public void saveImage() {

    }

    public Image getImageByName(String name) {
        return null;
    }

    public Image getImageById(int id) {
        Image img = dao.getImageById(id);
        return img;
    }

    public List<Image> getAllImage() {
        List<Image> imgs = dao.getAllImages();
        return imgs;
    }

    /*public List<String> getAllImgData() {
        List<Image> imgs = dao.getAllImages();
        //List<byte[]> data = new ArrayList<byte[]>();
        List<String> dataString = new ArrayList<String>();
        byte[] encoded;

        for (Image img : imgs)
        {
            int i = 0;
            encoded = Base64.encode(img.getImgData());
            String encodedString = new String(encoded);
            dataString.add(i, encodedString);
            i++;

        }
        return dataString;
    }*/
}
