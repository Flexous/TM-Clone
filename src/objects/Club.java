package objects;

import java.util.ArrayList;

public class Club extends Object
{
    private String name;
    private ArrayList<String> historicNames = new ArrayList<>();
    
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Player> loanedPlayers = new ArrayList<>();

    private double marketvalue;

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

    public ArrayList<Player> getLoanedPlayers()
    {
        return loanedPlayers;
    }

    public double getMarketvalue()
    {
        return marketvalue;
    }

    public void setMarketvalue(double marketvalue)
    {
        this.marketvalue = marketvalue;
    }
}
