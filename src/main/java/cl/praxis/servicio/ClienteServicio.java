package cl.praxis.servicio;

import cl.praxis.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteServicio {
    List<Cliente> listaClientes;

    public ClienteServicio(){
        this.listaClientes = new ArrayList<>();

    }
    public void retornoListarClientes(){
    }

    public void agregarCliente(Cliente cliente){
        this.listaClientes.add(cliente);
    }


    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
