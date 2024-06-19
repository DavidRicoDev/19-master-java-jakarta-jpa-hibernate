package es.davidrico.jakarta.jpahibernate;

import jakarta.persistence.EntityManager;
import es.davidrico.jakarta.jpahibernate.entity.Cliente;
import es.davidrico.jakarta.jpahibernate.util.JpaUtil;

import java.util.List;

public class HibernateListar {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();
        List<Cliente> clientes = em.createQuery("select c from Cliente c", Cliente.class).getResultList();
        clientes.forEach(System.out::println);
        em.close();
    }
}
