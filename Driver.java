public class Driver{
    public static void main(String[] args){
        Track track1 = new Track("Happy Together", "The Turtles");
        track1.toString();
        System.out.println(track1);
        Track track2 = new Track("ART IS DEAD", "bo burnham", 2013, 340);
        track2.toString();
        System.out.println(track2);
        Playlist instance1 = new Playlist();
        instance1.add("Twilight", "ELO", 2010, 345);
        instance1.add("hurt", "johnny cash");
        instance1.add("Sad", "Bo Burnham", 2013, 250);
        instance1.add("ART IS DEAD", "BO BUrnHam");
        instance1.add("Gods gonna cut you down", "JOHNNY CASH", 2006, 143);
        instance1.add(track1);
        instance1.sort();
        instance1.toString();
        System.out.println();
        instance1.setName("Chill Mood");
        instance1.toString();
        System.out.println();
        System.out.println();
        instance1.playOnly("burn");
        System.out.println();
        instance1.playOnly(2010);
        System.out.println();
        instance1.play(true);
        System.out.println();
        instance1.play(false);
        System.out.println();
        instance1.remove("Sad");
        System.out.println();
        instance1.remove("aRt iS deAd");
        System.out.println();
        instance1.showList();
        System.out.println();
        Playlist instance2 = new Playlist("my top music");
        instance2.add("Sanctuary", "Joji", 2019, 180);
        instance2.add("Vienna", "Billy Joel");
        instance2.add("It's a Shame", "The Spinners", 2006, 211);
        instance2.add("Sir Duke", "Stevie Wonder");
        instance2.add("Stand Up", "Cynthia Erivo", 2019, 302);
        instance2.add(track2);
        instance2.sort();
        instance2.toString();
        System.out.println();
        instance2.playOnly("wOndEr");
        System.out.println();
        instance2.playOnly(2019);
        System.out.println();
        instance2.setName("Favourites");
        instance2.toString();
        System.out.println();
        instance2.play(true);
        System.out.println();
        instance2.play(false);
        System.out.println();
        instance2.remove("duKe");
        System.out.println();
        instance2.showList();
    }
}