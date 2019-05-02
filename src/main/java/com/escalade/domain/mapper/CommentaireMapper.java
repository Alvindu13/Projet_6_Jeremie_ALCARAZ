package com.escalade.domain.mapper;

import com.escalade.domain.model.Commentaire;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentaireMapper implements RowMapper<Commentaire> {

    public Commentaire mapRow(ResultSet rs, int rowNum) throws SQLException {

        Commentaire cmt = new Commentaire();
        cmt.setContent(rs.getString("content"));
        cmt.setUserName(rs.getString("utilisateur_username"));
        cmt.setId(rs.getInt("commentaire_id"));

        return cmt;
    }
}
