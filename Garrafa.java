import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garrafa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Garrafa extends lixo
{
    private GreenfootImage imageGarrafa;
    /**
     * Act - do whatever the Lata wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();// Add your action code here.
    } 
    public Garrafa()
    {
        imageGarrafa=getImage();
        int larguraActual=imageGarrafa.getWidth();
        int alturaActual=imageGarrafa.getHeight();
        imageGarrafa.scale(larguraActual / 12,alturaActual / 12);
    }   
}
