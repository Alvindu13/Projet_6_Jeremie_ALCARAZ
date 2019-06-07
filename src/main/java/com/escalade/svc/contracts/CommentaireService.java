package com.escalade.svc.contracts;

import com.escalade.data.model.Commentaire;
import com.escalade.data.model.Site;

import java.util.List;

public interface CommentaireService {

    void saveCommentaire(Commentaire c);
    Commentaire getCommentaireById(int commentaireId);
    public List<Commentaire> getAllCommentaireBySiteId(int siteId);
}