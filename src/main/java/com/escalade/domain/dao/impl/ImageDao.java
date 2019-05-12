package com.escalade.domain.dao.impl;

import com.escalade.domain.dao.contract.IImageDao;
import com.escalade.domain.dao.mapper.ImageMapper;
import com.escalade.domain.model.image.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Types;
import java.util.List;
import java.util.Vector;

@Repository
@Transactional
public class ImageDao extends JdbcDaoSupport implements IImageDao {



    @Autowired
    public ImageDao(DataSource datasource1) {
        this.setDataSource(datasource1);
    }


    public void saveImage(String name, byte[] content) {
        String SQL = "INSERT INTO image (nom, content) VALUES (?, ?)";
        this.getJdbcTemplate().update(SQL, name, content);
        return;
    }

    public Image getImageByName(String name) {
        return null;
    }

    public Image getImageById(int id) {
        String SQL = "select * from Image where image_id = ?";
        Image img = this.getJdbcTemplate().queryForObject(SQL, new Object[]{id}, new ImageMapper());
        return img;
    }

    public List<Image> getAllImages() {
        String SQL = "select * from image";
        List<Image> imgs = this.getJdbcTemplate().query(SQL, new ImageMapper());
        return imgs;
    }
}
