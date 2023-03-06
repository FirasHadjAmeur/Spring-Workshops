package com.springtp1.Repository;

import com.springtp1.Entity.Piste;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PisteRepository extends CrudRepository<Piste, Long> {
/* No need to code CRUD. It is already ready in :
JpaRepository or PagingAndSortingRepository ou CrudRepository */

// Here we can code additional methods with keywords or with JPQL
    List<Piste> findAllByPenteLessThanAndLongeurGreaterThan(Integer pente, Integer longueur);
}