package com.escalade.svc.contracts;

import com.escalade.data.model.Files;

public interface FilesService {

    void createFiles(Files f);
    Files getFilesByTopoId(int fileId);
}
