package org.example.dao;

import org.example.Pergunta;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class PerguntaDAO {
    private Session session;

    public PerguntaDAO() {
        session = new Configuration().configure().buildSessionFactory().openSession();
    }

    public void salvar(Pergunta pergunta) {
        Transaction transaction = session.beginTransaction();
        session.save(pergunta);
        transaction.commit();
    }

    public List<Pergunta> listarTodos() {
        return session.createQuery("from Pergunta", Pergunta.class).list();
    }

    public Pergunta buscarPorId(Long id) {
        return session.get(Pergunta.class, id);
    }

    public void atualizar(Pergunta pergunta) {
        Transaction transaction = session.beginTransaction();
        session.update(pergunta);
        transaction.commit();
    }

    public void deletar(Pergunta pergunta) {
        Transaction transaction = session.beginTransaction();
        session.delete(pergunta);
        transaction.commit();
    }
}
