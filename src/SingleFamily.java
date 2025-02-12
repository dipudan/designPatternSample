import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleFamily {
    public static void main(String args[]){
        ExecutorService excutor = Executors.newFixedThreadPool(2);
        excutor.execute(()-> System.out.println(Singleton.createSingle()));
        excutor.execute(()-> System.out.println(Singleton.createSingle()));
        excutor.execute(()-> System.out.println(Singleton.createSingle()));
        excutor.shutdown();
    }
}
