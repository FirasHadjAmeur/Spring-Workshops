package com.springtp1.Repository;


import com.springtp1.Entity.Moniteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoniteurRepository extends CrudRepository<Moniteur, Long> {
}
