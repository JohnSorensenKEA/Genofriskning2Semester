package com.company;
import java.util.Scanner;
public class Sortering
{
    public String sort()
    {
        String fin = "";

        for(int i=0;i<5;i++)
        {
            fin += recieve() + " ";
        }
        fin = arrange(fin);
        return fin;
    }

    public String recieve()
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("\nPlease give me a word:");
        return inp.next();
    }

    public String arrange(String words)
    {
        String[] arr = words.split(" ");
        String fin = "";
        for(int i=0;i<arr.length;i++)
        {
            int temp = i;
            for(int j = i;j<arr.length;j++)
            {
                if(arr[i].compareToIgnoreCase(arr[j]) < 0)
                {
                    temp = j;
                }
            }
            String tempStr = arr[i];
            arr[i] = arr[temp];
            arr[temp] = tempStr;

            fin += arr[i] + "\n";
        }
        return fin;
    }
}
