package Coderhouse._5.FacturacionV2.controller;

import Coderhouse._5.FacturacionV2.model.Producto;
import Coderhouse._5.FacturacionV2.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
mport io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotaion;

import java.util.Optional;

@RestController
@RequestMapping("/productos")
@Api(tags = "ProductoController", description = "Operaciones relacionadas con productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/agregar")
    public String agregarProducto(@ApiParam(value ="Agregar un nuevo producto", notes = "Este metodo permite agregar un producto a la lista."
    )@RequestBody Producto producto) {
        return "Producto agregado con exito";
    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Buscar productos por ID", notes = "Este metodo busca un producto existente por su id")
    public <Producto> buscarProductoPorId(@ApiParam (value = "ID del prducto a buscar", required = true)@PathVariable Long id) {
        return productoService.buscarProducto(id);
    }

    @GetMapping("/buscar/{nombre}")
    @ApiOperation(value = "Buscar productos por ID", notes = "Este metodo busca un producto existente por su nombre")
    public <Producto> buscarProductoPorNombre(@ApiParam (value = "Nombre del prducto a buscar", required = true)@PathVariable String nombre) {
        return productoService.findForName(nombre);
    }

    @DeleteMapping("/eliminar")
    @ApiOperation(value = "Eliminar producto por ID", notes = "Este metodo busca eliminar un producto existente por su ID")
    public String eliminarProducto(@ApiParam(value = "Eliminar producto por ID", required = true)@PathVariable long id) {
        productoService.eliminarProducto(producto);
        return "Producto eliminado con éxito";
    }
}