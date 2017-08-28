package ejercicio2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FLIA. ESCAMAL
 */
public class Subtotal {
    private Producto precio;
    private int cantidad;

    public Subtotal(Producto precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto getPrecio() {
        return precio;
    }

    public void setPrecio(Producto precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public double getSubtotal(){
        return this.getCantidad() * precio.getPrecioUnitario();
        
}

    @Override
    public String toString() {
        return "Subtotal{" + "precio=" + precio + ", cantidad=" + cantidad + '}';
    }

   
     
}
