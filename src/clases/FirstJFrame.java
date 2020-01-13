package clases;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
/**
 * @author MARIO LUZARDO
 *
 */
public class FirstJFrame extends JFrame{
	/**
	 * @Atrib
	 */
	private JPanel panel;
	/**
	 * @Constructores @Default
	 */
	public FirstJFrame() {
		super("TAREA 1");
		int m=0;
		int n = 0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Asignar tamaño a ventana en el orden: 1. ANCHO  2.ALTO");
			try {
				 m = in.nextInt();
				 n = in.nextInt();
			}catch(Exception e) {
				System.out.println("Los datos ingresados no son validos");
			}
		}while(n%2!=0);
		this.setSize(m*202,n*30);
		panel = new JPanel();
	    panel.setLayout(null);
	    panel.setSize( this.getX(), this.getY());
	    setContentPane(panel);
		JTextField [][] tex = new JTextField[m][n];
		JButton [][] but = new JButton[m][n];
		for (int i = 0,x=0; i < m; i++,x+=200) { 
			for(int j =0,y=0;j<m; j++,y+=25) {
				
				tex[i][j] = new JTextField ();
				but[i][j] = new JButton();
				tex[i][j].setBounds(0+x,0+y,100, 25);
				but[i][j].setBounds(0+100+x,0+y,100,25);
				String b=palabra();
				tex[i][j].setText(b);
				b=palabra();
				but[i][j].setText(b);
				but[i][j].setBackground(Color.GRAY);
				tex[i][j].setBackground(Color.cyan);
			}
		}
		for (int i = 0; i < m; i++) { 
			for(int j =0;j<m; j++) {
				panel.add(but[i][j]);
				panel.add(tex[i][j]);
			}
		}
	}
	/**
	 * @Metodos
	 */
	public String palabra() {
		String a="";
		int ran = 0;
		int ranP = 0;
			ranP =(int) Math.floor(Math.random()*(03-10+1)+10);
			for(int i=0;i<ranP;i++) {	
				ran =(int) Math.floor(Math.random()*(97-122+1)+122);
				a+=(char)ran;
			}
		/**
		 * 
		 * @return a
		 */
		return a;
	}
} 