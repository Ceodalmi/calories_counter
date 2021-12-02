package com.isgi.caloriescounter.datamodel.repository;

import com.isgi.caloriescounter.datamodel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}