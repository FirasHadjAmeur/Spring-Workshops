package tn.esprit.hamzaghariani.services;

import tn.esprit.hamzaghariani.entities.Couleur;
import tn.esprit.hamzaghariani.entities.Piste;

import java.util.List;

public interface IPisteService {
    public List<Piste> retrieveAllPistes();
    public Piste retrievePiste(int pisteId);
    public Piste addPiste(Piste p);
    public void removePiste(int pisteId);
    public Piste modifyPiste(Piste piste);

    public void assignSkieurToPiste(int pisteId, int skieurId);

    public void deassignSkieurFromPiste(int pisteId, int skieurId);

    List<Piste> recupererPistesSelonCouleur(Couleur couleur);

    List<Piste> recupererPistesSelonPenteEtLongueur(int pente, int longeur);

}
