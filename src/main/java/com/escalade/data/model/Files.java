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

    @Column(name = "UTILISATEUR_ID")
    private Integer utilisateurId;

    @Column(name = "TOPO_ID")
    private Integer topoId;

    public Files() {
    }

    public Files(String fileName, byte[] data, Integer utilisateurId, Integer topoId) {
        this.fileName = fileName;
        this.data = data;
        this.utilisateurId = utilisateurId;
        this.topoId = topoId;
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

    public Integer getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(Integer utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public Integer getTopoId() {
        return topoId;
    }

    public void setTopoId(Integer topoId) {
        this.topoId = topoId;
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
