package com.company;

public class Square
{
    public Square(int tal, String tegn)
    {
        for(int i = 0; i < tal;i++)
        {
            for(int j = 0; j < tal;j++)
            {
                System.out.print(tegn + " ");
            }
            System.out.print("\n");
        }
    }
}
