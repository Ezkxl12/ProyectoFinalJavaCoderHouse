package Coderhouse._5.FacturacionV2.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate fechaVenta;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private list<VentaProducto> ventaProductos;

    public list<VentaProducto> getVentaProductos() {
        return ventaProductos;
    }

    public void setVentaProductos(list<VentaProducto> ventaProductos) {
        this.ventaProductos = ventaProductos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
