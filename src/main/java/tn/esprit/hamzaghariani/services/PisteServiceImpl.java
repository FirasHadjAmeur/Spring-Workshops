package tn.esprit.hamzaghariani.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.hamzaghariani.entities.Couleur;
import tn.esprit.hamzaghariani.entities.Piste;
import tn.esprit.hamzaghariani.entities.Skieur;
import tn.esprit.hamzaghariani.repository.PisteRepository;
import tn.esprit.hamzaghariani.repository.SkieurRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PisteServiceImpl implements IPisteService {

    @Autowired
    PisteRepository pisteRepository;
    SkieurRepository skieurRepository;
    public List<Piste> retrieveAllPistes() {
        return (List<Piste>) pisteRepository.findAll();
    }
    public Piste retrievePiste(int pisteId) {
        return pisteRepository.findById(pisteId).get();
    }
    public Piste addPiste(Piste p) {
        return pisteRepository.save(p);
    }
    public void removePiste(int pisteId) {
        pisteRepository.deleteById(pisteId);
    }
    public Piste modifyPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    public void assignSkieurToPiste(int pisteId, int skieurId) {
        Piste piste = pisteRepository.findById(pisteId).get();
        Skieur skieur = skieurRepository.findById(skieurId).get();
        piste.getSkieurs().add(skieur);
        pisteRepository.save(piste);
    }

    public void deassignSkieurFromPiste(int pisteId, int skieurId) {
        Piste piste = pisteRepository.findById(pisteId).get();
        Skieur skieur = skieurRepository.findById(skieurId).get();
        piste.getSkieurs().remove(skieur);
        pisteRepository.save(piste);
    }

    @Override
    public List<Piste> recupererPistesSelonCouleur(Couleur couleur) {
        List<Piste> pistes = pisteRepository.findByCouleur(String.valueOf(couleur));
        return pistes;
    }

    public List<Piste> recupererPistesSelonPenteEtLongueur(int pente, int longueur) {
        return pisteRepository.findByPenteAndLongeur(pente, longueur);
    }




}
