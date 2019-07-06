package com.escalade.svc.contracts;

import com.escalade.data.model.Comment;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface CommentService {

    void saveComment(Comment c);
    Page<Comment> getAllCommentBySiteId(int siteId, Pageable pageable);

    //Comment getCommentById(int CommentId);
    //List<Comment> teste(String user, int siteId);

}
