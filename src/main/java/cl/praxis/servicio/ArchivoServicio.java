package cl.praxis.servicio;

import cl.praxis.modelo.CategoriaEnum;
import cl.praxis.modelo.Cliente;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ArchivoServicio extends Exportador{

    @Override
    public void exportar(String myFile, List<Cliente> listaClientes) {
        cargarDatos(myFile,listaClientes);
    }
    void cargarDatos(String myFile,List<Cliente> listaClientes){


        File newFile = new File("C:/Users/dell/Desktop/"+myFile);

        if (!newFile.exists()) {
            newFile.mkdirs();
        }
        try {

            FileReader fr = new FileReader(newFile);
            BufferedReader br = new BufferedReader(fr);
            String valor;
            while ((valor = br.readLine()) != null) {
                String [] aux = valor.split(",");
                Cliente newCliente = new Cliente(aux[0],aux[1],aux[2],aux[3], CategoriaEnum.valueOf(aux[4]));
                listaClientes.add(newCliente);
            }
            fr.close();
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
