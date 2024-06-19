package cl.praxis.servicio;

import cl.praxis.modelo.Cliente;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ExportadorCSV extends Exportador {

    @Override
    public void exportar(String fileName, List<Cliente> listaClientes) {


        File newFile = new File("C:/Users/dell/Desktop/"+fileName+".csv");
        try {
            if (!newFile.exists()) {
                newFile.createNewFile();
            }

            FileWriter fr = new FileWriter(newFile);
            PrintWriter br = new PrintWriter(fr,true);

            String valor;
            for (Cliente c : listaClientes) {
                valor = c.getRunCliente() + "," + c.getNombreCliente() + "," + c.getApellidoCliente() + "," + c.getAniosCliente() + "," + c.getNombreCategoria() + "\n";
                fr.write(valor);
            }
            fr.close();
            br.close();
            System.out.println("CSV exportado con éxito en " + newFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}