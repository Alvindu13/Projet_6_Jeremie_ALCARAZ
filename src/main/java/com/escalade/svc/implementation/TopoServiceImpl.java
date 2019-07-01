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

    @Override
    public Iterable<Topo> getAllTopo() {
        return repo.findAll();
    }

    public Page<Topo> getAllTopo(Pageable pageable) {

        return repo.findAll(pageable);
    }

    public Page<Topo> getAllByUserName(String user, Pageable pageable) {

        return repo.findAllByUser(user, pageable);
    }

    public void updateTopo(String action, Boolean reserve, String user, int topoId) {

        final Integer emptyUser = 0;
        final Boolean available = true;

        if(action.equals(",partager"))
        {
            System.out.println(topoId);
        }
        else if(action.equals(",liberer")){
            repo.setTopoReserveUserIdByTopoId(false, topoId);
            repo.setTopoUserNameByUserId(emptyUser, topoId);
        }

        repo.setTopoUnvailableById(true, topoId);


    }

    @Override
    public void updateTopoUnvailable(Boolean available, String user, int topoId) {
        repo.setUnvailableTopo(available, user, topoId);
    }

   /* @Override
    public Page<Topo> findAllByAvailableIsTrueOrderByAvailables(Boolean available, Pageable pageable) {
        return repo.findAllByAvailableIsTrue(available, pageable);
    }*/

    @Override
    public Page<Topo> getAllByCurrentlyUser(Integer currentUser, Pageable pageable) {
        return repo.findAllByUserCurrentProprio(currentUser, pageable);
    }

    @Override
    public Page<Topo> getAllByAvailableIsTrue(Boolean available, Pageable pageable) {
        return repo.getAllByAvailableIsTrue(available, pageable);
    }

    @Override
    public void setTopoUserNameByUserId(Integer userId, Integer topoId) {
        repo.setTopoUserNameByUserId(userId, topoId);
    }

    @Override
    public void setTopoUnvailableById(Boolean unvailable, Integer topoId) {
        repo.setTopoUnvailableById(unvailable, topoId);

    }

    @Override
    public void setTopoReserveUserIdByTopoId(Boolean reserve, Integer topoId) {
        repo.setTopoReserveUserIdByTopoId(reserve,topoId);
    }

    @Override
    public Long countAllTopo() {
       return repo.count();
    }
}

