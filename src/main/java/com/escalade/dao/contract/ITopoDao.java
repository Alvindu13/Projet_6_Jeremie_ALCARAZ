package com.escalade.dao.contract;

import com.escalade.model.Topo;
import com.escalade.model.Utilisateur;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

public interface ITopoDao {

    public void createTopo(String userName, String name, Integer nbSite, Integer nbSector, Boolean available);
    public Topo getTopo(String name);
    public List<Topo> listTopo();
}
