/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Vendedor {
    private int Id;
    private String Nombre;
    private String Apellido;
    private int Contador=0;
    
    
    public Vendedor(int Id, String Nombre, String Apellido) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
ArrayList<Venta> lista = new ArrayList<>();
  public void agregarVenta (Venta venta) {
        lista.add(venta);
        this.Contador++;
    }

    public int getContador() {
        return Contador;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }

  
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "Id=" + Id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + '}';
    }

  
    
}
