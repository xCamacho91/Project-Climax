import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Algas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Algas extends Actor
{   
    private GreenfootImage imageAlgas;
    /**
     * Act - do whatever the Algas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       private int numerAlgas = 5;
    /**
     * Act - do whatever the Copo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveCopo();
    } 
    public Algas()
    {
        imageAlgas=getImage();
        int larguraActual=imageAlgas.getWidth();
        int alturaActual=imageAlgas.getHeight();
        imageAlgas.scale(larguraActual / 12,alturaActual / 12);
    }
    public void moveCopo()
    {
        setLocation(getX(),getY()+1);
    }
    
}
