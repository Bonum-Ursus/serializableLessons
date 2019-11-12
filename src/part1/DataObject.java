package part1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DataObject extends NonSerializable implements Serializable {
    int i = 123;
    String s = "Name";
    transient String[] def = new String[]{"a", "b", "c"};
    CustomObject customObject;

    private void writeObject(ObjectOutputStream out) throws IOException{
        out.defaultWriteObject();
        out.writeObject(getMyData());
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        in.defaultReadObject();
        setMyData((String)in.readObject());
    }
}
