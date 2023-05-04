package tn.esprit.hamzaghariani.services;

import tn.esprit.hamzaghariani.entities.Skieur;

import java.util.List;

public interface ISkieurService {
    public List<Skieur> retrieveAllSkieurs();
    public Skieur retrieveSkieur(int skieurId);
    public Skieur addSkieur(Skieur s);
    public void removeSkieur(int skieurId);
    public Skieur modifySkieur(Skieur skieur);

    public void assignPisteToSkieur(int skieurId, int pisteId);
    public void deassignPisteFromSkieur(int skieurId, int pisteId);
}
