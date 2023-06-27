package org.antoniodelgrecodiego.Model;

import org.antoniodelgrecodiego.Model.enums.TipoPuertaVentana;

public class PuertaVentana extends Abertura{
    private TipoPuertaVentana tipoPuertaVentana;
    private Integer cantHojas;

    public TipoPuertaVentana getTipoPuertaVentana() {
        return tipoPuertaVentana;
    }

    public void setTipoPuertaVentana(TipoPuertaVentana tipoPuertaVentana) {
        this.tipoPuertaVentana = tipoPuertaVentana;
    }

    public Integer getCantHojas() {
        return cantHojas;
    }

    public void setCantHojas(Integer cantHojas) {
        this.cantHojas = cantHojas;
    }

    @Override
    public String toString() {
        return "PuertaVentana{" +
                "tipoPuertaVentana=" + tipoPuertaVentana +
                ", cantHojas=" + cantHojas +
                '}';
    }
}
