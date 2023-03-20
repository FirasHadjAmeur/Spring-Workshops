package com.example.demo.Entity;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Inscription")
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numInscription")
    private Long numInscription;
    private Integer numSemaine;

    @ManyToOne
    private Skieur skieur;

    @ManyToOne
    private Cours cours;

    public Inscription(Long idSkieur, Long numCours) {
        this.skieur = new Skieur(idSkieur);
        this.cours = new Cours(numCours);
    }

    public Long getIdSkieur() {
        return skieur.getIdSkieur();
    }

    public Long getNumCours() {
        return cours.getNumCours();
    }
}
