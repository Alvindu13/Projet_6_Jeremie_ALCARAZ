package com.escalade.svc.contracts;

import com.escalade.data.model.Way;

import java.util.List;

public interface WayService {

    Iterable<Way> listWay();

    List<Way> listWayBySecId(int sectorId);

    Way getCountWay(int sectorId);

}
