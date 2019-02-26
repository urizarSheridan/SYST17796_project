package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards 
{
   
    private ArrayList<Card> cards;
    private int size;
    
    
    //non-default constructor
    public GroupOfCards(int size)
    {
        this.size = size;
    }
    
    
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    
    //accessor and mutator 
    public void setSize(int size) 
    {
        this.size = size;
    }
    public int getSize() 
    {
        return size;
    }
        
}