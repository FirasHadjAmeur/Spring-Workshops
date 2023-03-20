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
@Table(name = "Moniteur")
public class Moniteur implements Serializable{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "numMoniteur")
        private Long numMoniteur;
        private String nomM;
        private String prenomM;
        private Date dateRecru;

        @OneToMany(cascade = CascadeType.ALL)
        private Set<Cours> cours;
}
