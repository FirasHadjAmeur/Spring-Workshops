package tn.esprit.hamzaghariani.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.hamzaghariani.entities.Skieur;

import java.util.List;

@Repository
public interface SkieurRepository extends CrudRepository<Skieur,Integer> {
    List<Skieur> findByNomSkieur(String nomSkieur);

    List<Skieur> findByPistes_NomPiste(String nomPiste);

    void deleteByNomSkieur(String nomSkieur);

    void assignPisteToSkieur(int skieurId, int pisteId);

    void deassignPisteFromSkieur(int skieurId, int pisteId);
}
