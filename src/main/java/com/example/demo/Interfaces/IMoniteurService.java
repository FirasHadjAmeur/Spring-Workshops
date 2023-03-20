package com.example.demo.Interfaces;

import com.example.demo.Entity.Moniteur;
import java.util.List;
public interface IMoniteurService {
    public List<Moniteur> retrieveAllMoniteurs();
    public Moniteur retrieveMoniteur(Long moniteurId);
    public Moniteur addMoniteur(Moniteur m);
    public void removeMoniteur(Long moniteurId);
    public Moniteur modifyMoniteur(Moniteur moniteur);
}
