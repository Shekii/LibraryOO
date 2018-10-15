/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Harry Walker
 */
public class Storage implements Serializable 
{
    
    private final String booksFileName = "data/books.bin";
    private final String membersFileName = "data/members.bin";
    
    private SetOfBooks theBooks = new SetOfBooks();
    private SetOfMembers theMembers = new SetOfMembers();
    
    public Storage(SetOfMembers theMembers, SetOfBooks theBooks) 
    {
       this.theBooks = theBooks;
       this.theMembers = theMembers;
       
    }
    
    public SetOfMembers getDataMembers()
    {
        SetOfMembers members = null;
        try 
        {
            FileInputStream inputMembers =
                    new FileInputStream(this.membersFileName);
            
            try 
            {
                ObjectInputStream objectInputStream =
                        new ObjectInputStream(inputMembers);
                
                members = (SetOfMembers) objectInputStream.readObject();
                
                objectInputStream.close();
                
            } 
            catch (IOException | ClassNotFoundException ex) 
            {
                Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, ex);
                
            }

        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return members;
    }
    
    public SetOfBooks getDataBooks()
    {
        SetOfBooks books = null;
        try 
        {
            FileInputStream inputMembers =
                    new FileInputStream(this.booksFileName);
            
            try 
            {
                ObjectInputStream objectInputStream =
                        new ObjectInputStream(inputMembers);
                
                books = (SetOfBooks) objectInputStream.readObject();
                
                objectInputStream.close();
                
            } 
            catch (IOException | ClassNotFoundException ex) 
            {
                Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, ex);
                
            }

        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return books;
    }
    
    public void saveDataToFile(SetOfBooks theBooks, SetOfMembers theMembers)
    {
        try 
        {
            FileOutputStream bookFOS =
                    new FileOutputStream(this.booksFileName);
            
            FileOutputStream membersFOS =
                    new FileOutputStream(this.membersFileName);
            try {
                ObjectOutputStream bookOOS =
                        new ObjectOutputStream(bookFOS);
                
                ObjectOutputStream membersOOS =
                        new ObjectOutputStream(membersFOS);
                
                bookOOS.writeObject(theBooks);
                bookOOS.flush();
                bookOOS.close();
                
                membersOOS.writeObject(theMembers);
                membersOOS.flush();
                membersOOS.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
