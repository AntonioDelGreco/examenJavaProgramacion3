package org.antoniodelgrecodiego.Model;

import org.antoniodelgrecodiego.Model.enums.Marca;
import org.antoniodelgrecodiego.Model.enums.Material;

public class Abertura {
    private Marca marca;
    private Double largo;
    private Double ancho;
    private Material material;
    private Double precio;
    private Cliente cliente;
    private Double resistencia;

    public Abertura(){}

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getResistencia() {
        return resistencia;
    }

    public void setResistencia(Double resistencia) {
        this.resistencia = resistencia;
    }

    public void resistencia() {
        Material material = getMaterial();
        switch (material){
            case MADERA:
                setResistencia(getLargo() * getAncho() * 1.8);
                break;
            case ALUMINIO:
                setResistencia(getLargo() * getAncho() * 1.2);
                break;
            case CHAPA:
                setResistencia(getLargo() * getAncho() * 2.2);
                break;
        }
    }


    @Override
    public String toString() {
        return "Abertura{" +

                "marca=" + marca +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", material=" + material +
                ", " + cliente +
                ", resistencia=" + resistencia +
                '}';
    }
}
