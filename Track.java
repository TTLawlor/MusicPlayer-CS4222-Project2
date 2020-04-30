import java.io.* ;
import java.util.*;
public class Track implements Comparable<Track>
{
    private String title;
    private String artist;
    private String year;
    private String duration;
    int trackMins, trackSecs;
    
    
    public Track(String title, String artist){
        this.title = title;
        this.artist = artist;
        setYear(0);
        setDuration(0);
    }
    
    public Track(String title, String artist, int year, int duration){
        this.title = title;
        this.artist = artist;
        setYear(year);
        setDuration(duration);
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setArtist(String artist){
        this.artist = artist;
    }
    
    public String getArtist(){
        return this.artist;
    }
    
    public void setYear(int year){
        this.year = String.valueOf(year);
    }
    
    public String getYear(){
        return this.year;
    }
    
     public void setDuration(int seconds ){
        trackMins = (seconds/60)%60; 
        trackSecs = seconds%60;
        this.duration = String.valueOf(trackMins + ":" + trackSecs);
    }
    
    public String getDuration(){
        return this.duration;
    }
    
    public String toString(){
       return "(" + this.title + " - " + this.artist + " - " + this.year + " - " + this.duration + ")" + "\n";

    }
    
    public int compareTo(Track other) {
        // NOTE: the comparison is CASE INSENSITIVE
        return this.title.compareToIgnoreCase(other.title);
    }
    
}
