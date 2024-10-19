package Coderhouse._5.FacturacionV2.service;

import Coderhouse._5.FacturacionV2.model.Cliente;
import Coderhouse._5.FacturacionV2.model.Producto;
import Coderhouse._5.FacturacionV2.model.Venta;
import Coderhouse._5.FacturacionV2.repository.ClienteRepository;
import Coderhouse._5.FacturacionV2.repository.ProductoRepository;
import Coderhouse._5.FacturacionV2.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

    @Service
    public class VentaService {
        @Autowired
        private VentaRepository ventaRepository;

        @Autowired
        private ProductoRepository productoRepository;

        @Autowired
        private ClienteRepository clienteRepository;

        public Venta agregarVenta(long clienteId, long producto, int cantidad) {
            Cliente cliente = clienteRepository.findById(clienteId)
                    .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

            Producto producto = productoRepository.findById(clienteId)
                    .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

            Venta venta = new Venta();
            venta.setFechaVenta(LocalDate.now());
            venta.setCliente(cliente);
            venta = ventaRepository.save(venta);
        }

        public Venta cancelarVenta(long ventaId){
            Venta venta = ventaRepository.cancelById(ventaId)
                    .orElseThrow(() -> new RuntimeException("Venta no cancelada");
        }

        public Venta eliminarVenta(long ventaId){
            Venta venta = ventaRepository.deleteById(ventaId)
                    .orElseThrow(() -> new RuntimeException("Venta no eliminada");
        }
    }