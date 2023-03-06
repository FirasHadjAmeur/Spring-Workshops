package com.springtp1.Repository;

import com.springtp1.Entity.Inscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionRepository extends CrudRepository<Inscription, Long> {
}
