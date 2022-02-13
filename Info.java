import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Info extends BTS
{
    /**
     * Act - do whatever the Info wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Info(){//devolve informação
        GreenfootImage playButton=new GreenfootImage(500,300);
        Font adjustedFont=new Font(true,false,40);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.WHITE);
        playButton.drawString("Fim",50,100);
        setImage(playButton);
    }
    public Info(int score, int index){//recebe duas variaveis para devolver a informação
        GreenfootImage playButton=new GreenfootImage(500,300);
        Font adjustedFont=new Font(true,false,40);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.WHITE);
        playButton.drawString("Pontuação\n       "+score+"\n    "+index/2+" min",50,100);
        novo.vida1=3;
        novo.vida2=3;
        novo.score=0;
        novo.index=1;
        setImage(playButton);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
