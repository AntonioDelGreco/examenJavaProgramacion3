package org.antoniodelgrecodiego.View;

import static org.antoniodelgrecodiego.Utils.Consola.*;

public class Menu {

    private int opcion;
    private boolean salir = false;

    public Menu(){}

    public void menu(){
        while(!salir){

            try {
                printLn("SISTEMA DE VENTAS DE ABERTURA");
                printLn("1) Ingresar Venta");
                printLn("2) Listar todas las aberturas vendidas");
                printLn("3) Mostrar el total de dinero recaudado por las ventas");
                printLn("0) Salir del programa");

                printLn("Ingrese el numero de su opcion elegida:");
                opcion = leerInt();

                switch (opcion){
                    case 1:
                        IngresarVenta iv = new IngresarVenta();
                        iv.pidiendoDatos();
                        break;
                    case 2:
                        ListarVentas lv = new ListarVentas();
                        lv.mostrarTodas();
                        break;
                    case 3:
                        TotalVentanas tv = new TotalVentanas();
                        tv.total();
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        printLn("Numeros del 1 al 3");
                }
            }catch (Exception e){
                printLn("La opcion ingresada no es valida.");
                siguiente();
            }
        }
    }
}

