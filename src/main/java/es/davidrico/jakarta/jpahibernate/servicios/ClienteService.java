package es.davidrico.jakarta.jpahibernate.servicios;

import es.davidrico.jakarta.jpahibernate.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    List<Cliente> listar();
    Optional<Cliente> porId(Long id);
    void guardar(Cliente cliente);
    void eliminar(Long id);
}
