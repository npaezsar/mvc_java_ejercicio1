package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //--------------------
    // Atributos
    //--------------------


    //--------------------
    // Métodos
    //--------------------

    /*Método constructor*/
    public PanelOperaciones()
    {
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Borde y titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }
}
