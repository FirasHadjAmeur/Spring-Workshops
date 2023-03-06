package com.springtp1.Services;

import com.springtp1.Entity.Piste;
import com.springtp1.Interfaces.IPisteService;
import com.springtp1.Repository.PisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PisteServiceImpl implements IPisteService {

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