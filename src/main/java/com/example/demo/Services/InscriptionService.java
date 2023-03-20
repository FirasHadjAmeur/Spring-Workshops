package com.example.demo.Services;


import com.example.demo.Entity.Inscription;
import com.example.demo.Interfaces.IInscriptionService;
import com.example.demo.Repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscriptionService implements IInscriptionService {
    @Autowired
    InscriptionRepository inscriptionRepository;

    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return (List<Inscription>) inscriptionRepository.findAll();
    }

    @Override
    public Inscription retrieveInscription(Long numInscription) {
        return inscriptionRepository.findById(numInscription).get();
    }

    @Override
    public Inscription addInscription(Long idSkieur, Long numCours) {
        return inscriptionRepository.save(new Inscription(idSkieur, numCours));
    }

    @Override
    public void removeInscription(Long numInscription) {
        inscriptionRepository.deleteById(numInscription);
    }

    @Override
    public Inscription modifyInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }
}
