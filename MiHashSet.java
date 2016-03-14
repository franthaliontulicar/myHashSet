
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // instance variables - replace the example below with your own
    private ArrayListInt enteros;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        // initialise instance variables
        enteros = new ArrayListInt();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
     public void add(int valor)
    {
        enteros.add(valor);
    }
    
    public void clear()
    {
        enteros = new ArrayListInt();
    }
    
     public boolean contains(int elemento)
    {
        return enteros.contains(elemento);
    }
    
     public boolean isEmpty()
    {
        return enteros.size() == 0;
    }
    
     public int remove(int elemento)
    {
        int borrado = -1;
       
        if(contains(elemento))
        {
            int index = enteros.indexOf(elemento);  
            enteros.remove(index);
            borrado = enteros.remove(index);
        }
       
        return borrado;
    }
    
    public int size()
    {
        return enteros.size();
    }
    
    public String toString(){
        return enteros.size()+"";
    }
    
    public boolean equals(MiHashSet otroConjunto){
        boolean iguales = false;
        int index = 0;
            if(size() == otroConjunto.size()){
                iguales = true;
            }
            
        return iguales;
    }
}
