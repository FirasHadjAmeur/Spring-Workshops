package tn.esprit.hamzaghariani.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.hamzaghariani.entities.Abonnement;

@Repository
public interface AbonnementRepository extends CrudRepository<Abonnement, Integer> {
}