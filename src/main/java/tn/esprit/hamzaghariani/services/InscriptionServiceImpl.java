package tn.esprit.hamzaghariani.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.hamzaghariani.entities.Inscription;
import tn.esprit.hamzaghariani.repository.InscriptionRepository;

import java.util.List;

@Service
public class InscriptionServiceImpl implements IInscriptionService {

    @Autowired
    InscriptionRepository inscriptionRepository;
    public List<Inscription> retrieveAllInscriptions() {
        return (List<Inscription>) inscriptionRepository.findAll();
    }
    public Inscription retrieveInscription(int inscriptionId) {
        return inscriptionRepository.findById(inscriptionId).get();
    }
    public Inscription addInscription(Inscription i) {
        return inscriptionRepository.save(i);
    }
    public void removeInscription(int inscriptionId) {
        inscriptionRepository.deleteById(inscriptionId);
    }
    public Inscription modifyInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }
}
