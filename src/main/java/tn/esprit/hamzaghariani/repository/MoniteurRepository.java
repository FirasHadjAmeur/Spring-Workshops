package tn.esprit.hamzaghariani.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.hamzaghariani.entities.Moniteur;

import java.util.List;

@Repository
public interface MoniteurRepository extends CrudRepository<Moniteur,Integer> {

}
