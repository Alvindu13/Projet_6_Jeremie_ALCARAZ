package com.escalade.domain.dao.contract;

import com.escalade.domain.model.Topo;

import java.util.List;

public interface ITopoDao {

    public void createTopo(String userName, String name, Integer nbSite, Integer nbSector, Boolean available);
    public Topo getTopoByName(String name);
    public Topo getTopoById(int topo_id);

    public List<Topo> listTopo();
}
