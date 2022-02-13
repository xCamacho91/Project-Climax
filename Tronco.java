import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tronco1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tronco extends lixo
{
    /**
     * Act - do whatever the Tronco1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage imageTronco1;
    /**
     * Act - do whatever the Tronco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();// Add your action code here.
    } 
    public Tronco()
    {
        imageTronco1=getImage();
        int larguraActual=imageTronco1.getWidth();
        int alturaActual=imageTronco1.getHeight();
        imageTronco1.scale(larguraActual / 9,alturaActual / 9);
    }
}    

