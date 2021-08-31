package objects;

import java.util.Date;

import javax.swing.ImageIcon;

public class Player extends Object 
{
	private String firstname;
	private String lastname;
	private Date birthdate;
	private Location birthplace;
	private int size;

	private ImageIcon image;

	public Player() 
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

	public Date getBirthdate()
	{
		return birthdate;
	}

	public void setBirthdate(Date birthdate)
	{
		this.birthdate = birthdate;
	}

	public Location getBirthplace()
	{
		return birthplace;
	}

	public void setBirthplace(Location birthplace)
	{
		this.birthplace = birthplace;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	public ImageIcon getImage()
	{
		return image;
	}

	public void setImage(ImageIcon image)
	{
		this.image = image;
	}
}
