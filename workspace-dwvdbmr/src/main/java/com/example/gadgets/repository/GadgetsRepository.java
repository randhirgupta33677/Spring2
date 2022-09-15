package com.example.gadgets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.gadgets.entity.Gadgets;

import java.util.Optional;

@Repository
public interface GadgetsRepository extends JpaRepository<Gadgets, Integer> {


}
