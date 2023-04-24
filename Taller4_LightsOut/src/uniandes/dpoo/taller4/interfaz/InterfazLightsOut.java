package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import uniandes.dpoo.taller4.modelo.Tablero;
import uniandes.dpoo.taller4.modelo.Top10;
import uniandes.dpoo.taller4.modelo.RegistroTop10;


@SuppressWarnings("serial")

public class InterfazLightsOut extends JFrame 
{
	 public static void main( String[] args )
	    {
	        InterfazLightsOut juego = new InterfazLightsOut( );
	        juego.setVisible( true );
	    }
	 public void nuevo()
	 {
		 
	 }
	 public void reiniciar()
	 {
		 
	 }
	 public void top10()
	 {
		 
	 }
	public void cambio() 
	{
		
	}
	private PanelOpciones panelOpciones;
	{
		
	}
	private Tablero tableroLuces;
	{
		
	}
	
	public InterfazLightsOut( )
    {
		setTitle( "Lights Out" );
        setSize( 460, 700 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setResizable( false );
        setLocationRelativeTo( null );
        
        //paneltablero = new PanelTablero ();
        //add( panelTablero, BorderLayout.CENTER );
        
		JPanel panelDerecha = new JPanel( );
		
		panelOpciones = new PanelOpciones( this );
        panelDerecha.add( panelOpciones, BorderLayout.EAST );
        
        JPanel panelGris = new JPanel();
		panelGris.setBackground(Color.GRAY);
		panelGris.setOpaque(true);
		panelGris.setLayout(new GridBagLayout());
		panelGris.add(panelDerecha);
		
		add(panelGris, BorderLayout.EAST);
    }
	
	private void cambiarColor(JButton b)
	{
		if(b.getBackground()==Color.BLACK)			//the button b is black, then it is changed to yellow, otherwise it is
		{											//changed to black.
			b.setBackground(Color.YELLOW);
		}
		else
		{
			b.setBackground(Color.BLACK);
		}
	}
}

