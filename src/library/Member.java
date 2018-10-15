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
public class Member implements Serializable {
    
    private String name;

    private int memberNumber;
    private SetOfBooks currentLoans = new SetOfBooks();
    
    private static int memberCount = 0;
    
    private final int MAX_LOAN = 3;
    
    public Member() {}
    
    public Member(String aName){
     name = aName;
     memberNumber = memberCount++;
     currentLoans = new SetOfBooks();
    }
    
    public int getMaxLoan()
    {
        return this.MAX_LOAN;
    }        
            
    
    @Override
    public String toString(){
        return Integer.toString(memberNumber) + " " + name;
        
    }

    public void borrowBook(Book aBook){
        currentLoans.addBook(aBook);
        aBook.setBorrower(this);
    }
    
    public void returnAllBooks()
    {
        for (Book aBook : currentLoans)
        {
            aBook.setBorrower(null);
        }
        
        this.currentLoans.clear();
    }
    
    public void returnBook(Book aBook)
    {
        currentLoans.remove(aBook);
        aBook.setBorrower(null);
    }
    
    public SetOfBooks getBooksOnLoan()
    {
        return this.currentLoans;
    }
    
    public void setMemberNumber(int memberNum)
    {
        this.memberNumber = memberNum;
    }
    
    public void setMemberName(String memberName)
    {
        this.name = memberName;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getMemberNumber()
    {
        return this.memberNumber;
    }
    
    public int numOnLoan()
    {
        return this.currentLoans.size();
    }
    
    
    
}

