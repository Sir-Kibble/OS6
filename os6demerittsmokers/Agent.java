package os6demerittsmokers;
import java.util.concurrent.Semaphore;
import java.util.Random;
public class Agent extends Thread {
    Semaphore S = new Semaphore(1);
    Random R = new Random();
    Smoker[] SS = new Smoker[3];
    int missing; 
    
    public Agent(Smoker s1, Smoker s2, Smoker s3){
        this.SS[0] = s1;
        this.SS[1] = s2;
        this.SS[2] = s3;
    }//end constructor
    
    
    @Override
    public void run() {
        while(true){
            try{
                (this.S).acquire();
                missing = R.nextInt(3)+1;
                if(missing == SS[0].part)
                    this.SS[0].S.release();
                else if(missing == SS[1].part)
                    this.SS[1].S.release();
                else if(missing == SS[2].part)
                    this.SS[2].S.release();
            }catch(InterruptedException e){

            }finally{
                (this.S).release();
            }
        }
    }//end run
}