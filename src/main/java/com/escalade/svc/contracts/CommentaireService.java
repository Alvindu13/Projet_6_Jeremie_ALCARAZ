package com.escalade.svc.contracts;

import com.escalade.data.model.Commentaire;

public interface CommentaireService {

    void saveCommentaire(Commentaire c);
    Commentaire getCommentaireById(Integer commentaire_id);
}
