package com.example.demo.Repository;


import com.example.demo.Entity.Moniteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoniteurRepository extends CrudRepository<Moniteur, Long> {
}
