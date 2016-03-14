
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // instance variables - replace the example below with your own
    private int[] enteros;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        // initialise instance variables
        enteros = new int[0];
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
     public void add(int valor)
    {
        int[] local;
        local = enteros;
        enteros = new int[local.length + 1];
        for (int cont = 0; cont < local.length;cont++)
        {
            enteros[cont] = local[cont];
        }
        enteros[local.length] = valor;
    }
    
    public void clear()
    {
        enteros = new int[0];
    }
    
     public boolean contains(int elemento)
    {
        boolean contiene = false;
        int cont = 0;
        while(cont < enteros.length && !contiene)
        {
             if (enteros[cont] == elemento)
             {
                 contiene = true;
             }
             cont++;
        }
        return contiene;
    }
    
     public boolean isEmpty()
    {
        return enteros.length == 0;
    }
}
