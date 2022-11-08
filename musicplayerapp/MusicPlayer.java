import java.util.ArrayList;
import java.util.HashMap;

public class MusicPlayer {

    private String songType;
    private String inputSongs;

    //Create constructor to enter the song requested to be played
    public MusicPlayer(String inputSongs){
        this.inputSongs = inputSongs;
    }

    //Create method
    public String getInputSongs(){
        return inputSongs;
    }

    /*This method contains songs that belong to a particular album, it checks if the
     requested song exits in the list to play it. If it doesn't exist it sends out a message of non-existance.
     */
    public void playInputSongs(){
        //Enter a album that contains it's name and artist using hashmap
        songType = "Hip-Hop";
        HashMap<String, String> albumDetail = new HashMap<>();
        albumDetail.put("So Good","Zara Larsson");

        //converting hashmap to arraylist and displaying the album names
        ArrayList<String> album = new ArrayList<>(albumDetail.keySet());
        for(String a : album){
            System.out.println(a+" " + albumDetail.values()+": "+songType);
        }

        //Inserting song titles containing it's name and album name
        HashMap<String, String> albumSong = new HashMap();
        albumSong.put("What They Say", "So Good");
        albumSong.put("Never forget you", "So Good");
        albumSong.put("I can't fall in love without you", "So Good");

        //converting hashset to arraylist and displaying the song titles
        ArrayList<String> music = new ArrayList<>(albumSong.keySet());
        for (String m : music) {
            System.out.println(m);
        }

        //Checking if the requested song exists so it can be played, if not a non-existance message is displayed.
        if(music.contains(inputSongs)){
            System.out.println("Now Playing " + inputSongs);
        }else {
            System.out.println("Song not found!!!!!!!!!");
        }
    }



    //Main method
    public static void main(String[] args) {
        MusicPlayer playMusic = new MusicPlayer("I can't fall in love without you");
        playMusic.playInputSongs();
    }
}
