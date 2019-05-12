package com.escalade.domain.dao.mapper;

import com.escalade.domain.model.Site;
import com.escalade.domain.model.image.Image;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.crypto.codec.Base64;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImageMapper implements RowMapper<Image> {


    public Image mapRow(ResultSet rs, int rowNum) throws SQLException {
        Image img = new Image();
        img.setName(rs.getString("nom"));
        img.setImgDataB(rs.getBytes("content"));
        return img;
    }

}


