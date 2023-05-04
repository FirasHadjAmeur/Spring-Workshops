package tn.esprit.hamzaghariani.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.hamzaghariani.entities.Abonnement;
import tn.esprit.hamzaghariani.repository.AbonnementRepository;

import java.util.List;

@Service
public class AbonnementServiceImpl implements IAbonnementService {

    @Autowired
    AbonnementRepository abonnementRepository;

    public List<Abonnement> retrieveAllAbonnements() {
        return (List<Abonnement>) abonnementRepository.findAll();
    }

    public Abonnement retrieveAbonnement(int idAbonnement) {
        return abonnementRepository.findById(idAbonnement).get();
    }

    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    public void removeAbonnement(int idAbonnement) {
        abonnementRepository.deleteById(idAbonnement);
    }

    public Abonnement modifyAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }
}
