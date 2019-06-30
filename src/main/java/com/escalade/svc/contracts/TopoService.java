package com.escalade.svc.contracts;

import com.escalade.data.model.Topo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TopoService {

    void createTopo(Topo t);
    Topo getTopoByName(String name);
    Topo getTopoById(int topo_id);
    Page<Topo> findAllTopo(Pageable pageable);
    Page<Topo> findAllByUserName(String user, Pageable pageable);
    void updateTopo(String action,Boolean reserve, String user, int topoId);
    void updateTopoUnvailable(Boolean available, String user, int topoId);
    Page<Topo> findAllByAvailableIsTrueOrderByAvailables(Boolean available, Pageable pageable);
    Page<Topo> findAllByCurrentlyUser(Integer currentUser, Pageable pageable);
    Long countAllTopo();

}
