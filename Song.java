/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private int seconds;
    private String time;
    private boolean like;
    private String artist;
    private String title;
    



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(int duration, String artistName, String titleName)
    {
        seconds = duration;
        artist = artistName;
        title = titleName;
        like = false;
        time = "";
    }


    




     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    
      //method to get title
      public String getTitle()
      {
        return title;
      }

      //method to get artist name
      public String getName()
      {
        return artist;
      }

      //method to get song duration
      public String getDuration()
      {
        String time;
        int minutes = 0;
        while(seconds > 60)
        {
            minutes += 1;
            seconds -= 60;
        }
        time = minutes + " : " + seconds;
        return time;
      }

      //method to like song
      public void setLike()
      {
        like = true;
      }
      //method to remove like
      public void removeLike()
      {
        like = false;
      }
      //method to get like condition
      public boolean getLike()
      {
        return like;
      }

      public String toString()
      {
        return title + " by " + artist + " (" + time + ") ";
      }


}
