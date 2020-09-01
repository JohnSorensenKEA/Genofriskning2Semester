package com.company;

public class Sogning
{
    public int arrayContain(String[] arr, String word) throws Exception
    {
            for(int i = 0;i<arr.length;i++)
            {
                if(arr[i].equals(word))
                {
                    return i;
                }
            }
        throw new Exception();
    }
}
