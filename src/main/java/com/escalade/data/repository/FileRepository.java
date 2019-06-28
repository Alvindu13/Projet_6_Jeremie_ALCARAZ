package com.escalade.data.repository;

import com.escalade.data.model.Files;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FileRepository extends CrudRepository<Files, Integer > {

    Files getFilesById(int fileId);


}
