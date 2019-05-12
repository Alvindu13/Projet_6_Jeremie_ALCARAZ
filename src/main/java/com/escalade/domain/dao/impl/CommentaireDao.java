package com.escalade.domain.dao.impl;

import com.escalade.domain.dao.contract.ICommentaireDao;
import com.escalade.domain.model.Commentaire;
import com.escalade.domain.dao.mapper.CommentaireMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Repository
@Transactional
public class CommentaireDao extends JdbcDaoSupport implements ICommentaireDao {

    @Autowired
    public CommentaireDao(DataSource datasource1) {
        this.setDataSource(datasource1);
    }

    public void saveCommentaire(int topo_id, String content, String userName) {
        String SQL = "insert into Commentaire (topo_id, content, utilisateur_username) values ( ?, ?, ?)";
        //Modifier le 1 et mettre topo_id quand le défaut sera corrigé
        this.getJdbcTemplate().update( SQL, 1, content, userName);
        return;
    }

    public Commentaire getCommentaireById(Integer commentaire_id) {
        String SQL = "select * from Commentaire where commentaire_id = ?";
        Commentaire cmt = this.getJdbcTemplate().queryForObject(SQL, new Object[]{commentaire_id}, new CommentaireMapper());
        return cmt;
    }
}
