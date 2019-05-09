package com.escalade.domain.service.contract;

import com.escalade.domain.model.Topo;

import java.util.List;

public interface TopoService {

    public void createTopo(Topo t);
    public Topo getTopo(String name);
    public List<Topo> listTopo();
}
