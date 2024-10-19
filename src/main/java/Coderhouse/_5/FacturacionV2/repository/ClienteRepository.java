package Coderhouse._5.FacturacionV2.repository;

import Coderhouse._5.FacturacionV2.model.Cliente;
import Coderhouse._5.FacturacionV2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, long> {
    Optional<Cliente> findById(long id);
    Optional<Cliente> findByName(String nombre);
    Optional<Cliente> findByLastName(String apellido);
    Optional<Cliente> deleteById(long id);
}