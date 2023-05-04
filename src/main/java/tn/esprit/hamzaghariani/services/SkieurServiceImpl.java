package tn.esprit.hamzaghariani.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.hamzaghariani.entities.Piste;
import tn.esprit.hamzaghariani.entities.Skieur;
import tn.esprit.hamzaghariani.repository.PisteRepository;
import tn.esprit.hamzaghariani.repository.SkieurRepository;

import java.util.List;

@Service
public class SkieurServiceImpl implements ISkieurService {

    @Autowired
    SkieurRepository skieurRepository;
    PisteRepository pisteRepository;

    public List<Skieur> retrieveAllSkieurs() {
        return (List<Skieur>) skieurRepository.findAll();
    }

    public Skieur retrieveSkieur(int skieurId) {
        return skieurRepository.findById(skieurId).get();
    }

    public Skieur addSkieur(Skieur s) {
        return skieurRepository.save(s);
    }

    public void removeSkieur(int skieurId) {
        skieurRepository.deleteById(skieurId);
    }

    public Skieur modifySkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    public void assignPisteToSkieur(int skieurId, int pisteId) {
        Skieur skieur = skieurRepository.findById(skieurId).get();
        Piste piste = pisteRepository.findById(pisteId).get();
        skieur.getPistes().add(piste);
        skieurRepository.save(skieur);
    }

    public void deassignPisteFromSkieur(int skieurId, int pisteId) {
        Skieur skieur = skieurRepository.findById(skieurId).get();
        Piste piste = pisteRepository.findById(pisteId).get();
        skieur.getPistes().remove(piste);
        skieurRepository.save(skieur);
    }

}
