package com.escalade.domain.dao.mapper;

import com.escalade.domain.model.Site;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SiteMapper implements RowMapper<Site> {



    public Site mapRow(ResultSet rs, int rowNum) throws SQLException {
        Site s = new Site();
        s.setName(rs.getString("name"));
        s.setLocation(rs.getString("location"));
        s.setComment(rs.getString("comment"));

        return s;
    }

}

