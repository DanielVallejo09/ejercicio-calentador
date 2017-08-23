public class Calentador
{
    private int temperatura;
    
    public Calentador()
    {
        temperatura = 15;
    }
    
    public void calentar()
    {
        temperatura = temperatura + 3;
    }
    
    public void enfria()
    {
        temperatura = temperatura -5;
    }
    
    public void muestra()
    {
        System.out.println(temperatura);
    }
    
    public void restaura()
    {
        temperatura = 15;
    }
}