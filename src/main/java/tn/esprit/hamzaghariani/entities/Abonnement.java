package tn.esprit.hamzaghariani.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Abonnement" )
public class Abonnement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "idAbonnement" )
    private Integer idAbonnement;
    private Long numAbonnement;
    private Date dateDebut;
    private  Date dateFin;
    private  Float prixAbonnement;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;
}