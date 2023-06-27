package org.antoniodelgrecodiego.View;

import org.antoniodelgrecodiego.Model.Abertura;
import org.antoniodelgrecodiego.Model.Ventana;
import org.antoniodelgrecodiego.Persistence.AberturaRepositorioMemoria;

public class TotalVentanas {
    private static final AberturaRepositorioMemoria db = new AberturaRepositorioMemoria();

    public TotalVentanas() {}

    public void total() {
        double sumaPreciosVentanas = 0.0;

        for (Abertura abertura : db.getAllAberturas()) {
            if (abertura instanceof Ventana) {
                Ventana ventana = (Ventana) abertura;
                double precio = ventana.getPrecio();
                sumaPreciosVentanas += precio;
            }
        }

        System.out.println("Suma de precios de ventanas: " + sumaPreciosVentanas);
    }
}
