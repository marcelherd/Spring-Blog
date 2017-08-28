package com.marcelherd.blog.domain;

import lombok.*;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Marcel Herd
 */
@Getter @Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(exclude = "comments")
@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @Email
    private String email;

    @NotNull
    private String body;

    @NotNull
    private Date createdAt;

    //TODO: fix cascading
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private List<Comment> comments = new ArrayList<Comment>();

}
