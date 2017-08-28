package com.marcelherd.blog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author Marcel Herd
 */
@Data
@Entity
public class Tag {

    public Tag() { }
    public Tag(String name) { this.name = name; }

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

}
