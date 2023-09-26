public class Main {
    public static void main(String[] args) {

        Thread [] cows = new Thread[4];
        cows [0] = new Cow();
        cows [1] = new Cow();
        cows [2] = new Cow();
        cows [3] = new Cow();

        cows [0].start();
        cows [1].start();
        cows [2].start();
        cows [3].start();

        Thread bf = new Thread(new ButterFactory());
        bf.start();

        Thread cf = new Thread(new CreamFactory());
        cf.start();
    }
}