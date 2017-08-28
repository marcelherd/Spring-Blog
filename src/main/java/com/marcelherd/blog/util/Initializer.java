package com.marcelherd.blog.util;

import com.marcelherd.blog.domain.Comment;
import com.marcelherd.blog.domain.Post;
import com.marcelherd.blog.domain.Tag;
import com.marcelherd.blog.repository.CommentRepository;
import com.marcelherd.blog.repository.PostRepository;
import com.marcelherd.blog.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Marcel Herd
 */
@Component
public class Initializer {

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private CommentRepository commentRepository;

    @PostConstruct
    public void init() {
        Tag java = new Tag("Java");
        java = tagRepository.save(java);

        Tag spring = new Tag("Spring");
        spring = tagRepository.save(spring);

        Post firstPost = new Post();
        firstPost.setTitle("My first post!");
        firstPost.setBody("Hello world!");
        firstPost.setCreatedAt(new Date());
        firstPost.getTags().add(java);
        firstPost.getTags().add(spring);
        firstPost = postRepository.save(firstPost);

        Comment firstComment = new Comment();
        firstComment.setName("Dude");
        firstComment.setEmail("dude@email.com");
        firstComment.setCreatedAt(new Date());
        firstComment.setBody("Awesome post man!");
        firstPost.getComments().add(firstComment);
        firstPost = postRepository.save(firstPost);

        Comment firstReply = new Comment();
        firstReply.setName("Author");
        firstReply.setEmail("author@email.com");
        firstReply.setCreatedAt(new Date());
        firstReply.setBody("Thanks man!");

        // How do I obtain the new firstComment instance?
        // firstComment.getComments().add(firstReply);
        // firstComment = commentRepository.save(firstComment);
    }

}
