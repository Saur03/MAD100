import java.util.Random;

public class RandomExamples {

    public static void main(String[] args) {
        Random r = new Random(3452352);
        for(int i = 0; i < 100; i++){
            System.out.println(r.nextInt(100));
        }
       // System.out.println(System.currentTimeMillis());
    }
}
