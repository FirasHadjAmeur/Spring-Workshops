package com.example.demo.Repository;

import com.example.demo.Entity.Inscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionRepository extends CrudRepository<Inscription, Long> {
}
