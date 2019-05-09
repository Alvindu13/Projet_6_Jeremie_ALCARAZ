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
    private TopoDao topoDao;

    public void createTopo(Topo t) {
        topoDao.createTopo(t.getUserName(), t.getName(), t.getNbSite(), t.getNbSector(), t.isAvailable());
    }


    public Topo getTopo(String name) {
        return null;
    }

    public List<Topo> listTopo() {

        List<Topo> topos = topoDao.listTopo();

        return topos;
    }
}

