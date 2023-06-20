package generics.subtypes;

import java.util.ArrayList;
import java.util.List;

public class ParentFactory {

    public <T extends Parent> T getChild(boolean aOrB){
        if(aOrB){
            return (T) new ChildA();
        }else{
            return (T)new ChildB();
        }
    }
}
