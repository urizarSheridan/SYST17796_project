package ca.sheridancollege.project;

public abstract class Player 
{

    private String ID;

    //non-default constructor
    public Player(String ID) 
    {
        this.ID = ID;
    }

//accessor and mutator
    public String getID() 
    {
        return ID;
    }
    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public abstract void play();

}
