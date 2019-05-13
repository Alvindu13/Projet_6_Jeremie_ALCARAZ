package com.escalade.domain.service.impl;

import com.escalade.domain.dao.impl.TopoDao;
import com.escalade.domain.model.Topo;
import com.escalade.domain.service.contract.TopoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("topoService")
public class TopoServiceImpl implements TopoService {

    @Autowired
    private TopoDao dao;

    public void createTopo(Topo t) {
        dao.createTopo(t.getUserName(), t.getName(), t.getNbSite(), t.getNbSector(), t.isAvailable());
    }

    public Topo getTopoByName(String name) {
        return null;
    }

    public Topo getTopoById(int topo_id) {
        Topo topo = dao.getTopoById(topo_id);
        return topo;
    }

    public List<Topo> listTopo() {

        List<Topo> topos = dao.listTopo();

        return topos;
    }
}

