package uniandes.dpoo.taller4.interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;

public class PanelTablero extends JPanel implements ActionListener{
	{
		
	}
	private InterfazLightsOut principal;
	private int tamanio;
	
	public PanelTablero( InterfazLightsOut pPrincipal, int pFilas, int pColumnas )
    {
        principal = pPrincipal;
        tamanio = pColumnas;
        tamanio = pFilas;
    }
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String comando = e.getActionCommand( );

        String[] coordenada = comando.split( "," );
        int i = Integer.parseInt( coordenada[ 0 ] );
        int j = Integer.parseInt( coordenada[ 1 ] );

       
	}
	

}
