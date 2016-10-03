package os6demerittsmokers;
public class OS6DeMerittSmokers {
    public static void main(String[] args) {
        Smoker S1 = new Smoker(1);
        Smoker S2 = new Smoker(2);
        Smoker S3 = new Smoker(3);
        
        Agent A = new Agent(S1,S2,S3);
        
        A.start();
        S1.start();
        S2.start();
        S3.start();
        
    }
}