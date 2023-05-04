package tn.esprit.hamzaghariani.entities;

import jakarta.persistence.*;
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
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Skieur" )
public class Skieur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "idSkieur" )
    private Integer idSkieur;
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;
    // Biderectionelle Relation *-* avec piste
    @ManyToMany(mappedBy="skieurs", cascade = CascadeType.ALL)
    private Set<Piste> pistes;
    // Bidirectionelle *-1 avec inscription
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "skieur")
    private Set<Inscription> inscriptions;
    // One To One Unidirectionnelle avec abonnement
    @OneToOne
    private Abonnement abonnements;
}