package org.example.model;

import javax.persistence.*;
import org.example.model.*;
import org.example.*;

@Entity
public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Pergunta pergunta;

    @Column(nullable = false)
    private int nivelAceitacao;


    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        Pergunta pergunta1 = this.pergunta;
    }

    public int getNivelAceitacao() {
        return nivelAceitacao;
    }

    public void setNivelAceitacao(int nivelAceitacao) {
        this.nivelAceitacao = nivelAceitacao;
    }

    public void setEntrevistado(Entrevistado entrevistado) {
    }
}
