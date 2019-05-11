package com.escalade.domain.model.image;

import org.springframework.security.crypto.codec.Base64;

public class Image {

    private String name;
    private byte[] imgDataB;
    private String imgDataS;

    public Image() {super(); }

    public Image(String name, byte[] imgDataB, String imgDataS) {
        this.name = name;
        this.imgDataB = imgDataB;
        this.imgDataS = imgDataS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImgDataB() {
        return imgDataB;
    }

    public void setImgDataB(byte[] imgDataB) {
        this.imgDataB = imgDataB;
    }

    public String getImgDataS() {
        byte[] encoded = Base64.encode(this.getImgDataB());
        imgDataS = new String(encoded);
        return imgDataS;
    }

    public void setImgDataS(String imgDataS) {
        this.imgDataS = imgDataS;
    }
}
