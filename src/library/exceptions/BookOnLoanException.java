/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.exceptions;

/**
 *
 * @author Harry Walker
 */
public class BookOnLoanException extends Exception
{
    
    public BookOnLoanException() {}
    
    public BookOnLoanException(String message)
    {
        super(message);
    }
}
