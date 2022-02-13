import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruções here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instrucoes extends BTS
{
    public Instrucoes(){
        GreenfootImage playButton=new GreenfootImage(200,60);
        Font adjustedFont=new Font(true,false,40);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.WHITE);
        playButton.drawString("Instruções",0,50);
        setImage(playButton);
    }
    public void act() 
    {
        checkMouse();
        checkClick(new instructions());
        //checkClick(new MundoInst());
    }    
}
