package com.marcelherd.blog.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

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

    //TODO: fix cascading
    @OneToMany(cascade = CascadeType.ALL )
    @JoinColumn
    private List<Comment> comments = new ArrayList<Comment>();

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable
    private Set<Tag> tags = new HashSet<Tag>();

}
