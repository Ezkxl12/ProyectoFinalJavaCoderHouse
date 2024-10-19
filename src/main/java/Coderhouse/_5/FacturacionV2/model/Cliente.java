package Coderhouse._5.FacturacionV2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre;
    private String apellido;
    private String direccion;
    private int numeracion;
    private Long id;

    @OneToMany(mappedBy = "cliente", cascade = cascadeType.ALL)
    private List<Venta> ventas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public list<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(list<Venta> ventas) {
        this.ventas = ventas;
    }
}
