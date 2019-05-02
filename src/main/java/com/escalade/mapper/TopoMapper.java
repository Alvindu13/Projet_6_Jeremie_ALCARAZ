package com.escalade.mapper;

import com.escalade.model.Topo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class TopoMapper implements RowMapper<Topo> {


    public Topo mapRow(ResultSet rs, int rowNum) throws SQLException {
        Topo topo = new Topo();
        topo.setName(rs.getString("name"));
        topo.setUserName(rs.getString("utilisateur_username"));
        topo.setNbSite(rs.getInt("nbsite"));
        topo.setNbSector(rs.getInt("nbsector"));
        topo.isAvailable(rs.getBoolean("available"));

        return topo;
    }

}
