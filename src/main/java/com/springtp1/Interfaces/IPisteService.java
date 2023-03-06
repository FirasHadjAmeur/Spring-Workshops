package com.springtp1.Interfaces;

import com.springtp1.Entity.Piste;

import java.util.List;

public interface IPisteService {
    public List<Piste> retrieveAllPistes();
    public Piste retrievePiste(Long pisteId);
    public Piste addPiste(Piste p);
    public void removePiste(Long pisteId);
    public Piste modifyPiste(Piste piste);
// Here we will add later methods calling keywords and methods calling JPQL
}