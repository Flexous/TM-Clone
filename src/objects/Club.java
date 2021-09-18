package objects;

import java.util.ArrayList;

public class Club extends Object
{
    private String name;
    private ArrayList<String> historicNames = new ArrayList<>();
    
    private ArrayList<Player> players = new ArrayList<>();

    public Club()
    {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<String> getHistoricNames()
    {
        return historicNames;
    }

    public ArrayList<Player> getPlayers()
    {
        return players;
    }
}
