package com.escalade.dao;


import com.escalade.mapper.UtilisateurMapper;
import com.escalade.model.Utilisateur;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UtilisateurDao implements IUtilisateurDao {


    private Utilisateur utilisateur;
    private UtilisateurDao utilisateurDao;
    private ClassPathXmlApplicationContext appContext;


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    public void create(String username, String firstName, String lastName, String password, Integer nbTopo) {
        String SQL = "insert into Utilisateur (username, firstName, lastName, password, nbTopo ) values (?, ?, ?, ?, ?)";
        jdbcTemplate.update( SQL, username, firstName, lastName, password, nbTopo);
        System.out.println("Enregistrement des utilisateurs :  \n" + "-" + "username : " + username + ", Firstname = " + firstName + ", Lastname = " + lastName + ", Password = " + password + ", nbTopo = " + nbTopo);
        return;
    }

    public Utilisateur getUtilisateur(String username) {
        String SQL = "select * from Utilisateur where username = ?";
        Utilisateur utilisateur = jdbcTemplate.queryForObject(SQL, new Object[]{username}, new UtilisateurMapper());
        return utilisateur;
    }

    public List<Utilisateur> listUtilisateur() {
        String SQL = "select * from Utilisateur";
        List<Utilisateur> utilisateurs = jdbcTemplate.query(SQL, new UtilisateurMapper());
        return utilisateurs;
    }


    /*
     * Utilisation de Spring JdbcTemplate pour r�cup�rer un com.escalade.AUTRES.Employe (non-Javadoc)
     *
     * @see com.objis.dao.com.escalade.AUTRES.EmployeDao#findEmploye(long)
     */
    public Utilisateur getEmployeByUserName(String username) {

        String SQL = "select * from Utilisateur where username = ?";
        Utilisateur utilisateur = jdbcTemplate.queryForObject(SQL, new Object[]{username}, new UtilisateurMapper());
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
