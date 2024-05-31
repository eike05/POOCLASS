package org.example;

import org.example.dao.EntrevistadoDAO;
import org.example.model.Entrevistado;
import org.example.Pergunta;
import org.example.model.Resposta;
import org.example.model.PerguntaModel;

import java.util.Scanner;

public class AppQuestionario {
    public static void main(String[] args) {
        Questionario questionario = new Questionario();
        Scanner scanner = new Scanner(System.in);

        // Perguntas predefinidas
        String[] textosPerguntas = {
                "Como você se sente hoje?",
                "Você gosta de programar em Java?",
                "Qual sua comida favorita?",
                "Você pratica esportes?",
                "Qual é o seu hobby?",
                "Você gosta de viajar?",
                "Qual é o seu filme favorito?",
                "Você prefere gatos ou cães?",
                "Qual é a sua estação do ano preferida?",
                "Você gosta de música?",
                "Qual é o seu livro favorito?",
                "Você gosta de cozinhar?",
                "Qual é a sua cor preferida?",
                "Você prefere a cidade ou o campo?",
                "Qual é a sua profissão dos sonhos?",
                "Você fala outros idiomas?",
                "Qual é o seu time de futebol favorito?",
                "Você gosta de arte?",
                "Qual é o seu tipo de comida preferido?",
                "Você tem algum animal de estimação?"
        };

        // Coletar nome do entrevistado
        System.out.println("Por favor, informe seu nome:");
        String nomeEntrevistado = scanner.nextLine();

        Entrevistado entrevistado = new Entrevistado();
        entrevistado.setNome(nomeEntrevistado);

        for (int i = 0; i < textosPerguntas.length; i++) {
            System.out.println("Avalie a pergunta " + (i + 1) + " (1 a 5): " + textosPerguntas[i]);
            int nivelAceitacao = scanner.nextInt();

            // Create a Pergunta object from the textoPerguntas[i] String
            Pergunta pergunta = new Pergunta();
            pergunta.setTexto(textosPerguntas[i]);

            Resposta resposta = new Resposta();
            resposta.setEntrevistado(entrevistado);
            resposta.setPergunta(pergunta.toString()); // Pass the Pergunta object to the setPergunta method
            resposta.setNivelAceitacao(nivelAceitacao);
            entrevistado.getRespostas().add(resposta);
        }

        // Salvar entrevistado e respostas no banco de dados
        EntrevistadoDAO entrevistadoDAO = new EntrevistadoDAO();
        entrevistadoDAO.salvar(entrevistado);

        scanner.close();
    }
}