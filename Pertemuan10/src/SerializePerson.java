/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author adefr
 */
public class SerializePerson {
public static void main(String[] args) {
        Person person = new Person(1, "Andi Serial");
        try {
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Objek Person berhasil diserialisasi ke person.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}