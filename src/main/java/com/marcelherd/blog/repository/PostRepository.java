package com.marcelherd.blog.repository;

import com.marcelherd.blog.domain.Post;
import com.marcelherd.blog.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author Marcel Herd
 */
@RepositoryRestResource
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByTags(Tag tag);

}
