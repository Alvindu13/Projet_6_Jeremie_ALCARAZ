package com.escalade.svc.implementation;

import com.escalade.data.repository.ImageRepository;
import com.escalade.data.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service("imageService")
public class ImageServiceImpl {


    @Autowired
    private ImageRepository repo;

    public void saveImage(MultipartFile img) throws IOException {
        //byte[] imgBytes = img.getBytes();
        //dao.saveImage(img.getName(), imgBytes);
    }

    public Image getImageByName(String name) {
        return null;
    }

    public Image getImageById(int id) {
        //Image img = dao.getImageById(id);
        //return img;
        return null;
    }

    public List<Image> getAllImage() {
        //List<Image> imgs = dao.getAllImages();
        //return imgs;
        return null;
    }

    /*public List<String> getAllImgData() {
        List<Image> imgs = dao.getAllImages();
        //List<byte[]> dataOLD = new ArrayList<byte[]>();
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
