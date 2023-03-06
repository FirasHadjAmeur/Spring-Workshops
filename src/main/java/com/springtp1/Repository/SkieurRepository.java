package com.springtp1.Repository;

import com.springtp1.Entity.Skieur;
import com.springtp1.Entity.TypeAbonnement;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkieurRepository extends CrudRepository<Skieur, Long> {

    @Query("Select s FROM Skieur s WHERE s.abonnement.typeAbonnement =: ta ")
    List<Skieur> recupererSkieurParTypeAbonnement(@Param("ta") TypeAbonnement SNOWBOARD);
}
