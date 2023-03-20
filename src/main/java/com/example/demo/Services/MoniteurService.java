package com.example.demo.Services;


import com.example.demo.Entity.Moniteur;
import com.example.demo.Interfaces.IMoniteurService;
import com.example.demo.Repository.MoniteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoniteurService implements IMoniteurService {

    @Autowired
    MoniteurRepository moniteurRepository;
    public List<Moniteur> retrieveAllMoniteurs() {
        return (List<Moniteur>) moniteurRepository.findAll();
    }
    public Moniteur retrieveMoniteur(Long moniteurId) {
        return moniteurRepository.findById(moniteurId).get();
    }
    public Moniteur addMoniteur(Moniteur m) {
        return moniteurRepository.save(m);
    }
    public void removeMoniteur(Long moniteurId) {
        moniteurRepository.deleteById(moniteurId);
    }
    public Moniteur modifyMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }
}
