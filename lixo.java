import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lixo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lixo extends Actor
{
    /**
     * Act - do whatever the lixo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    }
    public void move()//movimento vertical ocorre em todas as subclass, excepto que algumas numa velocidade maior
    {
        setLocation(getX(),getY()+1);
    } 
}
