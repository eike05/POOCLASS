package org.example.dao;

import org.example.model.Entrevistado;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EntrevistadoDAO {
    private Session session;

    public EntrevistadoDAO() {
        session = new Configuration().configure().buildSessionFactory().openSession();
    }

    public void salvar(Entrevistado entrevistado) {
        Transaction transaction = session.beginTransaction();
        session.save(entrevistado);
        transaction.commit();
    }

    public List<Entrevistado> listarTodos() {
        return session.createQuery("from Entrevistado", Entrevistado.class).list();
    }

    // Métodos adicionais de consulta conforme necessário
}
