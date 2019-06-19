package com.escalade.svc.implementation;

import com.escalade.data.repository.TopoRepository;
import com.escalade.data.model.Topo;
import com.escalade.svc.contracts.TopoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("topoService")
public class TopoServiceImpl implements TopoService {

    @Autowired
    private TopoRepository repo;

    public void createTopo(Topo t) {
        repo.save(t);
     }

    public Topo getTopoByName(String name) {//Topo topo = dao.getTopoByName(name);
        return null;
    }

    public Topo getTopoById(int topo_id) {//Topo topo = dao.getTopoById(topo_id);
        return repo.findByTopoId(topo_id);
    }

    public Iterable<Topo> listTopo() {

        return repo.findAll();
    }

    public Iterable<Topo> listTopoByUser(String user) {

        return repo.findAllByUser(user);
    }

    public void updateTopo(Boolean avalaible, String user, String name) {
        repo.setAvalaibleTopo(avalaible, user, name);
    }

    @Override
    public Page<Topo> findAllTopoByAvailable(Pageable pageable) {
         return repo.findAllByAvailableIsTrue(pageable);
    }



    /*public List<Topo> listTopo() {



        //List<Topo> topos = dao.listTopo();

        return null;
    }*/
}

