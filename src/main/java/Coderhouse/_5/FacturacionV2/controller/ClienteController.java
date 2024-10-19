package Coderhouse._5.FacturacionV2.controller;

import Coderhouse._5.FacturacionV2.model.Cliente;
import Coderhouse._5.FacturacionV2.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotaion;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
@Api (tags = "ClienteController", description = "Operaciones relacionadas a clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/agregar")
    @ApiOperation(value = "Agregar un nuevo cliente", notes = "Este metodo permite agregar un cliente.")
    public String agregarCliente(@ApiParam (value = "Datos del cliente a agregar", requerid = true)@RequestBody Cliente cliente) {
        return "Cliente agregado con exito";
    }

    @GetMapping("/buscar/{id}")
    public Optional<Cliente> buscarCliente(@ApiParam (value = "ID del cliente a buscar", requerid = true)@PathVariable Long id) {
        return Optional.of(new Cliente());
    }

    @GetMapping("/buscar/{nombre}")
    public Optional<Cliente> buscarCliente((@ApiParam (value = "Nombre del cliente a buscar", requerid = true)@PathVariable String nombre) {
        return Optional.of(new Cliente());
    }

    @DeleteMapping("/eliminar")
    @ApiOperation(value = "Eliminar cliente por ID", notes = "Este metodo busca eliminar un cliente existente por su ID")
    public String eliminarCliente(@ApiParam(value = "Eliminar cliente por ID", required = true)@PathVariable long id) {
        clienteService.eliminarCliente(Cliente);
        return "Cliente eliminado con éxito";
    }
}
