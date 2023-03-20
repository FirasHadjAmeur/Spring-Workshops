package com.example.demo.Services;

import com.example.demo.Entity.Piste;
import com.example.demo.Interfaces.IPisteService;
import com.example.demo.Repository.PisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PisteService implements IPisteService {

    @Autowired
    PisteRepository pisteRepository;
    public List<Piste> retrieveAllPistes() {
        return (List<Piste>) pisteRepository.findAll();
    }
    public Piste retrievePiste(Long pisteId) {
        return pisteRepository.findById(pisteId).get();
    }
    public Piste addPiste(Piste p) {
        return pisteRepository.save(p);
    }
    public void removePiste(Long pisteId) {
        pisteRepository.deleteById(pisteId);
    }
    public Piste modifyPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

}