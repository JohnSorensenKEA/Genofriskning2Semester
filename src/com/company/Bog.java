package com.company;

public class Bog
{
    private String ISBN;
    private String titel;
    private int udgivelesår;

    public Bog(String isbn, String titel, int udgivelesår)
    {
        ISBN = isbn;
        this.titel = titel;
        this.udgivelesår = udgivelesår;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    public String getTitel()
    {
        return titel;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public int getUdgivelesår()
    {
        return udgivelesår;
    }

    public void setUdgivelesår(int udgivelesår)
    {
        this.udgivelesår = udgivelesår;
    }

    @Override
    public String toString()
    {
        return "ISBN: "+ISBN+"\nTitel: "+titel+"\nUdgivelsesår: "+udgivelesår;
    }
}
