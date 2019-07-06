package com.escalade.svc.implementation;

import com.escalade.data.model.Sector;
import com.escalade.data.repository.SectorRepository;
import com.escalade.svc.contracts.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SectorService")
public class SectorServiceImpl implements SectorService {


    @Autowired
    private SectorRepository repo;

    public void createSector(Sector s) {repo.save(s);}

    public Sector getSector(String name) {
        return null;
    }

    public long getCountSector(int siteId) { return repo.getCountBySiteId(siteId); }

    public Iterable<Sector> listSector(int siteId) {
        return repo.findAllBySiteId(siteId);
    }
}
