package com.escalade.svc.implementation;

import com.escalade.data.repository.TopoRepository;
import com.escalade.data.model.Topo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("topoService")
public class TopoServiceImpl  {

    @Autowired
    private TopoRepository repo;

    public void createTopo(Topo t) {
        repo.save(t);
     }

    public Topo getTopoByName(String name) {
        //Topo topo = dao.getTopoByName(name);
        return null;
    }

    public Topo getTopoById(int topo_id) {
        //Topo topo = dao.getTopoById(topo_id);
        return null;
    }

    public List<Topo> listTopo() {

        //List<Topo> topos = dao.listTopo();

        return null;
    }
}

