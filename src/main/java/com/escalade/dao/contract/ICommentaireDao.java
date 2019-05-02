package com.escalade.dao.contract;

import com.escalade.model.Commentaire;

public interface ICommentaireDao {

    public void saveCommentaire(String topoName, String content, String userName);
    public Commentaire getCommentaireById(Integer commentaire_id);


}
