package com.escalade.svc.implementation;


import com.escalade.data.model.Files;
import com.escalade.data.repository.FileRepository;
import com.escalade.svc.contracts.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("filesService")
public class FilesServiceImpl implements FilesService {

    @Autowired
    FileRepository repo;


    @Override
    public void createFiles(Files f) {
        repo.save(f);
    }

    @Override
    public Files getFilesByTopoId(int topoId) {
        return repo.getFilesByTopoId(topoId);

    }
}
