import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rede here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rede extends lixo
{
    private GreenfootImage imageRede;
    /**
     * Act - do whatever the Rede wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();// Add your action code here.
    }    
    public Rede()
    {
        imageRede=getImage();
        int larguraActual=imageRede.getWidth();
        int alturaActual=imageRede.getHeight();
        imageRede.scale(larguraActual / 12,alturaActual / 12);
    }  
}
