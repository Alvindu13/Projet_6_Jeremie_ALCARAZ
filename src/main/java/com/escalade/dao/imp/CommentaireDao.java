package com.escalade.dao.imp;

import com.escalade.dao.contract.ICommentaireDao;
import com.escalade.mapper.CommentaireMapper;
import com.escalade.mapper.UtilisateurMapper;
import com.escalade.model.Commentaire;
import com.escalade.model.Topo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
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

    public void saveCommentaire(String topoName, String content, String userName) {
        String SQL = "insert into Commentaire (topoName, content, userName) values (?, ?, ?)";
        this.getJdbcTemplate().update( SQL, topoName, content, userName);
        return;
    }

    public Commentaire getCommentaireById(Integer commentaire_id) {
        String SQL = "select * from Commentaire where commentaire_id = ?";
        Commentaire cmt = this.getJdbcTemplate().queryForObject(SQL, new Object[]{commentaire_id}, new CommentaireMapper());
        return cmt;
    }
}
