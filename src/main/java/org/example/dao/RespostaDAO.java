package org.example.dao;

import org.example.model.Resposta;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RespostaDAO {
    private Session session;

    public RespostaDAO(Session session) {
        this.session = session;
    }

    public void salvar(Resposta resposta) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(resposta);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
