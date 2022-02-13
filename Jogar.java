import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jogar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jogar extends BTS
{
    public Jogar(){
        GreenfootImage playButton=new GreenfootImage(310,140);
        Font adjustedFont=new Font(true,false,80);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.WHITE);
        playButton.drawString("Jogar",50,100);
        setImage(playButton);
    }
        
        
        
    public void act() 
    {
        checkMouse();
        checkClick(new novo());
        
    }    
}
