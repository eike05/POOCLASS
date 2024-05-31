package org.example.model;

public class PerguntaModel {
    private String texto;
    private int nivelAceitacao; // Adicionando o atributo para armazenar o nível de aceitação

    public PerguntaModel(String texto) {
        this.texto = texto;
        this.nivelAceitacao = 0; // Nível de aceitação inicial é 0 (não avaliado)
    }

    // Getters e Setters
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getNivelAceitacao() {
        return nivelAceitacao;
    }

    public void setNivelAceitacao(int nivelAceitacao) {
        this.nivelAceitacao = nivelAceitacao;
    }

    @Override
    public String toString() {
        return "PerguntaModel: " + texto + " | Nível de Aceitação: " + nivelAceitacao;
    }
}
