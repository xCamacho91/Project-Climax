import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peixe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peixe2 extends Peixes
{
    
    
    private GreenfootImage [] imagens;
    /**
     * Act - do whatever the Peixe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(6);
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
            turn(40);
        }
    }
    private GreenfootImage imagePeixe;
    public Peixe2()
    {
        imagePeixe=getImage();
        int larguraActual=imagePeixe.getWidth();
        int alturaActual=imagePeixe.getHeight();
        imagePeixe.scale(larguraActual / 10,alturaActual / 10);
        
       
    }
}
