/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.*;
/**
 *
 * @author Aldo Marquez y Luis Suarez
 */
public class Venta {
    private Fecha fecha;
    private Vendedor vend;
    private int formaPago;
    private int promo;
    

    public Venta(Fecha fecha, Vendedor vend, int formaPago, int promo) {
        this.fecha = fecha;
        this.vend = vend;
        this.formaPago = formaPago;
        this.promo = promo;
    }
   
    private ArrayList <Subtotal> subTotal = new ArrayList();

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Vendedor getVend() {
        return vend;
    }

    public void setVend(Vendedor vend) {
        this.vend = vend;
    }

    public int getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(int formaPago) {
        this.formaPago = formaPago;
    }

    public int getPromo() {
        return promo;
    }

    public void setPromo(int promo) {
        this.promo = promo;
    }

    public ArrayList<Subtotal> getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(ArrayList<Subtotal> subTotal) {
        this.subTotal = subTotal;
    }
    
     public void agregarSubTotal(Producto producto,
            int cantidad) {
        subTotal.add(new Subtotal(producto, cantidad));
    }


     public double getTotal() {
        double total=0;
        for (Subtotal s : subTotal) {
            total += s.getSubtotal();
        }
        return total;
    }

    
    @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + ", vend=" + vend + ", formaPago=" + formaPago + ", subtotal=" + subTotal + ", Total=" + getTotal() + '}';
    }
}
