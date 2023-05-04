package tn.esprit.hamzaghariani.services;

import tn.esprit.hamzaghariani.entities.Cours;

import java.util.List;

public interface ICoursService {
    public List<Cours> retrieveAllCours();
    public Cours retrieveCours(int coursId);
    public Cours addCours(Cours c);
    public void removeCours(int coursId);
    public Cours modifyCours(Cours cours);
}
