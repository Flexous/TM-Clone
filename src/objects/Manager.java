package objects;

public class Manager extends Object
{
    private String firstname;
    private String lastname;

    private Player retiredPlayer;

    public Manager()
    {

    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public Player getRetiredPlayer()
    {
        return retiredPlayer;
    }

    public void setRetiredPlayer(Player retiredPlayer)
    {
        this.retiredPlayer = retiredPlayer;
    }
}
