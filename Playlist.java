import java.io.* ;
import java.util.*;
public class Playlist {
    String playListName;
    int same;
    ArrayList<Track> playList = new ArrayList<Track>();
    ArrayList<Track> playRandom;
    //HashSet<String> playlistTitles = new HashSet<String>();

    public Playlist(){
        ArrayList<Track> playList = new ArrayList<Track>();
        this.playListName = "Playlist";
    }
    
    public Playlist(String playListName){
        // for(int i = 0; i < playlistTitles.size(); i++){
            // if(!this.playListName.equalsIgnoreCase(playListName)) {
                // this.playListName = playListName;
                // playlistTitles.add(playListName);
                // ArrayList<Track> playList = new ArrayList<Track>();
            // }else{
                
            // }
        // }
        this.playListName = playListName;
    }
    
   public void setName(String name){
        this.playListName = name;
    }
    
    public String getName(){
        return this.playListName;
    }
    
    public void add(String title, String artist){
        playList.add(new Track(title, artist));
    }
    
    public void add(String title, String artist, int year, int duration){
        playList.add(new Track(title, artist, year, duration));
    }
    //e.g. t = instance1
    public void add(Track t){
        playList.add(t);
    }
    
    void sort() {
          Collections.sort(playList);
    }
    
    public void showList(){
        if(playList.size() > 0){
           System.out.println(playList);
       } else if(playList.size() == 0){
           System.out.println("The list is empty");
       }
    }
    
    public boolean remove(String title){
        boolean removed = false;
        for(int i = 0; i < playList.size(); i++){
            String playListTitle = playList.get(i).getTitle();
            if(playListTitle.equalsIgnoreCase(title)){
                playList.remove(i);
                removed = true;
                break;
            } else {
                removed = false;
            }
        }
        return removed;
    }
    
    
    public String toString(){
       String playlist = this.playListName;
       for(int i = 0; i < playList.size(); i++){
           playlist = playlist + "\n" + "Track" + (i+1) + ":" + "(" + playList.get(i).getTitle() 
           + " - " + playList.get(i).getArtist() + " - " + playList.get(i).getYear()
           + " - " + playList.get(i).getDuration() + ")";
        }
       System.out.println(playlist);
       return playlist;
    }
    
    public void playOnly(String artist){
        for(int i = 0; i < playList.size(); i++){
            artist = artist.toLowerCase();
            String playlistArtist = playList.get(i).getArtist().toLowerCase();
            if (playlistArtist.contains(artist)){
                System.out.print(playList.get(i));
            }
        }
    }
    
    public void playOnly(int year){
        for(int i = 0; i < playList.size(); i++){
            int playlistYear = Integer.parseInt(playList.get(i).getYear());
            if (year == playlistYear){
                System.out.print(playList.get(i));
            }
        }
    }
    
    public void play(boolean random){
        if(!random){
            for(int i = 0; i < playList.size(); i++){
                System.out.print(playList.get(i));
            }
        } else {
            playRandom = new ArrayList<Track>(playList);
            Collections.shuffle(playRandom);
            for(int i = 0; i < playRandom.size(); i++){
                System.out.print(playRandom.get(i));
            }
        }
    }
}
