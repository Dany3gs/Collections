package Pag7;

import java.util.ArrayList;
import java.util.Iterator;

public class ListarIncidencias {
    private ArrayList<Incidencias> listaIncidencias;


    public ListarIncidencias() {
        listaIncidencias = new ArrayList<>();
    }


    public void cargarIncidencias(Incidencias incidencia) {
        listaIncidencias.add(incidencia);
    }

    public void listarIncidencias() {
        if (listaIncidencias.isEmpty()) {
            System.out.println("No hay incidencias registradas.");
        } else {
            System.out.println("Listado de incidencias:");
            for (Incidencias inc : listaIncidencias) {
                System.out.println(inc);
            }
        }
    }

    public void anadirIncidencia(Incidencias incidencia) {
        if (incidencia != null) {
            listaIncidencias.add(incidencia);
        }
    }

    public boolean eliminarIncidencia(int idIncidencia) {
        Iterator<Incidencias> it = listaIncidencias.iterator();
        while (it.hasNext()) {
            Incidencias inc = it.next();
            if (inc.getIdIncidencia() == idIncidencia) {
                it.remove();
                System.out.println("Incidencia "+ idIncidencia +" eliminada correctamente.");
                return true;
            }
        }
        System.out.println("No se encontró ninguna incidencia con el código: " + idIncidencia);
        return false;
    }

    public void existeIncidencia(int idIncidencia) {
        for (Incidencias inc : listaIncidencias) {
            if (inc.getIdIncidencia() == idIncidencia) {
                System.out.println("La incidencia con id " + idIncidencia + " existe.");
                return;
            }
        }
        System.out.println("La incidencia con id " + idIncidencia + " no existe.");
    }
}
