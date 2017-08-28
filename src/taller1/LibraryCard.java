/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author Estudiante
 */
public class LibraryCard {
    
    private Student owner;
    private int borrowCnt;

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    public int NumberOfBooks() {
        return borrowCnt;
    }

    public void checkOut(int borrowCnt) {
        this.borrowCnt = borrowCnt;
    }

    @Override
    public String toString() {
        return "LibraryCard{" + "owner=" + owner + ", borrowCnt=" + borrowCnt + '}';
    }

    public LibraryCard(Student owner, int borrowCnt) {
        this.owner = owner;
        this.borrowCnt = borrowCnt;
    }
    
    

    
    
}
