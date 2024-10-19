package Coderhouse._5.FacturacionV2.service;

import Coderhouse._5.FacturacionV2.model.Producto;
import Coderhouse._5.FacturacionV2.model.Venta;
import Coderhouse._5.FacturacionV2.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired

    private ProductoRepository productoRepository;

    public Producto agregarProducto(long producto, int cantidad, long productoId) {
        Producto producto = productoRepository.save(productoId)
                .orElseThrow(() -> new RuntimeException("No se puedo agregar el producto"));
        return productoRepository.save(producto);
    }

    public Producto buscarProducto(long id) {
        Producto producto = productoRepository.findForId(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        return productoRepository.findById(id);
    }

    public Producto buscarProducto(String nombre) {
        Producto producto = productoRepository.findForName(nombre)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        return productoRepository.findByName(nombre);
    }

    public void eliminarProducto(Long id) {
        Producto producto = productoRepository.deleteById(id)
                .orElseThrow(() -> new RuntimeException("No se pudo eliminar el producto"));
        return productoRepository.deleteById(id);
    }

    Producto producto = new Producto();
            producto.setProductoIngreso(LocalDate.now());
            producto.setNombreProducto(producto);
            producto.setTipoProducto(producto);
    producto = productoRepository.save(producto);
}