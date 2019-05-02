package com.escalade.mapper;

import com.escalade.model.Topo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TopoMapper {


    public Topo mapRow(ResultSet rs, int rowNum) throws SQLException {
        Topo topo = new Topo();
        topo.setUserName(rs.getString("utilisateur_username"));
        topo.setName(rs.getString("name"));
        topo.setNbSite(rs.getInt("nbsite"));
        topo.setNbSector(rs.getInt("nbsector"));
        topo.isAvailable(rs.getBoolean("available"));

        return topo;
    }

}
