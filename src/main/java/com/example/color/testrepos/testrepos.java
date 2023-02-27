package com.example.color.testrepos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.color.testentity.testentity;
@Repository
public interface testrepos extends JpaRepository<testentity,Integer>{

}

