package com.escalade.data.repository;

import com.escalade.data.model.Files;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface FilesRepository extends CrudRepository<Files, Integer > {


    Boolean existsAllByTopoId(int topoId);

    Files getFilesByTopoId(int topoId);



    @Modifying
    @Transactional
    @Query(value="UPDATE files "+
            "SET file_data = ?1, "+
            "    file_name = ?2 " +
            "WHERE topo_id = ?3", nativeQuery = true)
    void updateFiles(byte[] data, String name, Integer topoId);


}
