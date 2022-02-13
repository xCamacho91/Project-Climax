import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Copo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Copo extends lixo
{
    private GreenfootImage imageCopo;
    private int numeroCopo = 0;
    /**
     * Act - do whatever the Copo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    } 
    public Copo()
    {
        imageCopo=getImage();
        int larguraActual=imageCopo.getWidth();
        int alturaActual=imageCopo.getHeight();
        imageCopo.scale(larguraActual / 14,alturaActual / 14);
    }  
}
