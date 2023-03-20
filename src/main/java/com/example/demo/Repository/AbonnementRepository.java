package com.example.demo.Repository;

import com.example.demo.Entity.Abonnement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonnementRepository extends CrudRepository<Abonnement, Long> {
}
