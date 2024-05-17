package org.example;

import entidades.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
        EntityManager em = emf.createEntityManager();
        try {
            // Inicia uma transação
            em.getTransaction().begin();

            // Cria um novo objeto Pessoa
            Pessoa novaPessoa = new Pessoa();
            novaPessoa.setNome("John Doe");
            novaPessoa.setEmail("johndoe@example.com");

            // Persiste o objeto no banco de dados
            em.persist(novaPessoa);

            // Comita a transação
            em.getTransaction().commit();

            // Busca a pessoa persistida usando o ID
            Pessoa pessoaPersistida = em.find(Pessoa.class, novaPessoa.getId());

            // Imprime a pessoa no console
            System.out.println(pessoaPersistida);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (emf != null) {
                emf.close();
            }
        }
    }
}
