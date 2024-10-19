package Coderhouse._5.FacturacionV2.repository;

import Coderhouse._5.FacturacionV2.model.Producto;
import Coderhouse._5.FacturacionV2.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VentaRepository extends JpaRepository<Venta, long>{
    Optional<Venta> findById(long id);
    Optional<Venta> deleteById(long id);
    Optional<Venta> cancelById(long id);
}