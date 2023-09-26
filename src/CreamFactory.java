public class CreamFactory extends Thread{
    int count = 0;
    @Override
    public void run(){
        Cow newCow = new Cow();
        while(true){
            if(newCow.haveMilk()){
                newCow.takeMilk();
                count++;
                System.out.println("Cream Factory got milk from a cow");
                System.out.println("Now Cream Factory has " + count + " milk." );
            }
            if(count == 2){
                System.out.println("I made cream");
                count -= 2;
            }
            try {
                CreamFactory.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error in CreamFactory " + e.getMessage());
            }
        }
    }
}
