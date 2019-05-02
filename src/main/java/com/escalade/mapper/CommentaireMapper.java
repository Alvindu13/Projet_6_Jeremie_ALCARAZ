package com.escalade.mapper;

import com.escalade.model.Commentaire;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentaireMapper {

    public Commentaire mapRow(ResultSet rs, int rowNum) throws SQLException {
        Commentaire cmt = new Commentaire();
        cmt.setContent(rs.getString("content"));
        cmt.setUserName(rs.getString("utilisateur_username"));

        return cmt;
    }
}
