package org.antoniodelgrecodiego.View;

import org.antoniodelgrecodiego.Model.Abertura;
import org.antoniodelgrecodiego.Model.Puerta;
import org.antoniodelgrecodiego.Model.PuertaVentana;
import org.antoniodelgrecodiego.Model.Ventana;
import org.antoniodelgrecodiego.Persistence.AberturaRepositorioMemoria;

import java.util.ArrayList;

public class ListarVentas {
    private static final AberturaRepositorioMemoria db = new AberturaRepositorioMemoria();

    public ListarVentas(){}

    public void mostrarTodas() {
        ArrayList<Abertura> aberturas = db.getAllAberturas();

        for (Abertura abertura : aberturas) {
            if (abertura instanceof Ventana) {
                Ventana ventana = (Ventana) abertura;
                System.out.println("Ventana: " + ventana.toString());
            } else if (abertura instanceof Puerta) {
                Puerta puerta = (Puerta) abertura;
                System.out.println("Puerta: " + puerta.toString());
            } else if (abertura instanceof PuertaVentana){
                PuertaVentana pv = (PuertaVentana) abertura;
                System.out.println("PuertaVentana: " + pv.toString());
            }
        }
    }
}

