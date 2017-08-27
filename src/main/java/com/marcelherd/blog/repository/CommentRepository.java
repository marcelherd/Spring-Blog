package com.marcelherd.blog.repository;

import com.marcelherd.blog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Marcel Herd
 */
@RepositoryRestResource
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
