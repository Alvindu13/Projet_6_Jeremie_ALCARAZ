package com.escalade.domain.dao.contract;

import com.escalade.domain.model.Topo;

import java.util.List;

public interface ITopoDao {

    public void createTopo(String userName, String name, Integer nbSite, Integer nbSector, Boolean available);
    public Topo getTopo(String name);
    public List<Topo> listTopo();
}
