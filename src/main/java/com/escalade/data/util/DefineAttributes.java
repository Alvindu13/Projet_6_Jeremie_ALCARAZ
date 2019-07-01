package com.escalade.data.util;

import com.escalade.data.model.Topo;
import com.escalade.data.repository.FileRepository;
import com.escalade.data.repository.TopoRepository;
import com.escalade.svc.contracts.FilesService;
import com.escalade.svc.contracts.TopoService;

import java.util.ArrayList;

public class DefineAttributes {

    public Iterable<Integer> defineDownload(TopoService topoService, FileRepository filesService) {

        Iterable<Integer> h = new ArrayList<Integer>();

        Iterable<Topo> test2 = topoService.getAllTopo();


        for (Topo topo : test2) {

            if (filesService.existsAllByTopoId(topo.getTopoId())) {
                ((ArrayList<Integer>) h).add(topo.getTopoId());
            }
        }

        return h;
    }
}
