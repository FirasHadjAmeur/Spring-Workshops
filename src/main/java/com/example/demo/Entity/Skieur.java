package com.example.demo.Entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Skieur")
public class Skieur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSkieur")
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Piste> pistes;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "numInscription")
    private Set<Inscription> inscriptions;

    @OneToOne
    private Abonnement abonnement;

    public Skieur(Long idSkieur) {
        this.numSkieur = idSkieur;
    }

    public Long getIdSkieur() {
        return numSkieur;
    }
}
