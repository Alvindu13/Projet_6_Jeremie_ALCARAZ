package com.escalade.domain.dao.impl;

import com.escalade.domain.dao.contract.ISiteDao;
import com.escalade.domain.dao.mapper.SiteMapper;
import com.escalade.domain.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;


@Repository
@Transactional
public class SiteDao extends JdbcDaoSupport implements ISiteDao {


    @Autowired
    public SiteDao (DataSource datasource1) {
        this.setDataSource(datasource1);
    }


    public void createSite(String name, int topo_id, String location, String comment) {
        String SQL = "insert into Site (comment, topo_id, name, location ) values (?, ?, ?, ?)";
        this.getJdbcTemplate().update( SQL, comment, 2, name, location);
        return;
    }

    public Site getSite(String name) {
        return null;
    }

    public List<Site> listSite() {
        String SQL = "select * from Site";
        List<Site> sites = this.getJdbcTemplate().query(SQL, new SiteMapper());
        return sites;
    }
}
