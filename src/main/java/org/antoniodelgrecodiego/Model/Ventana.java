package org.antoniodelgrecodiego.Model;

import org.antoniodelgrecodiego.Model.enums.TipoVentana;

public class Ventana extends Abertura {
    private TipoVentana tipoVidrio;

    public TipoVentana getTipoVidrio() {
        return tipoVidrio;
    }

    public void setTipoVidrio(TipoVentana tipoVidrio) {
        this.tipoVidrio = tipoVidrio;
    }

}
