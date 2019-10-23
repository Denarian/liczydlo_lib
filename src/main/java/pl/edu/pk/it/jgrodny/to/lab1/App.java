package pl.edu.pk.it.jgrodny.to.lab1;

/**
 * Hello world!
 *
 */
interface I_liczydlo
{
    double dodaj();
    double odejmij();
    double pomnoz();
    double podziel();
}


class Liczydlo implements I_liczydlo
{
    double a, b;
    Liczydlo(double aa,double bb)
    {
        a = aa;
        b = bb;
    }
    public double dodaj() {
        return a + b;
    }
    public double odejmij()
    {
        return a - b;
    }
    public double pomnoz()
    {
        return a * b;
    }
    public double podziel()
    {
        double wynik;
        try
        {
            wynik = a / b;
        }
        catch (ArithmeticException a)
        {
            System.out.println("OO nie ładnie dzielisz przez zero");
            wynik = 0;
        }
        return wynik;
    }



}

