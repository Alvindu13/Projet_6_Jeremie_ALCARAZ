package com.escalade.domain.service.contract;

import com.escalade.domain.model.Topo;

import java.util.List;

public interface TopoService {

    public void createTopo(Topo t);
    public Topo getTopoByName(String name);
    public Topo getTopoById(int topo_id);
    public List<Topo> listTopo();
}
