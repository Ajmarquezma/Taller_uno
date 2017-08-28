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
public class Fecha {
    private int Dia;
    private int Mes;
    private int Año;

    public Fecha(int Dia, int Mes, int Año) {
        this.Dia = Dia;
        this.Mes = Mes;
        this.Año = Año;
    }

   

    public int getDia() {
        return Dia;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    @Override
    public String toString() {
        return "Fecha{" + Dia + "/" + Mes + "/" + Año + '}';
    }
    
    
            
}
