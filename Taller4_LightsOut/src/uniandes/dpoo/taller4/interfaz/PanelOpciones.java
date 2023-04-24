package uniandes.dpoo.taller4.interfaz;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelOpciones extends JPanel implements ActionListener
{
	private static final String NUEVO = "NUEVO";
	private static final String REINICIAR = "REINICIAR";
	private static final String TOP10 = "TOP-10";
	private static final String CAMBIO = "CAMBIAR JUGADOR";

    private InterfazLightsOut principal;

    public PanelOpciones( InterfazLightsOut pPrincipal )
    {
        principal = pPrincipal;

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JButton boton1 = new JButton("NUEVO");
		boton1.addActionListener(this);
		boton1.setActionCommand(NUEVO);
		add(boton1);

		JButton boton2 = new JButton("REINICIAR");
		boton2.addActionListener(this);
		boton2.setActionCommand(REINICIAR);
		add(boton2);

		JButton boton3 = new JButton("TOP-10");
		boton3.addActionListener(this);
		boton3.setActionCommand(TOP10);
		add(boton3);
		
		JButton boton4 = new JButton("CAMBIAR JUGADOR");
		boton4.addActionListener(this);
		boton4.setActionCommand(CAMBIO);
		add(boton4);
    }
		
	@Override	
    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );

        if( NUEVO.equals( comando ) )
        {
            principal.nuevo( );
        }
        else if( REINICIAR.equals( comando ) )
        {
            principal.reiniciar( );
        }
        else if( TOP10.equals( comando ))
        	{  
                try  
                    {  
                    File file_open = new File("top10.csv");   
                    if(!Desktop.isDesktopSupported())
                    {  
                        System.out.println("Error al cargar el archivo de Top 10");  
                        return;  
                    }  
                    Desktop desktop = Desktop.getDesktop();  
                    if(file_open.exists())         
                        desktop.open(file_open);             
                }  
                catch(Exception e)  
                {  
                    e.printStackTrace();  
                } 
        	}
        else if( CAMBIO.equals( comando ) )
        {
            principal.cambio( );
        }
    }
}

