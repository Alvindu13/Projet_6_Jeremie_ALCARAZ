package com.escalade.data.repository;

import com.escalade.data.model.Topo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface TopoRepository extends CrudRepository<Topo, Integer> {


    Topo findByTopoId (int topoId);


    @Query(value="SELECT  * " +
            "FROM Topo t " +
            "INNER JOIN Utilisateur u ON u.utilisateur_id = t.utilisateur_id" +
                " WHERE username = ?1 ", nativeQuery = true)
    Iterable<Topo> findAllByUser (String user);


    @Query(value="SELECT t FROM Topo t WHERE " +
            "       t.available LIKE :x")
    Page<Topo> findAllByAvailableIsTrue(@Param("x") Boolean available, Pageable pageable);


    @Query(value="SELECT * FROM Topo " +
            " WHERE available = ?1", nativeQuery = true)
    List<Topo> blabla(Boolean available);


    @Modifying
    @Transactional
    @Query(value="UPDATE topo "+
            "SET available = ?1 "+
            "WHERE "+
            " ctid IN ( "+
            "   SELECT t.ctid FROM topo t "+
            "   LEFT JOIN utilisateur u ON t.utilisateur_id = u.utilisateur_id "+
            "WHERE u.username=?2 AND t.name=?3 "+ ")",nativeQuery=true)
    void setAvalaibleTopo(Boolean avalaible, String user, String name);

    /*@Modifying
    @Transactional
    @Query(value = "Update topo t \n" +
            "set available = ?1 " +
            "FROM utilisateur u " +
            "WHERE utilisateur_id = t.utilisateur_id ", nativeQuery = true)
    void setTest(Boolean avalaible, int userId);*/
}
