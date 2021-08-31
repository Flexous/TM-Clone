package objects;

import java.util.ArrayList;

public class Stadium extends Object
{
    private String name;
    private ArrayList<String> historicNames = new ArrayList<>();
    private int capacity;

    public Stadium()
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

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
}
