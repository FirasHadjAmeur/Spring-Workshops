package tn.esprit.hamzaghariani.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.hamzaghariani.entities.Inscription;

import java.util.List;

@Repository
public interface InscriptionRepository extends CrudRepository<Inscription,Integer> {

}
