/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.exceptions;

/**
 *
 * @author b5044102
 */
public class TooManyLoanedException extends Exception
{
    
    public TooManyLoanedException() {}
    
    public TooManyLoanedException(String message)
    {
        super(message);
    }
    
}
