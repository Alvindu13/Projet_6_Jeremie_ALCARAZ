package com.escalade.data.model;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "FILES")
public class Files {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "FILE_ID")
    private int id;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "FILE_DATA")
    private byte[] data;

    public Files() {
    }

    public Files(String fileName, byte[] data) {
        this.fileName = fileName;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
