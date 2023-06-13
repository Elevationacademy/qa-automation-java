package objects.tryWithResources;

public class MyResource implements AutoCloseable{
    boolean shouldThrow;

    public MyResource(boolean shouldThrow){
        this.shouldThrow= shouldThrow;
    }

    public void doStuff(boolean shouldThrow){
        if(shouldThrow){
            throw new RuntimeException("Action Exception !!!");
        }
        System.out.println("Done stuff without throwing");
    }
    @Override
    public void close() throws Exception {
        if(shouldThrow){
            throw new IllegalStateException("Closing Exception !!!");
        }
        System.out.println("Closed without exception");
    }
}
