package com.example.demo.Interfaces;


import com.example.demo.Entity.Inscription;
import java.util.List;

public interface IInscriptionService {
    public List<Inscription> retrieveAllInscriptions();
    public Inscription retrieveInscription(Long numInscription);
    public Inscription addInscription(Long idSkieur, Long numCours);
    public void removeInscription(Long numInscription);
    public Inscription modifyInscription(Inscription inscription);

}
