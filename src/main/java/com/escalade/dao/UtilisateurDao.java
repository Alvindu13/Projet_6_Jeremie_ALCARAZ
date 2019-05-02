package com.escalade.dao;


import com.escalade.mapper.UtilisateurMapper;
import com.escalade.model.Utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;


@Repository
@Transactional
public class UtilisateurDao extends JdbcDaoSupport implements IUtilisateurDao {


    private Utilisateur utilisateur;
    private UtilisateurDao utilisateurDao;



    @Autowired
    public UtilisateurDao(DataSource datasource1) {
        this.setDataSource(datasource1);
    }

    public void create(String username, String firstName, String lastName, String password, Integer nbTopo) {
        String SQL = "insert into Utilisateur (username, firstName, lastName, password, nbTopo ) values (?, ?, ?, ?, ?)";
        this.getJdbcTemplate().update( SQL, username, firstName, lastName, password, nbTopo);
        return;
    }

    public Utilisateur getUtilisateur(String username) {
        String SQL = "select * from Utilisateur where username = ?";
        Utilisateur utilisateur = this.getJdbcTemplate().queryForObject(SQL, new Object[]{username}, new UtilisateurMapper());
        return utilisateur;
    }

    public List<Utilisateur> listUtilisateur() {
        String SQL = "select * from Utilisateur";
        List<Utilisateur> utilisateurs = this.getJdbcTemplate().query(SQL, new UtilisateurMapper());
        return utilisateurs;
    }


    /*
     * Utilisation de Spring JdbcTemplate pour r�cup�rer un com.escalade.AUTRES.Employe (non-Javadoc)
     *
     * @see com.objis.dao.com.escalade.AUTRES.EmployeDao#findEmploye(long)
     */
    public Utilisateur getEmployeByUserName(String username) {

        String SQL = "select * from Utilisateur where username = ?";
        Utilisateur utilisateur = this.getJdbcTemplate().queryForObject(SQL, new Object[]{username}, new UtilisateurMapper());
        return utilisateur;
    }

    /* public void delete(String username) {
        String SQL = "delete from Utilisateur where username = ?";
        jdbcTemplateObject.update(SQL, username);
        System.out.println("Supprimer l'utilisateur avec le username = " + username );
        return;
    }

    public void update(String username, Integer nbTopo) {
        String SQL = "update Utilisateur set nbTopo = ? where username = ?";
        jdbcTemplateObject.update(SQL, nbTopo, username);
        System.out.println("Modification du nb de topo de l'utilisateur  = " + nbTopo );
        return;
    }


    public List<Utilisateur> recupererUtilisateurs() {
        return null;

    }*/

}
