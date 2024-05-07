package dev.dany.duelsimulator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandler
{
    
    public static boolean save(String path, Object o)
    {
        try 
        {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(o);
            
            return true;
        } 
        catch (IOException ex) 
        {
            System.out.println("Saving Error");
            System.out.println(ex);
            return false;
        }
    }
    
    public static Object load(String path)
    {
        Object o;
        
        try
        {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            o = ois.readObject();
            
            return o;
        }
        catch (IOException | ClassNotFoundException ex)
        {
            System.out.println("Loading Error");
            System.out.println(ex);
            return null;
        }
    }
}