package com.escalade.data.repository;

import com.escalade.data.model.Topo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TopoRepository extends CrudRepository<Topo, Integer> {


    Topo findByTopoId (int topoId);


    @Query(value="SELECT  * " +
            "FROM Topo t " +
            "INNER JOIN Utilisateur u ON u.utilisateur_id = t.utilisateur_id" +
                " WHERE username = ?1 ", nativeQuery = true)
    Iterable<Topo> findTry (String user);
}
