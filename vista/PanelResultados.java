package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{
    //--------------------
    // Atributos
    //--------------------


    //--------------------
    // Métodos
    //--------------------

    /*Método constructor*/
    public PanelResultados()
    {
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Borde y titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }
}
