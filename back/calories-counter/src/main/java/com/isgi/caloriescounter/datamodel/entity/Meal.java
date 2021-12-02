package com.isgi.caloriescounter.datamodel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
public class Meal {

    @JsonIgnore
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String desc;

    @Column
    private LocalDate date;

    @Column
    private LocalTime time;

    @Column
    private boolean eat;

    @ManyToOne
    User user;
}
