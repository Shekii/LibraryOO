/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Harry Walker
 */
public class SetOfBooks extends ArrayList<Book> implements Serializable {


public SetOfBooks(){

    super();
}

public void addBook(Book aBook){
    super.add(aBook);
}

public boolean isBookUnique(Book book)
{
    return this.findBookFromISBN(book.getISBNNumber()) == null;
}

public void removeBook(Book aBook)
{
    if (aBook.isOnLoan())
        aBook.getBorrower().returnBook(aBook);
    
    super.remove(aBook);
}

public SetOfBooks findBookByAuthor(String author)
{
    SetOfBooks foundBooks = null;
    
    for (Book aBook : this)
    {
        if (aBook.getAuthor().equals(author))
        {
            foundBooks.add(aBook);
        }   
    }
    
    return foundBooks;
}

public SetOfBooks findBookByTitle(String title)
{
    SetOfBooks foundBooks = null;
    
    for (Book aBook : this)
    {
        if (aBook.getTitle().equals(title))
        {
            foundBooks.add(aBook);
        }   
    }
    
    return foundBooks;
}

public Book findBookFromISBN(int ISBN)
{
    
    for (Book aBook : this)
    {
        
        if (aBook.getISBNNumber() == ISBN)
        {
            return aBook;
        }   
    }
    
    return null;
}

public SetOfBooks findBooksFromAccNumber(int accNum)
{
    SetOfBooks foundBooks = null;
    
    for (Book aBook : this)
    {
        if (aBook.getBorrower().getMemberNumber() == accNum)
        {
            foundBooks.add(aBook);
        }   
    }
    
    return foundBooks; 
}








}
