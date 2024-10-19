package Coderhouse._5.FacturacionV2.repository;

import Coderhouse._5.FacturacionV2.model.Cliente;
import Coderhouse._5.FacturacionV2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, long> {
    Optional<Producto> findByName(String nombre);
    Optional<Producto> findById(long id);
    Optional<Producto> deleteById(long id);
}
