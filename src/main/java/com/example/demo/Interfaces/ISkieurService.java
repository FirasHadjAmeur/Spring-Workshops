package com.example.demo.Interfaces;

import com.example.demo.Entity.Skieur;
import java.util.List;
public interface ISkieurService {
    public List<Skieur> retrieveAllSkieurs();
    public Skieur retrieveSkieur(Long skieurId);
    public Skieur addSkieur(Skieur s);
    public void removeSkieur(Long skieurId);
    public Skieur modifySkieur(Skieur skieur);
    // Here we will add later methods calling keywords and methods calling JPQL
}
