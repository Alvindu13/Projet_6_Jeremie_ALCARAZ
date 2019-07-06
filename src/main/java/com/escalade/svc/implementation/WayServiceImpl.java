package com.escalade.svc.implementation;

import com.escalade.data.model.Way;
import com.escalade.data.repository.WayRepository;
import com.escalade.svc.contracts.WayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("WayService")
public class WayServiceImpl implements WayService {

    @Autowired
    private WayRepository repo;


    @Override
    public Iterable<Way> listWay() {
        return repo.findAll();
    }

    @Override
    public List<Way> listWayBySecId(int sectorId) {
        return repo.findAllWayBySectorId(sectorId);
    }

    @Override
    public Way getCountWay(int sectorId) {
        return getCountWay(sectorId);
    }

}
