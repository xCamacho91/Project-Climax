import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lata extends lixo
{
    private GreenfootImage imageLata;
    /**
     * Act - do whatever the Lata wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();// Add your action code here.
    } 
    public Lata()
    {
        imageLata=getImage();
        int larguraActual=imageLata.getWidth();
        int alturaActual=imageLata.getHeight();
        imageLata.scale(larguraActual / 12,alturaActual / 12);
    }
}
