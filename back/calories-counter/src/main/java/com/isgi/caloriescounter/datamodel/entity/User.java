package com.isgi.caloriescounter.datamodel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;

    @OneToMany
    private List<Meal> meals;
}
