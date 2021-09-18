package objects;

import java.util.ArrayList;

public class Competition extends Object
{
   private String name;

   private ArrayList<Club> clubs = new ArrayList<>();
   
   public Competition()
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

   public void addClub(Club club)
   {
       clubs.add(club);
   }
}
