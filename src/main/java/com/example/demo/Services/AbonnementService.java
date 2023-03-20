package com.example.demo.Services;

import com.example.demo.Entity.Abonnement;
import com.example.demo.Interfaces.IAbonnementService;
import com.example.demo.Repository.AbonnementRepository;
import com.example.demo.Repository.PisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbonnementService implements IAbonnementService {

    @Autowired
    AbonnementRepository abonnementRepository;
    public List<Abonnement> retrieveAllAbonnements() {
        return (List<Abonnement>) abonnementRepository.findAll();
    }
    public Abonnement retrieveAbonnement(Long abonnementId) {
        return abonnementRepository.findById(abonnementId).get();
    }
    public Abonnement addAbonnement(Abonnement a) {
        return abonnementRepository.save(a);
    }
    public void removeAbonnement(Long abonnementId) {
        abonnementRepository.deleteById(abonnementId);
    }
    public Abonnement modifyAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }
}
