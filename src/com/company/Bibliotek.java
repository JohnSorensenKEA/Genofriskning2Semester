package com.company;
import java.util.ArrayList;
public class Bibliotek
{
    private ArrayList<Bog> list;

    public Bibliotek()
    {
        Bog bog1 = new Bog("123","abc",1);
        Bog bog2 = new Bog("456","def",2);
        Bog bog3 = new Bog("789","ghi",3);
        list.add(bog1);
        list.add(bog2);
        list.add(bog3);
    }

    public boolean compareBookISBN(Bog a)
    {
        for(Bog b : list)
        {
            if(a.getISBN().equals(b.getISBN()))
            {
                return true;
            }
        }
        return false;
    }
}
