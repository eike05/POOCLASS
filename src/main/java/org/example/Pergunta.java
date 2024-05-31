package org.example;

import javax.persistence.*;
import java.util.List;
import org.example.model.Resposta;

@Entity
public class Pergunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    // You can add other getters and setters for additional attributes
}

