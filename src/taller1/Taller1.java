/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author Luis Fernando Suarez y Aldo Marquez
 */
public class Taller1 {

    
   
    public static void main(String[] args) {
        
        Student student=new Student("Jon Java","jj@javauniv.edu");
        LibraryCard card1=new LibraryCard(student, 3);
        LibraryCard card2=new LibraryCard(student, 0);
        System.out.println(card1);
        
    }
    
}
