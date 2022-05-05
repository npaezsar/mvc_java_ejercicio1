package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //--------------------
    // Atributos
    //--------------------
    private JLabel lX;
    private JLabel lY;
    private JLabel lImagen;
    private ImageIcon iImagen;
    private JTextField tfX;
    private JTextField tfY;

    //--------------------
    // Métodos
    //--------------------

    /*Método constructor*/
    public PanelEntradaDatos()
    {
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar imagen
        iImagen = new ImageIcon(getClass().getResource("mayor.png"));
        lImagen = new JLabel(iImagen);
        lImagen.setBounds(10,50,128,128);
        this.add(lImagen);

        //Crear y agregar etiqueta X
        lX = new JLabel("X = ");
        lX.setBounds(240, 50, 120, 20);
        this.add(lX);

        //Crear y agregar caja de texto X
        tfX = new JTextField();
        tfX.setBounds(360, 50, 80, 20);
        this.add(tfX);

        //Crear y agregar etiqueta Y
        lY = new JLabel("Y = ");
        lY.setBounds(240, 100, 120, 20);
        this.add(lY);

        //Crear y agregar caja de texto Y
        tfY = new JTextField();
        tfY.setBounds(360, 100, 80, 20);
        this.add(tfY);

        //Borde y titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    // Métodos de acceso a la informacion
    public String getTfX()
    {
        return tfX.getText();
    }

    public String getTfY()
    {
        return tfY.getText();
    }

    // Metodo borrar cajas de text
    public void borrar()
    {
        tfX.setText("");
        tfY.setText("");
    }
}