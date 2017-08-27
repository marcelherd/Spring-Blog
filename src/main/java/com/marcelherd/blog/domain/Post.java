package com.marcelherd.blog.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author Marcel Herd
 */
@Getter @Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(exclude = { "comments", "tags" })
@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String body;

    @NotNull
    private Date createdAt;

    @OneToMany
    @JoinColumn
    private List<Comment> comments;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private Set<Tag> tags;

}
