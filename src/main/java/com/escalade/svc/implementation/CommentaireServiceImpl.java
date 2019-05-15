package com.escalade.svc.implementation;

import com.escalade.data.repository.CommentaireRepository;
import com.escalade.data.model.Commentaire;
import com.escalade.svc.contracts.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommentaireServiceImpl implements CommentaireService {

    @Autowired
    private CommentaireRepository repo;

    public void saveCommentaire(Commentaire c) {
        repo.save(c);
    }

    public Commentaire getCommentaireById(Integer commentaire_id) {
        return repo.findOne(commentaire_id);
    }


}
