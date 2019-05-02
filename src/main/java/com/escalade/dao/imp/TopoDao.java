package com.escalade.dao.imp;

import com.escalade.dao.contract.ITopoDao;
import com.escalade.model.Topo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import java.util.List;

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
        return null;
    }

    public List<Topo> listTopo() {
        return null;
    }
}
