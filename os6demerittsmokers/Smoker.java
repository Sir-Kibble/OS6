package os6demerittsmokers;
import java.util.concurrent.Semaphore;
import java.util.Random;
public class Smoker extends Thread{
    Semaphore S = new Semaphore(1);
    Random R = new Random();
    int part;//1 - paper, 2 - matches, 3 - tobacco
    String qewrgq3thwyj;
    
    public Smoker(int part){
        this.part = part;
        if(part == 1)
            qewrgq3thwyj = "paper";
        else if(part == 2)
            qewrgq3thwyj = "matches";
        else
            qewrgq3thwyj = "tobacco";
    }//end constructor

    @Override
    public void run() {
        while(true){
            try{
                System.out.println("Smoker with "+qewrgq3thwyj+" wants to smoke. ");
                (this.S).acquire();
                Smoke();
                //System.out.println("Smoker with "+name+" has everything. ");
            }catch(InterruptedException e){
                System.out.println("ERROR");
            }
            finally{
                this.S.release();
            }
        }//end while
    }//end run
    
    private void Smoke(){
        try
            {
                System.out.println( "Smoker with "+qewrgq3thwyj+" is smoking. ");
                this.sleep(100+R.nextInt(900));
            }
            catch(InterruptedException e)
            {
                System.out.println("ERROR!");
            }
            System.out.println( "Smoker with "+qewrgq3thwyj+" stopped smoking.");
    }//end smoke
}