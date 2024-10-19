package Coderhouse._5.FacturacionV2.service;

import Coderhouse._5.FacturacionV2.model.Cliente;
import Coderhouse._5.FacturacionV2.model.Producto;
import Coderhouse._5.FacturacionV2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired

    private ClienteRepository clienteRepository;

    public Cliente agregarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> buscarCliente(Long id) {
        Cliente cliente = clienteRepository.findForId(id)
                .orElseThrow(() -> new RuntimeException("CLiente no encontrado"));
        return clienteRepository.findById(id);
    }

    public Optional<Cliente> buscarCliente(String nombre) {
        Cliente cliente = clienteRepository.findForName(nombre)
                .orElseThrow(() -> new RuntimeException("CLiente no encontrado"));
        return clienteRepository.findByName(nombre);
    }

    public Optional<Cliente> buscarCliente(String apellido) {
        Cliente cliente = clienteRepository.findForLastName(apellido)
                .orElseThrow(() -> new RuntimeException("CLiente no encontrado"));
        return clienteRepository.findByLastName(apellido);
    }

    public Optional<Cliente> eliminarCliente(Long id){
        Cliente cliente = ClienteRepository.deleteForId(id)
                .orElseThrow(() -> new RuntimeException("Cliente no eliminado"));
        return clienteRepository.deleteById(id);
    }

    Cliente cliente = new Cliente();
            cliente.setRegristoCliente(LocalDate.now());
            cliente.setNombreCliente(cliente);
            cliente.setDireccion(cliente);
            clienteSetNumeracion(cliente);
    cliente = clienteRepository.save(cliente);
}
