package org.example;

import org.example.model.PerguntaModel;

import java.util.ArrayList;
import java.util.List;

public class Questionario {
    private List<PerguntaModel> perguntaModels;

    public Questionario() {
        perguntaModels = new ArrayList<>();
    }

    public void adicionarPergunta(PerguntaModel perguntaModel) {
        perguntaModels.add(perguntaModel);
    }


    public void avaliarPergunta(int indice, int nivelAceitacao) {
        if (indice >= 0 && indice < perguntaModels.size()) {
            perguntaModels.get(indice).setNivelAceitacao(nivelAceitacao);
        } else {
            System.out.println("Índice de pergunta inválido.");
        }
    }

    public void exibirPerguntas() {
        for (PerguntaModel perguntaModel : perguntaModels) {
            System.out.println(perguntaModel);
        }
    }

    public List<PerguntaModel> getPerguntas() {
        return perguntaModels;
    }
}
