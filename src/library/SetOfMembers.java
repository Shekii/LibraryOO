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
public class SetOfMembers extends ArrayList<Member> implements Serializable {


    void addMember(Member aMember) {
        aMember.setMemberNumber(getNumMembers() + 1);
        super.add(aMember);
    }
    
    public int getNumMembers()
    {
        return super.size();
    }
    
    void removeMember(Member aMember)
    {
        super.remove(aMember);
    }
    
    public Member getMemberFromName(String name)
    {

        Member foundMember = null;
        
        for (Member member : this)
        {
            if (member.getName().equals(name))
            {
                foundMember = member;
            }
        }
        
       return foundMember;
    }
    
    public Member getMemberFromNumber(int memberNum)
    {
        Member foundMember = null;
        
        for (Member member : this)
        {
            if (member.getMemberNumber() == memberNum)
            {
                foundMember = member;
            }
        }
        
       return foundMember;
    }
    
    
    

}
