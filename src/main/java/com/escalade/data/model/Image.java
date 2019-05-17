package com.escalade.data.model;

import org.springframework.security.crypto.codec.Base64;

import javax.persistence.*;

@Entity
@Table(name = "IMAGE")
public class Image {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "IMAGE_ID")
    private int imageId;

    @Column(name = "NOM")
    private String name;

    @Column(name = "CONTENT")
    private byte[] imgDataB;

    //private String imgDataS;

    public Image() {super(); }

    public Image(String name, byte[] imgDataB) {
        this.name = name;
        this.imgDataB = imgDataB;
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

    /*public String getImgDataS() {
        byte[] encoded = Base64.encode(this.getImgDataB());
        imgDataS = new String(encoded);
        return imgDataS;
    }

    public void setImgDataS(String imgDataS) {
        this.imgDataS = imgDataS;
    }*/
}
