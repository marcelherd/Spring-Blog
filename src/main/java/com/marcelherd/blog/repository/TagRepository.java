package com.marcelherd.blog.repository;

import com.marcelherd.blog.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Marcel Herd
 */
@RepositoryRestResource
public interface TagRepository extends JpaRepository<Tag, Long> {

    List<Tag> findByName(String name);

}
