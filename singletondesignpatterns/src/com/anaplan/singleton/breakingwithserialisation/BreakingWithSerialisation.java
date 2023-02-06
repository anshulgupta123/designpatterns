package com.anaplan.singleton.breakingwithserialisation;

import com.anaplan.singleton.bestway.BestWaySingeton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakingWithSerialisation {

    public static void main(String[] args) {
        try {
            SerializationHandlingSingleton bestWaySingeton1=SerializationHandlingSingleton.getSingleton();
            FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(bestWaySingeton1);
            FileInputStream fileInputStream= new FileInputStream("file.txt");
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            SerializationHandlingSingleton bestWaySingeton2=(SerializationHandlingSingleton) objectInputStream.readObject();
            System.out.println(bestWaySingeton2.hashCode());
            System.out.println(bestWaySingeton1.hashCode());

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
