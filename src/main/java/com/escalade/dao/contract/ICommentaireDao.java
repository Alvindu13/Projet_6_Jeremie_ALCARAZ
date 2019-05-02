package com.escalade.dao.contract;

import com.escalade.model.Topo;

public interface ICommentaireDao {

    public void saveCommentaire(String topoName, String content, String userName);
    public Topo getCommentaire(int id);


}
