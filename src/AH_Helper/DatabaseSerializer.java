package AH_Helper;

import java.io.*;

public class DatabaseSerializer implements Serializable {

    public void serialize(ItemDatabase item, String path) {

        try {

            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(item);
            out.close();
            fileOut.close();

        } catch (IOException i) {

            i.printStackTrace();

        }

    }

    public ItemDatabase deserialize(String path) {

        ItemDatabase itemDatabase = null;

        try {

            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            itemDatabase = (ItemDatabase) in.readObject();
            in.close();
            fileIn.close();

        } catch (IOException | ClassNotFoundException i) {

            i.printStackTrace();

        }

        return itemDatabase;

    }

}
