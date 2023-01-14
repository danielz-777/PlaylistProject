/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist p = new Playlist();
        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        p.addSong(new Song(430, "John", "Wjoasjof"));
        p.addSong(new Song(450, "dsds", "dasdasd"));
        p.addSong(new Song(230, "Peppa Pig", "Peppa"));
        p.addSong(new Song(580, "alskalsfj", "iashfi"));
        p.addSong(new Song(180, "popoeqw", "oqwiqwiq"));




        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        p.showAllSongs();

        System.out.println("\nLiking the songs in position 1, 3, 4, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p.likeSong(1);
        p.likeSong(3);
        p.likeSong(4);
        

        System.out.println("Printing the songs...\n");
        p.showAllSongs();

        System.out.println("\nRemoving the song in position 2, 3,  etc...\n");
        p.removeSong(2);
        p.removeSong(3);

        System.out.println("Printing the songs...\n");
        p.showAllSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        p.showLikedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(p.totalDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        p.removeUnlikedSongs();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        p.showAllSongs();
    }
}
