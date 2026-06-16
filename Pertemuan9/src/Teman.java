/* Nama : Adefritz Einar Sinaga
 * NIM : 24060124140186
 * File : Teman.java
 * Tanggal : 20 Mei 2026
 */
import java.util.ArrayList;

public class Teman 
{
    private int nbelm;
    private ArrayList<String> Lnama;

    // Konstruktor
    public Teman() 
    {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() 
    {
        return nbelm;
    }

    public String getNama(int indeks) 
    {
        return Lnama.get(indeks);
    }

    public void setNama(int indeks, String nama) 
    {
        Lnama.set(indeks, nama);
    }

    public void addNama(String nama) 
    {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) 
    {
        if (Lnama.remove(nama)) 
            {
            nbelm--;
        }
    }

    public boolean isMember(String nama) 
    {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru) 
    {
        int idx = Lnama.indexOf(nama);
        if (idx != -1) 
            {
            Lnama.set(idx, namaBaru);
        }
    }

    public int countNama(String nama) 
    {
        int count = 0;
        for (String n : Lnama) 
        {
            if (n.equals(nama)) 
            {
                count++;
            }
        }
        return count;
    }

    public void showTeman() 
    {
        for (String n : Lnama) 
        {
            System.out.println(n);
        }
    }
}