package com.company;
import java.util.ArrayList;
public class Second
{
    public void testDoesArray()
    {
        ArrayList<String> sejesteTestListeEver = new ArrayList<String>();

        sejesteTestListeEver.add("Torben");
        sejesteTestListeEver.add("Iben");
        sejesteTestListeEver.add("Magnus");
        sejesteTestListeEver.add("Bo");

        System.out.println(doesArraylistContainString(sejesteTestListeEver, "Bo"));
    }

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
