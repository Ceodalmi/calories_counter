package com.isgi.caloriescounter.datamodel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Role {

    @Id
    private Long id;

    @Column
    private String role;

}
