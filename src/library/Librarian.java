/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Harry Walker
 */
public class Librarian extends Member {
    
    private final int MAX_LOAN = 6;
    
    public Librarian(String name)
    {
        super(name);
    }
    
    @Override
    public int getMaxLoan()
    {
        return this.MAX_LOAN;
    }
     
    

}
