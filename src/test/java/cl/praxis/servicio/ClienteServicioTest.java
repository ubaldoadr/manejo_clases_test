package cl.praxis.servicio;

import cl.praxis.modelo.CategoriaEnum;
import cl.praxis.modelo.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteServicioTest {

    ClienteServicio clienteServicio = new ClienteServicio();
    @Test
    void agregarClienteTest() {
        Cliente ct = new Cliente("182360148", "Magali", "Quintanilla", "36", CategoriaEnum.Inactivo);
        assertTrue(clienteServicio.getListaClientes().isEmpty());
        clienteServicio.agregarCliente(ct);
        assertFalse(clienteServicio.getListaClientes().isEmpty());
    }
    @Test
    void agregarClienteNullTest() {
        Cliente ct = null;
        clienteServicio.agregarCliente(ct);
        assertFalse(clienteServicio.getListaClientes().isEmpty());
    }
}