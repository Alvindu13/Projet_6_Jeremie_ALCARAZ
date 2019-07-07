package com.escalade.svc.implementation;

import com.escalade.data.model.Way;
import com.escalade.data.repository.WayRepository;
import com.escalade.svc.contracts.WayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("WayService")
public class WayServiceImpl implements WayService {

    @Autowired
    private WayRepository repo;


    /**
     * Permeet de récupérer toutes les voies
     * @return une liste
     */
    @Override
    public Iterable<Way> listWay() {
        return repo.findAll();
    }

    /**
     * Permet de récupérer toutes les voies selon le secteur sélectionné
     * @param sectorId filtre
     * @return
     */
    @Override
    public List<Way> listWayBySecId(int sectorId) {
        return repo.findAllWayBySectorId(sectorId);
    }

    /**
     * Counter du total des voies
     * @param sectorId
     * @return
     */
    @Override
    public Way getCountWay(int sectorId) {
        return getCountWay(sectorId);
    }

    @Override
    public Page<Way> findAllBySectorId(Integer sectorId, Pageable pageable) {
        return repo.findAllBySectorId(sectorId, pageable);
    }

}
