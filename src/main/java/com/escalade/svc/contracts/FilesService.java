package com.escalade.svc.contracts;

import com.escalade.data.model.Files;

import java.util.List;

public interface FilesService {

    void createFiles(Files f);
    Files getFilesByTopoId(int fileId);
    Boolean existsAllByTopoId(int topoId);


    //Iterable<Files> getAllFiles();
}
