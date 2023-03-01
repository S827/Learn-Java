
class DVDPlayer {
    boolean canRecord = false;

    void recordDVD(){
        System.out.println("DVD Recording");
    }
    void playDVD(){
        System.out.println("DVD Playing");
    }
}

public class DvdPlayerTest {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if(d.canRecord == true){
            d.recordDVD();
        }
    }
}
