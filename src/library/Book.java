/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import java.io.Serializable;

/**
 *
 * @author Harry Walker
 */
public class Book implements Serializable {

    private final String title;
    private final int iSBNNumber;
    private final String author;
    
    private Member borrower = null;
    private static int bookCount = 0;
    private int accessionNumber;

    public Book(String title, String author, int iSBNNumber){
        this.title = title;
        this.accessionNumber = bookCount++;
        this.author = author;
        this.iSBNNumber = iSBNNumber;
    }
    

    void setBorrower(Member theBorrower) {
        borrower = theBorrower;
    }
    
    @Override
    public String toString()
    {
        return this.title + " - " +
               this.author + " - " +
               this.iSBNNumber;
    }
    
    public boolean isOnLoan()
    {
        return this.borrower != null;
    }

    Member getBorrower() {
        return borrower;
    }
    
    public String getAuthor()
    {
        return this.author;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public int getISBNNumber()
    {
        return this.iSBNNumber;
    }

}
