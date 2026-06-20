class Singleton {

    private Singleton(){

    }
   private static Singleton inst;

    public static Singleton getInstance(){
        if(inst == null){
            inst = new Singleton();
        }
    return inst;}
}
public class excersise_one {
    public static void main(String[] args) {
        Singleton I1 = Singleton.getInstance();
        Singleton I2 = Singleton.getInstance();

        if(I1 == I2){
            System.out.println("only one instance/object is created");
        }
        else{
            System.out.println("multiple objects/instances are created");
        }
    }
}
