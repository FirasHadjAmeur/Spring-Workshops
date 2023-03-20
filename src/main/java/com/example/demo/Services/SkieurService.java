package com.example.demo.Services;


import com.example.demo.Entity.Skieur;
import com.example.demo.Interfaces.ISkieurService;
import com.example.demo.Repository.SkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkieurService implements ISkieurService {

    @Autowired
    SkieurRepository skieurRepository;
    public List<Skieur> retrieveAllSkieurs() {
        return (List<Skieur>) skieurRepository.findAll();
    }

    public Skieur retrieveSkieur(Long skieurId) {
        return skieurRepository.findById(skieurId).get();
    }

    public Skieur addSkieur(Skieur s) {
        return skieurRepository.save(s);
    }

    public void removeSkieur(Long skieurId) {
        skieurRepository.deleteById(skieurId);
    }

    public Skieur modifySkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }
}
