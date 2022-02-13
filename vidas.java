import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vidas extends BTS
{  
    private GreenfootImage herz;
    /**
     * Act - do whatever the vidas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {
        // Add your action code here.
    }      
    public vidas()
    {
        herz=getImage();
        int larguraActual=herz.getWidth();
        int alturaActual=herz.getHeight();
        herz.scale(larguraActual / 2,alturaActual /2);
    }
}
