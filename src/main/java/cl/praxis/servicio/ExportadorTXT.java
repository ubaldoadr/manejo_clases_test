package cl.praxis.servicio;

import cl.praxis.modelo.Cliente;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ExportadorTXT extends  Exportador{

    @Override
    public void exportar(String myFile, List<Cliente> listaClientes) {


        File newFile = new File("C:/Users/dell/Desktop/"+myFile+".txt");
        try {
            if (!newFile.exists()) {
                newFile.createNewFile();
            }

            FileWriter fr = new FileWriter(newFile);
            PrintWriter br = new PrintWriter(fr,true);

            String data;
            for (int i = 0; i < listaClientes.size(); i++) {
                Cliente c = listaClientes.get(i);
                data = c.getRunCliente()+" "+c.getNombreCliente()+" "+c.getApellidoCliente()+" "+c.getAniosCliente()+" "+c.getNombreCategoria()+"\n";
                fr.write(data);
            }
            fr.close();
            br.close();
            System.out.println("Archivo CSV exportado con exito en: " + newFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
