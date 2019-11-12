package part2;

import java.io.*;

public class MyClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataObject obj = new DataObject();
        obj.setMyData("DDDDDDDDDDDDDDDDDDDDDDDDDDD");
        File file = new File("store2.bin");

        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream so = new ObjectOutputStream(fo);
        so.writeObject(obj);
        so.flush();
        so.close();

        FileInputStream fi =  new FileInputStream(file);
        ObjectInputStream si =  new ObjectInputStream(fi);
        DataObject objNew = (DataObject) si.readObject();
        si.close();
        System.out.println(objNew.getMyData());
        System.out.println(objNew.customObject.isB());
    }
}
