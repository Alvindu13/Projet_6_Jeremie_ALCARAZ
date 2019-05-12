package com.escalade.domain.dao.contract;

import com.escalade.domain.model.Commentaire;

public interface ICommentaireDao {

    public void saveCommentaire(int topo_id, String content, String userName);
    public Commentaire getCommentaireById(Integer commentaire_id);


}
