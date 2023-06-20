package objects.tryWithResources;

public class Main {
    public static void main(String... args){
        MyResource myResource = new MyResource(true);
        try{
            myResource.doStuff(false);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            try {
                myResource.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

//        try(MyResource rec = new MyResource(true)){
//            rec.doStuff(false);
//        } catch (Exception e) {
//            System.out.println("Exception caught "+ e.getMessage());
//        }
    }
}
