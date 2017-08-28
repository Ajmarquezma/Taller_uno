/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Estudiante
 */
public class Producto {
    private int Codigo;
    private String Descripcion;
    private double PrecioUnitario;

    public Producto(int Codigo, String Descripcion, int PrecioUnitario) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.PrecioUnitario = PrecioUnitario;
    }    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(int PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    @Override
    public String toString() {
        return "Producto{" + "Codigo=" + Codigo + '}';
    }
    
    
}
