import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pneu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pneu extends lixo
{
    /**
     * Act - do whatever the Pneu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage imagePneu;
    /**
     * Act - do whatever the Pneu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();// Add your action code here.
    } 
    public Pneu()
    {
        imagePneu=getImage();
        int larguraActual=imagePneu.getWidth();
        int alturaActual=imagePneu.getHeight();
        imagePneu.scale(larguraActual / 9,alturaActual / 9);
    }
    public void move()
    {
        
        setLocation(getX(),getY()+2);
    }    
}
