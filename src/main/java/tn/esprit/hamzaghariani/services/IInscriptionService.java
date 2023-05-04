package tn.esprit.hamzaghariani.services;

import tn.esprit.hamzaghariani.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    public List<Inscription> retrieveAllInscriptions();
    public Inscription retrieveInscription(int inscriptionId);
    public Inscription addInscription(Inscription i);
    public void removeInscription(int inscriptionId);
    public Inscription modifyInscription(Inscription inscription);
}
