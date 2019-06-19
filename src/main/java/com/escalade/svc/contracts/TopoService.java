package com.escalade.svc.contracts;

import com.escalade.data.model.Topo;

import java.util.List;

public interface TopoService {

    void createTopo(Topo t);
    public Topo getTopoByName(String name);
    public Topo getTopoById(int topo_id);
    //public List<Topo> listTopo();
    public Iterable<Topo> listTopo();
    public Iterable<Topo> listTopoByUser(String user);
    public void updateTopo(Boolean avalaible, String user, String name);

}
