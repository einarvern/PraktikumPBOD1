/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author adefr
 */
public class ReadSerializedPerson {
public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person person = (Person) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Berhasil membaca objek:");
            System.out.println("ID: " + person.getId() + ", Name: " + person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}