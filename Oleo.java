import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Oleo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oleo extends lixo
{
    private GreenfootImage imageOleo;
    /**
     * Act - do whatever the Oleo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();// Add your action code here.
    }    
    public Oleo()
    {
        imageOleo=getImage();
        int larguraActual=imageOleo.getWidth();
        int alturaActual=imageOleo.getHeight();
        imageOleo.scale(larguraActual / 8,alturaActual /8);
    }
    public void move()
    {
        setLocation(getX(),getY()+3);
    }   
}
