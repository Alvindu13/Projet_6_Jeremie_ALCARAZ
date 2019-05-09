package com.escalade.domain.service;

import com.escalade.domain.dao.service.impl.TopoDao;
import com.escalade.domain.model.Topo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.annotation.WebServlet;
import java.util.List;

@Service("topoService")
public class TopoServiceImpl implements TopoService{

    @Autowired
    private TopoDao topoDao;

    public void createTopo(Topo t) {
        topoDao.createTopo(t.getUserName(), t.getName(), t.getNbSite(), t.getNbSector(), t.isAvailable());
    }


    public Topo getTopo(String name) {
        return null;
    }

    public List<Topo> listTopo() {
        return null;
    }
}

