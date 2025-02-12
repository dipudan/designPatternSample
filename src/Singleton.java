public class Singleton {
    private static Singleton mySet=null;
    private Singleton(){
        System.out.println("Created");
    }
    public static Singleton createSingle(){
        if (mySet == null){
            synchronized (Singleton.class){
                if (mySet == null) //double checking
                    mySet = new Singleton();
            }
        }
        return mySet;
    }
}
