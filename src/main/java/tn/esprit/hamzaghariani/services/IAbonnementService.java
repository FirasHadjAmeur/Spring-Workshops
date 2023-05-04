package tn.esprit.hamzaghariani.services;

import tn.esprit.hamzaghariani.entities.Abonnement;

import java.util.List;

public interface IAbonnementService {
    public List<Abonnement> retrieveAllAbonnements();
    public Abonnement retrieveAbonnement(int idAbonnement);
    public Abonnement addAbonnement(Abonnement abonnement);
    public void removeAbonnement(int idAbonnement);
    public Abonnement modifyAbonnement(Abonnement abonnement);
}
