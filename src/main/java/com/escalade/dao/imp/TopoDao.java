package com.escalade.dao.imp;

import com.escalade.dao.contract.ITopoDao;
import com.escalade.mapper.TopoMapper;
import com.escalade.mapper.UtilisateurMapper;
import com.escalade.model.Topo;
import com.escalade.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;


@Repository
@Transactional
public class TopoDao extends JdbcDaoSupport implements ITopoDao {


    @Autowired
    public TopoDao(DataSource datasource1) {
        this.setDataSource(datasource1);
    }


    public void createTopo(String userName, String name, Integer nbSite, Integer nbSector, Boolean available) {
        String SQL = "insert into Topo (userName, name, nbSite, nbSector, available ) values (?, ?, ?, ?, ?)";
        this.getJdbcTemplate().update( SQL, userName, name, nbSite, nbSector, available);
        return;
    }

    public Topo getTopo(String name) {
        String SQL = "select * from Topo where name = ?";
        Topo topo = this.getJdbcTemplate().queryForObject(SQL, new Object[]{name}, new TopoMapper());
        return topo;
    }

    public List<Topo> listTopo() {
        return null;
    }
}
