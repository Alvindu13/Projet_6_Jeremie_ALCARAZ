package com.escalade.svc.contracts;

import com.escalade.data.model.Topo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TopoService {

    void createTopo(Topo t);
    Topo getTopoByName(String name);
    Topo getTopoById(int topo_id);
    Iterable<Topo> getAllTopo();
    Page<Topo> getAllTopo(Pageable pageable);
    Page<Topo> getAllByUserName(String user, Pageable pageable);
    void updateTopo(String action,Boolean reserve, String user, int topoId);
    void updateTopoUnvailable(Boolean available, String user, int topoId);
   // Page<Topo> findAllByAvailableIsTrueOrderByAvailables(Boolean available, Pageable pageable);
    Page<Topo> getAllByCurrentlyUser(Integer currentUser, Pageable pageable);
    Page<Topo> getAllByAvailableIsTrue(Boolean available, Pageable pageable);
    void setTopoUserNameByUserId(Integer userId, Integer topoId);
    void setTopoUnvailableById(Boolean unvailable, Integer topoId);
    void setTopoReserveUserIdByTopoId(Boolean reserve, Integer topoId);

    Long countAllTopo();

}
