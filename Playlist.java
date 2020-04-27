
import java.io.* ;
import java.util.*;
public class Playlist{
    ArrayList<ArrayList<String>> playlist = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> playRandom;
    //or
    // List<String> trackTitle = new ArrayList<String>();
    // List<String> trackArtist = new ArrayList<String>();
    // List<String> trackYear = new ArrayList<String>();
    // List<String> trackDuration = new ArrayList<String>();
    public Playlist(){
        ArrayList<ArrayList<String>> playlist = new ArrayList<ArrayList<String>>();
    }
    public void add(String title, String artist){
        Track instance = new Track(title, artist);
        playlist.add(instance.trackArrList());
    }
    
    public void add(String title, String artist, int year, int duration){
        Track instance = new Track(title, artist, year, duration);
        playlist.add(instance.trackArrList());
    }
    //e.g. t = instance1
    public void add(Track t){
        playlist.add(t.trackArrList());
    }
    
    public boolean remove(String title){
        boolean removed = false;
        for(int i = 0; i < playlist.size(); i++){
            String playlistTitle = playlist.get(i).get(0);
            if(playlistTitle.equalsIgnoreCase(title)){
                playlist.remove(i);
                removed = true;
                break;
            } else {
                removed = false;
            }
        }
        
        for(int i = 0; i < playlist.size(); i++){
            System.out.println(playlist.get(i));
        }
        return removed;
    }
    
    public void print(){
        System.out.println(playlist);
    }
    
    public void playOnly(String artist){
        for(int i = 0; i < playlist.size(); i++){
            artist = artist.toLowerCase();
            String playlistArtist = playlist.get(i).get(1).toLowerCase();
            if (playlistArtist.contains(artist)){
                System.out.println(playlist.get(i));
            }
        }
    }
    
    public void playOnly(int year){
        for(int i = 0; i < playlist.size(); i++){
            int playlistYear = Integer.parseInt(playlist.get(i).get(2));
            if (year == playlistYear){
                System.out.println(playlist.get(i));
            }
        }
    }
    
    public void play(boolean random){
        if(!random){
            for(int i = 0; i < playlist.size(); i++){
                System.out.println(playlist.get(i));
            }
        } else {
            playRandom = new ArrayList<ArrayList<String>>(playlist);
            Collections.shuffle(playRandom);
            for(int i = 0; i < playRandom.size(); i++){
                System.out.println(playRandom.get(i));
            }
        }
    }
}
