package org.antoniodelgrecodiego.View;

import org.antoniodelgrecodiego.Model.*;
import org.antoniodelgrecodiego.Model.enums.*;
import org.antoniodelgrecodiego.Persistence.AberturaRepositorioMemoria;

import static org.antoniodelgrecodiego.Utils.Consola.*;

public class IngresarVenta {
    private static final AberturaRepositorioMemoria db = new AberturaRepositorioMemoria();
    private Cliente cliente = new Cliente();
    private Ventana ventana = new Ventana();
    private Puerta puerta = new Puerta();
    private PuertaVentana puertaVentana = new PuertaVentana();
    private Integer tipoAbertura;
    private Integer marca;
    private Double largo;
    private Double ancho;
    private Integer material;
    private Double precio;
    private String apellido;
    private String email;
    private Long dni;

    public IngresarVenta(){}

    public void pidiendoDatos(){

        printLn("Elegir: 1)Puerta - 2)Ventana - 3)PuertaVentana ");
        tipoAbertura = leerInt();
        switch (tipoAbertura){
            case 1:
                //PUERTA
                Integer tipoPuerta;
                Double espesor;

                datosGenerales();
                printLn("Tipo de puerta: 1)Derecha - 2)Izquierda");
                tipoPuerta = leerInt();
                printLn("Espesor: ");
                espesor = leerDouble();

                if (marca == 1){
                    puerta.setMarca(Marca.ESTEBAN);
                }else{
                    puerta.setMarca(Marca.OBLACK);
                }

                if (material == 1){
                    puerta.setMaterial(Material.MADERA);
                } else if (material == 2) {
                    puerta.setMaterial(Material.ALUMINIO);
                }else {
                    puerta.setMaterial(Material.CHAPA);
                }

                if (tipoPuerta == 1){
                    puerta.setTipoPuerta(TipoPuerta.DERECHA);
                }else {
                    puerta.setTipoPuerta(TipoPuerta.IZQUIERDA);
                }

                puerta.setLargo(largo);
                puerta.setAncho(ancho);
                puerta.setPrecio(precio);
                puerta.setCliente(cliente);
                puerta.setEspesor(espesor);
                puerta.resistencia();

                db.save(puerta);
                break;
            case 2:
                //VENTANA
                Integer tipoVidrio;
                datosGenerales();
                printLn("Tipo de vidrio: 1)Esmerilado - 2)Comun");
                tipoVidrio = leerInt();

                if (marca == 1){
                    ventana.setMarca(Marca.ESTEBAN);
                }else{
                    ventana.setMarca(Marca.OBLACK);
                }

                if (material == 1){
                    ventana.setMaterial(Material.MADERA);
                } else if (material == 2) {
                    ventana.setMaterial(Material.ALUMINIO);
                }else {
                    ventana.setMaterial(Material.CHAPA);
                }

                if (tipoVidrio == 1){
                    ventana.setTipoVidrio(TipoVentana.ESMERILADO);
                }else {
                    ventana.setTipoVidrio(TipoVentana.COMUN);
                }

                ventana.setLargo(largo);
                ventana.setAncho(ancho);
                ventana.setPrecio(precio);
                ventana.setCliente(cliente);
                ventana.resistencia();

                db.save(ventana);
                break;
            case 3:
                //PUERTA VENTANA
                Integer tipoPuertaVentana;
                Integer cantHojas;

                datosGenerales();
                printLn("Tipo de vidrio: 1)Corredizas - 2)Abrir");
                tipoPuertaVentana = leerInt();
                printLn("Diga la cantidad de hojas de la puertaVentana: ");
                cantHojas = leerInt();

                if (marca == 1){
                    puertaVentana.setMarca(Marca.ESTEBAN);
                }else{
                    puertaVentana.setMarca(Marca.OBLACK);
                }

                if (material == 1){
                    puertaVentana.setMaterial(Material.MADERA);
                } else if (material == 2) {
                    puertaVentana.setMaterial(Material.ALUMINIO);
                }else {
                    puertaVentana.setMaterial(Material.CHAPA);
                }

                if (tipoPuertaVentana == 1){
                    puertaVentana.setTipoPuertaVentana(TipoPuertaVentana.CORREDIZAS);
                }else {
                    puertaVentana.setTipoPuertaVentana(TipoPuertaVentana.ABRIR);
                }

                puertaVentana.setLargo(largo);
                puertaVentana.setAncho(ancho);
                puertaVentana.setPrecio(precio);
                puertaVentana.setCliente(cliente);
                puertaVentana.setCantHojas(cantHojas);
                puertaVentana.resistencia();

                db.save(puertaVentana);
                break;
            default:
                break;
        }
    }

    private void datosGenerales(){
        printLn("Marca: 1)Esteban - 2)Oblack");
        marca = leerInt();
        printLn("Largo: ");
        largo = leerDouble();
        printLn("Ancho: ");
        ancho = leerDouble();
        printLn("Material: 1)Madera - 2)Aluminio - 3)Chapa");
        material = leerInt();
        printLn("Diga el precio de la venta: ");
        precio = leerDouble();
        printLn("Datos del cliente, escribalos en este orden pulsando enter luego de cada uno: Apellido, Email, DNI. ");
        apellido = leerString();
        email = leerString();
        dni = leerLong();

        cliente.setApellido(apellido);
        cliente.setEmail(email);
        cliente.setDni(dni);
    }
}
