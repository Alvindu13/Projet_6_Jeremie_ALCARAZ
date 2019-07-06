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

    @Override
    public void createTopo(Topo t) {
        repo.save(t);
     }

    @Override
    public Topo getTopoById(int topo_id) {//Topo topo = dao.getTopoById(topo_id);
        return repo.findByTopoId(topo_id);
    }

    @Override
    public Iterable<Topo> getAllTopo() {
        return repo.findAll();
    }

    @Override
    public Page<Topo> getAllTopo(Pageable pageable) {

        return repo.findAll(pageable);
    }

    @Override
    public Page<Topo> getAllByUserEscaladName(String userEscalad, Pageable pageable) {
        return repo.findAllByUserEscaladName(userEscalad, pageable);
    }

    @Override
    public void updateTopo(String action, Boolean reserve, String user, int topoId) {

        final Integer emptyUser = 0;
        final Boolean available = true;

        if(action.equals(",partager"))
        {
            System.out.println(topoId);
        }
        else if(action.equals(",liberer")){
            repo.setTopoReserveUserIdByTopoId(false, topoId);
            repo.setTopoUserNameByUserEscaladId(emptyUser, topoId);
        }

        repo.setTopoUnvailableById(true, topoId);


    }

    /*@Override
    public void updateTopoUnvailable(Boolean available, String userEscalad, int topoId) {
        repo.setUnvailableTopo(available, userEscalad, topoId);
    }*/


    @Override
    public Page<Topo> getAllByCurrentlyUserEscalad(Integer currentUserEscalad, Pageable pageable) {
        return repo.findAllByUserEscaladCurrentProprio(currentUserEscalad, pageable);
    }

    @Override
    public Page<Topo> getAllByAvailableIsTrue(Boolean available, Pageable pageable) {
        return repo.getAllByAvailableIsTrue(available, pageable);
    }

    @Override
    public void setTopoUserNameByUserEscaladId(Integer userEscaladId, Integer topoId) {
        repo.setTopoUserNameByUserEscaladId(userEscaladId, topoId);

    }

    @Override
    public void setTopoUnvailableById(Boolean unvailable, Integer topoId) {
        repo.setTopoUnvailableById(unvailable, topoId);

    }

    @Override
    public void setTopoReserveUserEscaladIdByTopoId(Boolean reserve, Integer topoId) {
        repo.setTopoReserveUserIdByTopoId(reserve,topoId);

    }

}

