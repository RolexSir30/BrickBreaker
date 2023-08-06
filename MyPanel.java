package BrickBreaker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;



/**le coeff directeur doit etre un float !!!!!!!**/
public class MyPanel extends JPanel implements ActionListener,MouseListener {
    int xvaisseau=380;
    int yvaisseau=720;
    int vitesse =3;
    int xbille;
    int scor=0;
    int ybille = 690;
    int lancement =0;
    int xbille2;
    float pointcliquedX;
    float pointcliquedY;
    int vitessep=20;
    int vitessex=3;
    int su=vitessex;
    JLabel vaisseau;
    int mouseX=xbille;
    int mouseY=ybille;
    Graphics p ;
    int score=0;
    JLabel brique1;
    JLabel brique2;
    JLabel brique3;
    JLabel brique4;
    JLabel brique5;
    JLabel brique6;
    JLabel brique7;
    JLabel brique8;
   
    
    
    
    HashMap<JLabel,Integer> bricos  =new HashMap<>(); // hashmap qui regroupe tout les brique1s !!!
   
    Image background;
    float coeffdirecteur;
    float pointorigine;
    //JLabel vaisseau;
    //JLabel bonbon;
    Timer timer;
   // Image backgro;
    //Graphics2D bille;
	public MyPanel() {
		// TODO Auto-generated constructor stub
		this.setBackground(Color.BLACK);
		this.setSize(new Dimension(800,800));
		//backgro=new ImageIcon("onepiece.png").get;
		vaisseau = new JLabel();
		vaisseau.setBounds(xvaisseau,yvaisseau,80,20);
		brique1=new JLabel();
		//background=new ImageIcon("arabic.png").getImage();
		brique1.setBounds(150, 80, 80, 20);
		//brique1.setBounds(200, 10, 80, 20);
		xbille= vaisseau.getX();
		//brique1.setBackground(Color.WHITE);
		vaisseau.setBackground(new Color(220,150,60));
		//this.setColor(Color.BLACK);
		vaisseau.setOpaque(true);
		brique1.setOpaque(true);
		this.add(vaisseau);
		this.add(brique1);
		this.addMouseListener(this);
	    timer=new Timer(1,this);
		timer.start();
		
		brique2= new JLabel();
		brique2.setBounds(300,80,80,20);
	    //brique2.setBackground(Color.WHITE);
		brique2.setOpaque(true);

		brique3= new JLabel();
		brique3.setBounds(450,80,80,20);
	    //brique3.setBackground(Color.WHITE);
		brique3.setOpaque(true);
		
		brique4= new JLabel();
		brique4.setBounds(150,120,80,20);
	    brique4.setBackground(Color.WHITE);
		brique4.setOpaque(true);
		
		brique5= new JLabel();
		brique5.setBounds(300,120,80,20);
	   // brique5.setBackground(Color.WHITE);
		brique5.setOpaque(true);

		brique6= new JLabel();
		brique6.setBounds(450,120,80,20);
	    brique6.setBackground(Color.WHITE);
		brique6.setOpaque(true);
		
		brique7= new JLabel();
		brique7.setBounds(150,200,80,20);
	    brique7.setBackground(Color.WHITE);
		brique7.setOpaque(true);
		
		brique7= new JLabel();
		brique7.setBounds(300,200,80,20);
	    brique7.setBackground(Color.WHITE);
		brique7.setOpaque(true);
		
		brique8= new JLabel();
		brique8.setBounds(450,200,80,20);
	    brique8.setBackground(Color.WHITE);
		brique8.setOpaque(true);
		
		
		
		this.add(brique2);
		this.add(brique3);
		this.add(brique4);
		this.add(brique5);
		this.add(brique6);
		this.add(brique7);
		this.add(brique8);
		






		bricos.put(brique1,1);
		bricos.put(brique2,1);
		bricos.put(brique3,1);
		bricos.put(brique4,1);
		bricos.put(brique5,1);
		bricos.put(brique6,1);
		bricos.put(brique7,1);
		bricos.put(brique8,1);
		
		
	   
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		
		
		if(ybille>brique1.getY()&&ybille<brique1.getY()+20&&xbille>brique1.getX()+75&&xbille<brique1.getX()+85) {
			vitessex=vitesse*-1;
			
		}
		
		if(xbille>760||xbille<5) {
			vitessex=vitessex*-1;
			lancement =3;
		}
		if(ybille<5) {
			coeffdirecteur=coeffdirecteur*-1;
			lancement=3;
		}
		
		if(ybille>700&&ybille<760) {
			
			if(xbille>vaisseau.getX()+40&&xbille<vaisseau.getX()+90 &&lancement==3) {
			coeffdirecteur=coeffdirecteur*-1;
			
		}
		if(xbille>vaisseau.getX()&&xbille<vaisseau.getX()+40 &&lancement==3) {
			coeffdirecteur=coeffdirecteur*-1;
			
		}}

		}

		
	
	/** La fonction paint va devoir dicter le mouvement de la bille.
	 *  Il faudra que lorsque lancement  >0, la bille suive un mouvement autonome**/
	
	
	
	public void paint(Graphics g) {
		
		Graphics2D imagedefond= (Graphics2D) g;
	
		//Graphics2D score = (Graphics2D) g ;
		
		Graphics2D score = (Graphics2D) g;
         score.setColor(Color.RED);
		Graphics2D bille = (Graphics2D) g;
		bille.setColor(Color.GREEN);
		Graphics2D scor =(Graphics2D) g;
		score.setColor(Color.RED);
		score.setFont(new Font("InkFree",Font.BOLD,20));
		score.drawString("Voici le score : "+scor,600,600);
		if (lancement==0) {
		super.paint(g);
		//bille.drawImage(background,0,0,null);
		bille.setColor(Color.GREEN);

		bille.fillOval(vaisseau.getX()+30, ybille, 20, 20);
		xbille= vaisseau.getX()+30;
	}
	
		else if(lancement ==1 ||lancement==3) {
		  
	        
	        super.paint(g);
	    	bille.drawImage(background,0,0,null);
	        	if((pointcliquedX>0||pointcliquedX==0)) {
	        		xbille=xbille+vitessex;
	        		
	        		bille.setColor(Color.GREEN);
	        		ybille= (int) (ybille+coeffdirecteur*su);
	        		bille.fillOval(xbille, ybille, 20, 20);
	        		for(Object brick : bricos.keySet()) { // on applique la fonction collision à toutes les briques ! 
	        			collision((JLabel) brick,bille,bricos.get(brick));
	        		}
	        	}


		
	        if(pointcliquedX<0) {
	        	xbille=xbille-vitessex;
	        	bille.setColor(Color.GREEN);
        		ybille=(int) (ybille-coeffdirecteur*su);;
				bille.fillOval(xbille, ybille, 20, 20);
				//System.out.println("xbille : "+xbille);
				//collision(brique1,bille);
				//rebond( vaisseau, bille);
        		for(Object brick : bricos.keySet()) { // on applique la fonction collision à toutes les briques ! 
        			collision((JLabel) brick,bille,bricos.get(brick));
        		}
		}
		} 
	        
	        
	       
		
			
	}
		
		
		
		
		
	
	
	private void collision(JLabel brique, Graphics2D bille, Integer clé) {
		// TODO Auto-generated method stub
		//public void collision(JLabel brique,Graphics2D bille) {
			
			if(xbille>brique.getX()-20&&xbille<brique.getX()+100&&ybille>brique.getY()-15&&ybille<brique.getY()+35&&clé==1) {
				

				
				//this.remove(brique1);

				if(xbille>brique.getX()+80) {
					vitessex=vitessex*-1;
					System.out.println("collision d'à droite");

				}
				
				if(xbille<brique.getX()) {
					vitessex=vitessex*-1;
					System.out.println("collision d' à gauche");

				}
				
				if(ybille>brique.getY()+20) {
					coeffdirecteur=coeffdirecteur*-1;
					System.out.println("collision d' en bas");
				}
				if(ybille<brique.getY()) {
					coeffdirecteur=coeffdirecteur*-1;
					System.out.println("collision d'en haut : "+coeffdirecteur);
				}
				System.out.println(coeffdirecteur);
				System.out.println("Collision !!!!!");
				///int bricos.get(brique)=2;
				this.remove(brique);
				brique.setBounds(1200, 1200, 0, 0);
				
			}
			
		}
		
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(lancement==0) {
		mouseX=e.getX();
	     mouseY=e.getY();
	    System.out.println(("mousex : "+mouseX));
	    System.out.println(("mousey : "+mouseY));	
	    pointcliquedX= mouseX-(vaisseau.getX()+30); //coordonées du points clique dans le repére où la bille est l'orgine
	    pointcliquedY= -(mouseY-vaisseau.getY());
          // System.out.println(pointcliquedX+","+pointcliquedY);
          pointorigine=(float) (mouseY-coeffdirecteur*mouseX); 
        coeffdirecteur = -pointcliquedY/pointcliquedX;
        System.out.println("coeffdirecteur : "+coeffdirecteur);
	    lancement =1;
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("yo");

	}
	@Override
	public void mouseExited(MouseEvent e) {

	}

	
	
	public void rebond(JLabel vaisseau,Graphics2D bille,int clé) {
	
	if(ybille<yvaisseau-10&&lancement==3) {
		
		if(xbille>vaisseau.getX()&&xbille<vaisseau.getX()+40) {
			if(pointcliquedX<0) {
				vitesse=Math.abs(vitesse);
			}
			else {
				vitesse=Math.abs(vitesse)*-1;
			}
		}
		
		if(xbille>vaisseau.getX()+40&&xbille<vaisseau.getX()+80) {
			if(pointcliquedX<0) {
				vitesse=-1*Math.abs(vitesse);
			}
			else {
				vitesse=Math.abs(vitesse);
			}
		}
	}
	}
}
