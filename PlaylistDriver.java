public class PlaylistDriver{
    public static void main(String[] args){
        Playlist instance1 = new Playlist();
        instance1.add("kill yousrelf", "bo burnham", 2010, 345);
        instance1.add("hurt", "johnny cash");
        instance1.add("Sad", "Bo Burnham", 2011, 675);
        instance1.add("ART IS DEAD", "BO BUrnHam");
        instance1.add("Gods gonna cut you down", "JOHNNY CASH", 2002, 786);
        System.out.println();
        instance1.playOnly("burn");
        System.out.println();
        instance1.play(true);
        System.out.println();
        instance1.play(false);
        System.out.println();
        instance1.play(true);
        System.out.println();
        instance1.remove("Sad");
        System.out.println();
        instance1.remove("aRt iS deAd");
    }
}