import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cena extends Obstaculo
{
    private GreenfootImage imageCena;
    /**
     * Act - do whatever the Cena wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    public Cena()
    {
        imageCena=getImage();
        int larguraActual=imageCena.getWidth();
        int alturaActual=imageCena.getHeight();
        imageCena.scale(larguraActual/2,alturaActual/2);
    }
}
