public class Calentador
{
    private int temperatura;
    
    public Calentador()
    {
        temperatura = 15;
    }
    
    public void calentar()
    {
        if (temperatura < 30)
        {
          temperatura = temperatura + 3;  
        }
        else
        {
            System.out.println("No se puede subir mas la temperatura");
        }
    }
    
    public void enfria()
    {
        if (-10 <= temperatura)
        {
            temperatura = temperatura -3;
        }
        else
        {
            System.out.println("No se puede bajar mas la temperatura");
        }
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