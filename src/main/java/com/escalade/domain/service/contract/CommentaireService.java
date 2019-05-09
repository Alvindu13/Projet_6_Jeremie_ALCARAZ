package com.escalade.domain.service.contract;

import com.escalade.domain.model.Commentaire;

public interface CommentaireService {

    public void saveCommentaire(Commentaire c);
    public Commentaire getCommentaireById(Integer commentaire_id);
}
