package com.escalade.dao.imp;

import com.escalade.dao.contract.ICommentaireDao;
import com.escalade.model.Topo;
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

    public void saveCommentaire(String topoName, String content, String userName) {
        String SQL = "insert into Commentaire (topoName, content, userName) values (?, ?, ?)";
        this.getJdbcTemplate().update( SQL, topoName, content, userName);
        return;
    }

    public Topo getCommentaire(int id) {
        return null;
    }
}
