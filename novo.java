    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class novo here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class novo extends World
    {
        public static int score = 0;
        public static int vida1 = 3;
        public static int vida2 = 3;
        public static int index = 1;
        public int rand = 0;
        long time = System.currentTimeMillis();
        long total = time + 30000;
        /**
         * Constructor for objects of class novo.
         * 
         */
        public novo()
        {    
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            super(1000, 600, 1); 
            populateWorld();
            
            setPaintOrder(Scuba.class, Bolhas.class);
            setPaintOrder(Player2.class,Bolhas.class);
                  
            showText("Scuba Um", 100, 40);
            showText("Scuba Dois", 900, 40);
            showText("Score: " + score, 500, 40); 
            addObject(new vidas(),100,80);
            addObject(new vidas(),900,80);
            showText("" + vida1, 100, 80);
            showText("" + vida2, 900, 80);
        }

        public void geraPeixes(){//de x em x tempo adiciona aleatoriament peixes
            long agora= System.currentTimeMillis();
            showText("" + agora, 500,20);
            if(agora >= total){
                total = total + 30000;
                index++;
                addPeixes();
            }
            else if (agora >= total+20000){
                addObject (new Peixe(), Greenfoot.getRandomNumber(980)+10,0);
                addObject (new Peixe2(), Greenfoot.getRandomNumber(980)+10,0);
            }
        }
        public void populateWorld(){//adiciona os jogadores e os peixes random e o butao voltar ao mundo
            addObject(new Cena(),200,500);
            addObject(new Cena(),700,550);
            addObject(new Cena(),900,400);
            addObject(new Scuba(),500,500);
            addObject(new Player2(),600,300);
            
            rand=Greenfoot.getRandomNumber(2)+2;//incrementa aleatoriamente entre 2 a 4 peixes que depois são adicionadas as duas alternativas de peixes
            for(int i=0;i<rand;i++){
                addObject(new Peixe(),Greenfoot.getRandomNumber(950)+10,Greenfoot.getRandomNumber(550)+10);
                addObject(new Peixe2(),Greenfoot.getRandomNumber(950)+10,Greenfoot.getRandomNumber(550)+10);
            }
            
            Voltar voltar = new Voltar();
            addObject(voltar,48,545);
            voltar.setLocation(10,580);
            
        }
        /**
         * Prepare the world for the start of the program.
         * That is: create the initial objects and add them to the world.
         */
        int count=0;
        public void act(){
            addAlgas();
            addCopo();
            addGarrafa();
            addLata();
            addOleo();
            addPneu();
            addRede();
            addSaco();
            addTronco();   
            geraPeixes();
            
            if (vida2 == 0 && vida1 == 0){/*QUANDO OS DOIS JOGADORES FICAM SEM VIDAS O JOGO VAI PARA O PAINEL DE GAME OVER*/
                World newo = new newo();
                Greenfoot.setWorld(newo);
            }
            else if (vida1 == 0){
                //REMOVER O JOGADOR QUE JÁ FICOU SEM VIDAS
                removeObjects(getObjects(Scuba.class));
            }
            else if (vida2 == 0){
                //REMOVER O JOGADOR QUE JÁ FICOU SEM VIDAS
                removeObjects(getObjects(Player2.class));
            }
        }
        public void addPeixes()//adiciona peixes aleratoriamente
        {
            if (Greenfoot.getRandomNumber(500)<index)
            {
                addObject (new Peixe(), Greenfoot.getRandomNumber(980)+10,0);
                addObject (new Peixe2(), Greenfoot.getRandomNumber(980)+10,0);
            }
        }
        public void addAlgas()//adiciona algas aleratoriamente
        {
            if (Greenfoot.getRandomNumber(500)<index)
            {
                addObject (new Algas(), Greenfoot.getRandomNumber(980)+10,0);
            }
        }
        public void addCopo()//adiciona copos aleratoriamente
        {
            if (Greenfoot.getRandomNumber(100)<1)
            {
                addObject (new Copo(), Greenfoot.getRandomNumber(980)+10,0);
            }
        }
        public void addGarrafa()//adiciona garrafas aleratoriamente
        {
            if (Greenfoot.getRandomNumber(200)<1)
            {
                addObject (new Garrafa(), Greenfoot.getRandomNumber(980)+10,0);
            }
        }
        public void addLata()//adiciona latas aleratoriamente
        {
            if (Greenfoot.getRandomNumber(100)<1)
            {
                addObject (new Lata(), Greenfoot.getRandomNumber(980)+10,0);
            }
        }
        public void addOleo()//adiciona oleo aleratoriamente
        {
            if (Greenfoot.getRandomNumber(700)<index)
            {
                addObject (new Oleo(), Greenfoot.getRandomNumber(980)+10,0);
            }
        }
        public void addPneu()//adiciona pneu aleratoriamente
        {
            if (Greenfoot.getRandomNumber(700)<1)
            {
                addObject (new Pneu(), Greenfoot.getRandomNumber(980)+10,0);
            }
        }
        public void addRede()//adiciona rede aleratoriamente
        {
            if (Greenfoot.getRandomNumber(300)<index)
            {
                addObject (new Rede(), Greenfoot.getRandomNumber(980)+10,0);
            }
        }
        public void addSaco()//adiciona saco aleratoriamente
        {
            if (Greenfoot.getRandomNumber(100)<1)
            {
                addObject (new Saco(), Greenfoot.getRandomNumber(980)+10,0);
            }
        }
        public void addTronco()//adiciona tronco aleratoriamente
        {
            if (Greenfoot.getRandomNumber(300)<1)
            {
                addObject (new Tronco(), Greenfoot.getRandomNumber(980)+10,0);
            }
        }
        public void somaPontos(int pontos){//Soma os pontos dos jogadores
            score = score + pontos;
            showText("Score: " + score, 500, 40);
        }
        public void somaVidasUm(int vidas){//Variavel da vida o jogador um
            vida1 += vidas;
            showText("" + vida1, 100, 80);
        }
        public void somaVidasDois(int vidas){//variavel da vida jogador dois
            vida2 += vidas;
            showText("" + vida2, 900, 80);
        }
    }
