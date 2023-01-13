import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
        private ArrayList<Song> playlist;




     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
        public Playlist()
        {
            playlist = new ArrayList<Song>();
        }


      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

        //method for adding song
        public void addSong(Song s1)
        {
            playlist.add(s1);
        }

        //method to like a song, use the setter method from Song
        public void likeSong(int position)
        {
            playlist.get(position).setLike();
            
        }

        //method to remove a specfic song, 
        public void removeSong(int position)
        {
            playlist.remove(position);
        }

        //method to examain all the songs, use toString method
        public void showAllSongs()
        {
            for(int i = 0; i < playlist.size(); i++)
            {
                System.out.print(playlist.get(i).toString());
            }

        }

        //method to get sublist of all liked songs
        public void showLikedSongs()
        {
            for(int i = 0; i < playlist.size(); i++)
            {
                if(playlist.get(i).getLike() == true)
                {
                    System.out.println(playlist.get(i).toString());
                }
            }
        }

        //method to determine total duration of all songs
        public String totalDuration()
        {
            int totalSeconds = 0;
            int totalMinutes = 0;
            for(int i = 0; i < playlist.size(); i++)
            {
                totalSeconds += playlist.get(i).getSeconds();

            }
            while(totalSeconds > 60)
            {
                totalMinutes += 1;
                totalSeconds -= 60;
            }
            return totalMinutes + " : " + totalSeconds;
            
        }

        //method to remove all unliked songs from list
        public void removeUnlikedSongs()
        {
            for(int i = 0; i < playlist.size(); i++)
            {
                if(playlist.get(i).getLike() == false)
                {
                    playlist.remove(i);
                    i--;
                }
            }
        }





        



        

        
}
