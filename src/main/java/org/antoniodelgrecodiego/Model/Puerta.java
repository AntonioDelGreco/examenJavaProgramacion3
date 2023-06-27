package org.antoniodelgrecodiego.Model;

import org.antoniodelgrecodiego.Model.enums.TipoPuerta;

public class Puerta extends Abertura {
    private TipoPuerta tipoPuerta;
    private Double espesor;

    public TipoPuerta getTipoPuerta() {
        return tipoPuerta;
    }

    public void setTipoPuerta(TipoPuerta tipoPuerta) {
        this.tipoPuerta = tipoPuerta;
    }

    public Double getEspesor() {
        return espesor;
    }

    public void setEspesor(Double espesor) {
        this.espesor = espesor;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "tipoPuerta=" + tipoPuerta +
                ", espesor=" + espesor +
                '}';
    }
}
