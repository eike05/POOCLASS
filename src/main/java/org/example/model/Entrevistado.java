package org.example.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Entrevistado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "entrevistado")
    private List<Resposta> respostas = new ArrayList<>();

    public void setName(String nomeEntrevistado) {
        this.nome = nomeEntrevistado;
    }

    public String getName() {
        return nome;
    }

    // Alternative 1: Getter for the respostas list (may not be ideal)
    public List<Resposta> getRespostas() {
        return respostas;
    }

    // Alternative 2: Method to count respostas
    public int getNumeroRespostas() {
        return respostas.size();
    }

    public void setNome(String nomeEntrevistado) {
    }

    // Getters and setters for all other attributes (e.g., getId, setId)
}
