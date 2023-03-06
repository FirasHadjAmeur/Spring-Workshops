package com.springtp1.Repository;

import com.springtp1.Entity.Abonnement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonnementRepository extends CrudRepository<Abonnement, Long> {
}
