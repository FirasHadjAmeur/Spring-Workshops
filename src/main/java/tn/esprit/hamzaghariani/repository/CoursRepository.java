package tn.esprit.hamzaghariani.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.hamzaghariani.entities.Cours;

import java.util.List;

@Repository
public interface CoursRepository extends CrudRepository<Cours,Integer> {

}
