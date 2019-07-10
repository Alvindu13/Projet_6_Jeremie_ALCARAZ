package com.escalade.data.repository;

import com.escalade.data.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Integer> {

    Page<Comment> findAllBySiteId(int siteId, Pageable pageable);

    @Query(value="SELECT * \n" +
            "FROM Comment c \n" +
            "INNER JOIN user_escalad u ON u.user_escalad_id = c.user_escalad_id \n" +
            "INNER JOIN Site s ON s.site_id = c.site_id \n" +
            "WHERE u.username = ?1 AND s.site_id = ?2", nativeQuery = true)
    List<Comment> findCommentByUserNameEqualsAndSiteIdEquals ( String userEscalad, int siteId);



}
