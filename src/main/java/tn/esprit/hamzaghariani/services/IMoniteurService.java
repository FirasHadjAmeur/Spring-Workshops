package tn.esprit.hamzaghariani.services;

import tn.esprit.hamzaghariani.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    public List<Moniteur> retrieveAllMoniteurs();
    public Moniteur retrieveMoniteur(int moniteurId);
    public Moniteur addMoniteur(Moniteur m);
    public void removeMoniteur(int moniteurId);
    public Moniteur modifyMoniteur(Moniteur moniteur);
}
