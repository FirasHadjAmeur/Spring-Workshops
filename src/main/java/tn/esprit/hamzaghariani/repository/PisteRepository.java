package tn.esprit.hamzaghariani.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.hamzaghariani.entities.Couleur;
import tn.esprit.hamzaghariani.entities.Piste;

import java.util.List;

@Repository
public interface PisteRepository extends CrudRepository<Piste, Integer> {
    List<Piste> findByNomPiste(String nomPiste);

    List<Piste> findByCouleur(String couleur);

    List<Piste> findByLongeurGreaterThan(int longeur);

    List<Piste> findByCouleur(Couleur couleur);

    List<Piste> findByPenteAndLongeur(int pente, int longueur);

}
