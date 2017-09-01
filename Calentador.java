public class Calentador
{
    private int temperatura;
    
    /**
     * Constructor que inicializa la temperatura en 15 del objeto
     */
    public Calentador()
    {
        temperatura = 15;
    }
    
    /**
     * Medoto que sube a 3 unidades la temperatura pero no mayor a 30
     */
    public void calentar()
    {
        if (temperatura<30)
        {
          
            temperatura = temperatura + 3;
            if(temperatura<30)
            {
                temperatura = temperatura -3;
                System.out.println("No se puede subir mas la temperatura");
            }
        }
        else
        {
            System.out.println("No se puede subir mas la temperatura");
        }
    }
    
    /**
     * Este metodo enfria pero con un limite de -15, va restando de 3 unidades
     */public void enfria()
    {
        
            if (temperatura>-10)
               {
                temperatura = temperatura -3;
                if(temperatura<=-10)
                {
                    temperatura = temperatura +3;
                    System.out.println("No se puede bajar mas");
                }
               }
            else
               {
                System.out.println("No se puede bajar mas la temperatura");
               }
        
    }
    
    /**
     * Metodo que imprime la temperatura actual del calentador
     */
    public void muestra()
    {
        System.out.println(temperatura);
    }
    
    /**
     * Metodo que restaura a la configuracion inicial el calentador
     */
    public void restaura()
    {
        temperatura = 15;
    }
}