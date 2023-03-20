package com.example.demo.Interfaces;

import com.example.demo.Entity.Cours;

import java.util.List;

public interface ICoursService {
    public List<Cours> retrieveAllCours();
    public Cours retrieveCours(Long coursId);
    public Cours addCours(Cours c);
    public void removeCours(Long coursId);
    public Cours modifyCours(Cours cours);
    // Here we will add later methods calling keywords and methods calling JPQL
}
