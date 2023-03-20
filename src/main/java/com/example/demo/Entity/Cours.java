package com.example.demo.Entity;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Cours")
public class Cours implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "numCours")
        private Long numCours;
        private Integer niveau;

        @Enumerated(EnumType.STRING)
        private TypeCours typeCours;
        @Enumerated(EnumType.STRING)
        private Support support;
        private Float prix;
        private Integer creneau;

        @OneToMany(cascade = CascadeType.ALL,mappedBy = "cours")
        private Set<Inscription> inscriptions;

        public Cours(Long numCours) {
            this.numCours = numCours;
        }
}
