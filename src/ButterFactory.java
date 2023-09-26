public class ButterFactory extends Thread {
    int count = 0;

    @Override
    public void run() {
        Cow newCow = new Cow();
        while (true) {
            if (newCow.haveMilk()) {
                newCow.takeMilk();
                count++;
                System.out.println("Butter Factory got milk from a cow");
                System.out.println("Now Butter Factory has " + count + " milk.");
            }
            if (count == 4) {
                System.out.println("I made Butter");
                count -= 4;
            }
            try {
                CreamFactory.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error in ButterFactory " + e.getMessage());
            }
        }
    }
}


// Occasionally it will throw an Exception in thread "Thread-5" java.lang.NullPointerException: Cannot invoke "Node.getNext()" because "this.head" is null
//	at LinkedList.getNext(LinkedList.java:24)
//	at Cow.takeMilk(Cow.java:28)
//	at ButterFactory.run(ButterFactory.java:9)
//	at java.base/java.lang.Thread.run(Thread.java:1589)

