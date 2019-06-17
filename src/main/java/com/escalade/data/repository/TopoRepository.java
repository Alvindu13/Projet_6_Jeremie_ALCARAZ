package com.escalade.data.repository;

import com.escalade.data.model.Topo;
import org.springframework.data.repository.CrudRepository;

public interface TopoRepository extends CrudRepository<Topo, Integer> {


    Topo findByTopoId (int topoId);
    Iterable<Topo> findAllByUserName (String user);
}
