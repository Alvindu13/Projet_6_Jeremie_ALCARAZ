package com.escalade.data.util;

import com.escalade.data.model.Site;
import com.escalade.data.model.Voie;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Collection {



    List<Object> object = new ArrayList<Object>();


    public List<Object> getBoth(List<Site> site,  List<Voie> voie)
    {

        object.addAll(site);
        object.addAll(voie);
        return object;
    }
}
