package com.company;

import java.util.Scanner;

public class Grass
{
    public Grass()
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Nuværende længde (cm):");
        float længde = inp.nextFloat();
        System.out.print("\nMax længde (cm): ");
        float max = inp.nextFloat();
        System.out.println("\nDage til græsset skal slås: "+slåGræs(længde,max));
    }

    private float vækst = 0.8f;
    public int slåGræs(float længde, float max)
    {
        return (int) ((max - længde)/vækst);
    }
}
