package com.company;

public class Case
{
    public String ret(String sætning)
    {
        String[] a = sætning.split(" ");
        String fin = "";
        for(int i = 0; i < a.length; i++)
        {
            // Alternativt: String.toUpperCase().equals(String)
            /*if(checkAllCase(a[i]))
            {
                fin += a[i];
            }
             */
            if(a[i].toUpperCase().equals(a[i]))
            {
                fin += a[i];
            }
            else if(a[i].length() < 4)
            {
                fin += a[i].toLowerCase();
            }
            else
            {
                fin += largeSmall(a[i]);
            }
            fin += " ";
        }
        return fin;
    }

    public boolean checkAllCase(String word)
    {
        char[] letters = word.toCharArray();
        for(char c : letters)
        {
            if(Character.isLowerCase(c))
            {
                return false;
            }
        }
        return true;
    }

    public String largeSmall(String word)
    {
        String ret = word.toLowerCase();

        return ret.substring(0,1).toUpperCase()+ret.substring(1);
    }
}
