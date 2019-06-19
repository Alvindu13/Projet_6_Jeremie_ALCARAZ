package com.escalade.svc.contracts;

import com.escalade.data.model.Topo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TopoService {

    void createTopo(Topo t);
    Topo getTopoByName(String name);
    Topo getTopoById(int topo_id);
    Iterable<Topo> listTopo();
    Iterable<Topo> listTopoByUser(String user);
    void updateTopo(Boolean avalaible, String user, String name);
    List<Topo> findAllByAvailableIsTrueOrderByAvailables(Boolean available);

}
