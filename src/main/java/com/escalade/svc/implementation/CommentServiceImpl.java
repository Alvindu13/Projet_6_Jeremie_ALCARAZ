package com.escalade.svc.implementation;

import com.escalade.data.repository.CommentRepository;
import com.escalade.data.model.Comment;
import com.escalade.svc.contracts.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.List;


@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository repo;

    @Override
    public void saveComment(Comment c) {
        repo.save(c);
    }

    /*@Override
    public Comment getCommentById(int CommentId) {
        return repo.findByCommentId(CommentId);
    }*/

    @Override
    public Page<Comment> getAllCommentBySiteId(int siteId, Pageable pageable) {
        return repo.findAllBySiteId(siteId, pageable);
    }


   /* @Override
    public List<Comment> teste(String user, int siteId) {
        return repo.findTest(user, siteId);
    }*/


}
