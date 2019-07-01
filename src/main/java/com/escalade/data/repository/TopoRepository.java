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

    Page<Topo> findAllByUserCurrentProprio(Integer currentUser, Pageable pageable);

    Page<Topo> findAll(Pageable pageable);



    @Query(value="SELECT  t.*" +
            "FROM Topo t " +
            "INNER JOIN Utilisateur u ON u.utilisateur_id = t.utilisateur_id" +
                " WHERE username = ?1 ORDER BY ?#{#pageable}",

            countQuery = "SELECT count(*) \n" +
                    "FROM Topo t " +
                    "INNER JOIN Utilisateur u ON u.utilisateur_id = t.utilisateur_id" +
                    " WHERE username = ?1 ",

            nativeQuery = true)
    Page<Topo> findAllByUser (String user, Pageable pageable);


    @Query(value="SELECT t FROM Topo t " +
            " WHERE t.available = ?1")
    Page<Topo> getAllByAvailableIsTrue(Boolean available, Pageable pageable);


    @Modifying
    @Transactional
    @Query(value="UPDATE topo "+
            "SET available = ?1 "+
            "WHERE "+
            " ctid IN ( "+
            "   SELECT t.ctid FROM topo t "+
            "   LEFT JOIN utilisateur u ON t.utilisateur_id = u.utilisateur_id "+
            "WHERE u.username=?2 AND t.topo_id=?3 "+ ")",nativeQuery=true)
    void setAvalaibleTopo(Boolean avalaible, String user, Integer topoId);


    @Modifying
    @Transactional
    @Query(value="UPDATE topo "+
            "SET available = ?1, u.username = ?1 "+
            "WHERE "+
            " ctid IN ( "+
            "   SELECT t.ctid FROM topo t "+
            "   LEFT JOIN utilisateur u ON t.utilisateur_id = u.utilisateur_id "+
            "WHERE u.username = ?1 AND t.topo_id = ?2 "+ ")",nativeQuery=true)
    void setUnvailableTopo(Boolean available, String user, Integer topoId);

    @Modifying
    @Transactional
    @Query(value="UPDATE topo "+
            "SET currently_user_id = ?1 "+
            "WHERE topo_id = ?2", nativeQuery = true)
    void setTopoUserNameByUserId(Integer userId, Integer topoId);



    @Modifying
    @Transactional
    @Query(value="UPDATE topo "+
            "SET available = ?1 "+
            "WHERE topo_id = ?2", nativeQuery = true)
    void setTopoUnvailableById(Boolean unvailable, Integer topoId);



    @Modifying
    @Transactional
    @Query(value="UPDATE topo "+
            "SET reserve = ?1 "+
            "WHERE topo_id = ?2", nativeQuery = true)
    void setTopoReserveUserIdByTopoId(Boolean reserve, Integer topoId);






    //void saveFile(UploadFile uploadFile);







}
