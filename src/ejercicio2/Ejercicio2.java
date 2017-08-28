/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.*;

/**
 *
 * @author Luis Suarez y Aldo Marquez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Vendedor> v = new ArrayList<>();
        Producto a = new Producto(1, "primero", 1);
        Producto b = new Producto(2, "segundo", 1);
        Producto c = new Producto(3, "tercero", 1);
        Fecha hoy = new Fecha(1, 01, 2000);
        Fecha mañana = new Fecha(2, 02, 2001);
        Vendedor Juanito = new Vendedor(01, "Juanito", "Perez");
        v.add(Juanito);
        Vendedor Laura = new Vendedor(02, "Laura", "Lopez");
        v.add(Laura);
        Vendedor Pedro = new Vendedor(03, "Pedro", "Leon");
        v.add(Pedro);
        Venta primera = new Venta(hoy, Pedro, 1, 0);
        Venta primerab = new Venta(mañana, Juanito, 3, 0);
        Venta segunda = new Venta(mañana, Juanito, 2, 1);

        agregarVentaVendedores(primera);
        agregarVentaVendedores(primerab);
        agregarVentaVendedores(segunda);
        agregarProductosVenta(primera, a, 4);
        agregarProductosVenta(primera, b, 5);
        agregarProductosVenta(primerab, b, 10);
        agregarProductosVenta(segunda, b, 5);
        
        System.out.println(primera);
        System.out.println(primerab);
        System.out.println(segunda);

        double contador;
        int posicion = 0;
        for (Vendedor x : v) {
            boolean bandera = true;
            contador = x.getContador();
            for (Vendedor p : v) {
                double contadorr = p.getContador();
                if (contador < contadorr) {
                    bandera = bandera && false;
                }
            }
            if (bandera == true) {
                System.out.println("Vendedor de más ventas: " + v.get(posicion));
                break;
            }
            posicion++;
        }

    }
    ArrayList<Venta> ventas = new ArrayList<>();

    public static void agregarVentaVendedores(Venta venta) {
        Vendedor vendedor = venta.getVend();
        vendedor.agregarVenta(venta);
    }

    public static void agregarProductosVenta(Venta venta, Producto producto,
            int cantidad) {
        venta.agregarSubTotal(producto, cantidad);
    }

}
