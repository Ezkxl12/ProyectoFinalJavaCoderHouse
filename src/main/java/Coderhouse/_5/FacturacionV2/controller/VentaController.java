package Coderhouse._5.FacturacionV2.controller;

import Coderhouse._5.FacturacionV2.model.Venta;
import Coderhouse._5.FacturacionV2.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @PostMapping("/agregarVenta")
    @Api(tags = "VentaController", description = "Operaciones relacionadas con Ventas")
    @ApiOperation(value = "Agregar una nueva venta", notes = "Este metodo permite agregar una venta con un cliente y productos")
    public String agregarVenta(@ApiParam (value = "Datos de la venta a agregar", required = true)@PathVariable long clienteId, @RequestBody Venta venta) {
        return ventaService.agregarVenta(clienteId, ventaProducto.getProducto().getId(), ventaProducto.getCantidad());
    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Buscar venta por ID", notes = "Este metodo busca una venta existente por su ID")
    public Optional<Venta> buscarVentaPorId(@PathVariable Long id) {
        return ventaService.buscarVenta(id);
    }

    @DeleteMapping("/cancelar/{id}")
    @ApiOperation(value = "Cancelar venta por ID", notes = "Este metodo busca cancelar una venta existente por su ID")
    public String cancelarVenta(@ApiParam(value = "Cancelar venta por ID", required = true)@PathVariable Long id) {
        boolean cancelada = ventaService.cancelarVenta(id);
        if (cancelada) {
            return "Venta cancelada con éxito";
        } else {
            return "No se pudo cancelar la venta";
        }
    }

    private final VentaService ventaService;

    public VentaController (VentaService ventaService){
        this.ventaService = ventaService;
    }
}