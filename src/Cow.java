import java.util.Random;

public class Cow extends Thread{
    static LinkedList milk = new LinkedList();

    @Override
    public void run() {
        Random r1 = new Random();
        while (true){
            Milk m = new Milk();
            milk.add(m);
            try {
                Cow.sleep(r1.nextInt(5000, 10000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public boolean haveMilk(){
        if(milk.isEmpty()){
            return false;
        }else{
           return true;
        }
    }

    public Milk takeMilk(){
        return milk.getNext();
    }

    public int countMilk(){
        return milk.countItems();
    }

}
