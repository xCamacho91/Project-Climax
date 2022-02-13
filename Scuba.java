import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scuba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scuba extends Scubas
{
    private GreenfootImage [] imagens;
    private GreenfootImage [] imagensInvertidas;
    
    private int indice;
    private int score = 0;
    /**
     * Act - do whatever the Scuba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        anima();
        move();
        turnAtCena();
        rasto();
        removeAlgas();
        removeCopo();
        removeGarrafa();
        removeLata();
        removeOleo();
        removePneu();
        removeRede();
        removeSaco();
        removeTronco();
    } 
    private GreenfootImage imageScuba;
    public Scuba()
    {
        imagens = new GreenfootImage [5];
        imagensInvertidas = new GreenfootImage[5];
        
        imagens[0] = new GreenfootImage("scuba1.png");
        imagens[1] = new GreenfootImage("scuba2.png");
        imagens[2] = new GreenfootImage("scuba3.png");
        imagens[3] = new GreenfootImage("scuba4.png");
        imagens[4] = new GreenfootImage("scuba5.png");
        
        imagensInvertidas[0] = new GreenfootImage("scuba1inv.png");
        imagensInvertidas[1] = new GreenfootImage("scuba2inv.png");
        imagensInvertidas[2] = new GreenfootImage("scuba3inv.png");
        imagensInvertidas[3] = new GreenfootImage("scuba4inv.png");
        imagensInvertidas[4] = new GreenfootImage("scuba5inv.png");
        
        // imagens[0].scale(imagens[0].getWidth() - 100, imagens[0].getHeight() - 100);
        // imagens[1].scale(imagens[1].getWidth() - 100, imagens[1].getHeight() - 100);
        // imagens[2].scale(imagens[2].getWidth() - 100, imagens[2].getHeight() - 100);
        // imagens[3].scale(imagens[3].getWidth() - 100, imagens[3].getHeight() - 100);
        // imagens[4].scale(imagens[4].getWidth() - 100, imagens[4].getHeight() - 100);
        
        setImage(imagens[0]);
        
        
        imageScuba=getImage();
        // int larguraActual=imageScuba.getWidth();
        // int alturaActual=imageScuba.getHeight();
        // imageScuba.scale(larguraActual/4,alturaActual/4);
    }
    private int tempo = 0;
    private int i = 0;
    private boolean esq = true;
    private boolean dir;
    
    
    public void anima(){
        tempo++;
        if(Greenfoot.isKeyDown("a")){
            esq = true;
            dir = false;
        }
        if(Greenfoot.isKeyDown("d")){
            dir = true;
            esq = false;
        }
            
        if(esq == true){
            
            if(tempo % 10 == 0){
                
                setImage(imagens[i]);
                i++;
            }
            
            
            if(tempo >= 100 || i >= imagens.length){
                i = 0;
                tempo = 0;
            }
            for(int j = 0; j < imagens.length; j++)
            imagens[j] = new GreenfootImage("scuba" + (j+1) + ".png");
    
        }
        if(dir == true){
        
            if(tempo % 10 == 0){
                
                setImage(imagens[i]);
                i++;
            }
            
            if(tempo >= 100 || i >= imagens.length){
                i = 0;
                tempo = 0;
            }
            for(int j = 0; j < imagens.length; j++)
            imagens[j] = new GreenfootImage("scuba" + (j+1) + "inv.png");
    
        }
    
    }
    
    public void removeAlgas(){//remove as algas quando toca e perde pontos e vida do jogador em causa
        if(isTouching(Algas.class)){
            getWorldOfType(novo.class).somaPontos(-50);
            getWorldOfType(novo.class).somaVidasUm(-1);
            removeTouching(Algas.class);
        }
    }

    public boolean not(boolean touching){//verifica se ha contacto
        if(touching == true)
            return false;
        else
            return true;
    }
    
    
    public void move(){//deslocação, excepto quando esta a tocar nos obstaculos
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("w"))y-=5;
        
        if(Greenfoot.isKeyDown("s"))y+=5;  
        
        if(Greenfoot.isKeyDown("d") && not(isTouching(Cena.class))){x+=5;}
        if(Greenfoot.isKeyDown("a") && not(isTouching(Cena.class))){x-=5;}
        
        setLocation(x,y);
    }  
    public void turnAtCena()//faz a inclinação ao chegar aos obstaculos
    {
        if (isTouching(Cena.class)){
            setRotation(45);
        }
        else
            setRotation(0);
    }
    private int sX,sY;
    private final int DELTA=5;
    private GreenfootImage imagem1, imagem2;
    private int contador;
    public void rasto(){//faz o rasto das bolhas
        contador++;
        if(contador==3){
            getWorld().addObject(new Bolhas(),getX(),getY());
            contador=0;
        }
    }
    
    
    
}   

    
   
