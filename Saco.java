import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Saco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Saco extends lixo
{
    /**
     * Act - do whatever the Saco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

    private GreenfootImage imageSaco;
    /**
     * Act - do whatever the Saco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();// Add your action code here.
    }
    public Saco()
    {
        imageSaco=getImage();
        int larguraActual=imageSaco.getWidth();
        int alturaActual=imageSaco.getHeight();
        imageSaco.scale(larguraActual / 12,alturaActual / 12);
    }
}
   

