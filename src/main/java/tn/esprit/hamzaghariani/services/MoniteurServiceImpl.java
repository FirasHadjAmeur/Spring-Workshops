package tn.esprit.hamzaghariani.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.hamzaghariani.entities.Moniteur;
import tn.esprit.hamzaghariani.repository.MoniteurRepository;

import java.util.List;

@Service
public class MoniteurServiceImpl implements IMoniteurService {

    @Autowired
    MoniteurRepository moniteurRepository;

    public List<Moniteur> retrieveAllMoniteurs() {
        return (List<Moniteur>) moniteurRepository.findAll();
    }

    public Moniteur retrieveMoniteur(int moniteurId) {
        return moniteurRepository.findById(moniteurId).get();
    }

    public Moniteur addMoniteur(Moniteur m) {
        return moniteurRepository.save(m);
    }

    public void removeMoniteur(int moniteurId) {
        moniteurRepository.deleteById(moniteurId);
    }

    public Moniteur modifyMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }
}
