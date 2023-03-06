package com.springtp1.Repository;


import com.springtp1.Entity.Cours;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepoitory extends CrudRepository<Cours, Long> {
}
