import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peixes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peixes extends Actor
{
    /**
     * Act - do whatever the Peixes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        turnAtEdge();
        randomTurn();
        comeCopo();
        comeGarrafa();
        comeOleo();
        comePneu();
        comeRede();
        comeTronco();
        comeLata();
        comeSaco();
    }   
    
    public void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(20);
        }
    }
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100)<25)
        {
            turn (Greenfoot.getRandomNumber(80)-40);
        }
    }
    public void comeCopo()
    {
        if (isTouching(Copo.class))
        {
            removeTouching(Copo.class);
            
        }
    }
    public void comeGarrafa()
    {
        if (isTouching(Garrafa.class))
        {
            removeTouching(Garrafa.class);
            
        }
    }
    public void comeOleo()
    {
        if (isTouching(Oleo.class))
        {
            if(novo.vida1==0 || novo.vida2==0){
                
            }
            else{
                getWorldOfType(novo.class).somaPontos(-50);
            }
            removeTouching(Oleo.class);
            
        }
    }
    
    public void comePneu()
    {
        if (isTouching(Pneu.class))
        {
            removeTouching(Pneu.class);
            
        }
    }
    public void comeSaco()
    {
        if (isTouching(Saco.class))
        {
            removeTouching(Saco.class);
            
        }
    }   
    public void comeRede()
    {
        if (isTouching(Rede.class))
        {
            if(novo.vida1==0 || novo.vida2==0){
                
            }
            else{
                getWorldOfType(novo.class).somaPontos(-50);
            }
            removeTouching(Rede.class);
            
        }
    }
    public void comeTronco()
    {
        if (isTouching(Tronco.class))
        {
            removeTouching(Tronco.class);
            
        }
    }
    public void comeLata()
    {
        if (isTouching(Lata.class))
        {
            removeTouching(Lata.class);
            
        }
    }
}
