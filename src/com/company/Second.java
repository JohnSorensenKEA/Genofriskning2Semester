package com.company;
import java.util.ArrayList;
public class Second
{
    public boolean doesArraylistContainString(ArrayList<String> list, String word)
    {
        for(String s : list)
        {
            if(word.equals(s))
            {
                System.out.println("The String has been found");
                return true;
            }
        }
        list.add(word);
        return false;
    }
}
