package com.escalade.domain.dao.impl;

import com.escalade.domain.dao.contract.ITopoDao;
import com.escalade.domain.model.Topo;
import com.escalade.domain.dao.mapper.TopoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;


@Repository
@Transactional
public class TopoDao extends JdbcDaoSupport implements ITopoDao {


    @Autowired
    public TopoDao(DataSource datasource1) {
        this.setDataSource(datasource1);
    }


    public void createTopo(String userName, String name, Integer nbSite, Integer nbSector, Boolean available) {
        String SQL = "insert into Topo (utilisateur_username, name, nbSite, nbSector, available ) values (?, ?, ?, ?, ?)";
        this.getJdbcTemplate().update( SQL, userName, name, nbSite, nbSector, available);
        return;
    }

    public Topo getTopo(String name) {
        String SQL = "select * from Topo where name = ?";
        Topo topo = this.getJdbcTemplate().queryForObject(SQL, new Object[]{name}, new TopoMapper());
        return topo;
    }


    public List<Topo> listTopo() {
        String SQL = "select * from Topo";
        List<Topo> topos = this.getJdbcTemplate().query(SQL, new TopoMapper());
        return topos;
    }

    public List<Map<String, Object>> getList(){
        return this.getJdbcTemplate().queryForList("select * from Topo");
    }
}
