package com.example.demo.Interfaces;

import com.example.demo.Entity.Abonnement;
import java.util.List;

public interface IAbonnementService {
    public List<Abonnement> retrieveAllAbonnements();
    public Abonnement retrieveAbonnement(Long abonnementId);
    public Abonnement addAbonnement(Abonnement a);
    public void removeAbonnement(Long abonnementId);
    public Abonnement modifyAbonnement(Abonnement abonnement);

}
