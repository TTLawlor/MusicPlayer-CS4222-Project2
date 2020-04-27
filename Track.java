import java.io.* ;
import java.util.*;
public class Track
{
    
    String trackTitle;
    String artistName;
    int trackYear;
    String duration;
    ArrayList<String> trackArrList = new ArrayList<String>();
    public Track(String title, String artist){
        setTitle(title);
        setArtist(artist);
        setYear(0);
        setDuration(0);
        // trackArrList.add(getTitle());
        // trackArrList.add(getArtist());
        // trackArrList.add(getYear());
        // trackArrList.add(getDuration());
        
    }
    
    public Track(String title, String artist, int year, int duration){
        setTitle(title);
        setArtist(artist);
        setYear(year);
        setDuration(duration);
    }
    
    public void setTitle(String title){
        trackTitle = title;
    }
    
    public String getTitle(){
        return trackTitle;
    }
    
    public void setArtist(String artist){
        artistName = artist;
    }
    
    public String getArtist(){
        return artistName;
    }
    
    public void setYear(int year){
        trackYear = year;
    }
    
    public String getYear(){
        // System.out.println(trackYear);
        return String.valueOf(trackYear);
    }
    
     public void setDuration(int seconds ){
        duration = (seconds/60)%60 + ":" + seconds%60; 
    }
    
    public String getDuration(){
        return String.valueOf(duration);
    }
    
    public ArrayList<String> trackArrList(){
        trackArrList.add(getTitle());
        trackArrList.add(getArtist());
        trackArrList.add(getYear());
        trackArrList.add(getDuration());
        System.out.println(trackArrList);
        return trackArrList;
    }
    
    public void toString(){
        System.out.println("Title:" + getTitle() + " Artist:" + getArtist() + " Year:" + getYear() + " Duration:" + getDuration());
    }
}