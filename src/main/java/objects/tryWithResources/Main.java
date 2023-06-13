package objects.tryWithResources;

public class Main {
    public static void main(String... args){
        try(MyResource rec = new MyResource(true)){
            rec.doStuff(false);
        } catch (Exception e) {
            System.out.println("Exception caught "+ e.getMessage());
        }
    }
}
