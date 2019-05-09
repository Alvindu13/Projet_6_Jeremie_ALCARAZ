package com.escalade.domain.service.impl;

import com.escalade.domain.dao.impl.CommentaireDao;
import com.escalade.domain.model.Commentaire;
import com.escalade.domain.service.contract.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("commentaireService")
public class CommentaireServiceImpl implements CommentaireService {

    @Autowired
    private CommentaireDao dao;
    public void saveCommentaire(Commentaire c) {
        dao.saveCommentaire(c.getTopo_id(), c.getContent(), c.getUserName());
    }

    public Commentaire getCommentaireById(Integer commentaire_id) {
        return null;
    }
}
