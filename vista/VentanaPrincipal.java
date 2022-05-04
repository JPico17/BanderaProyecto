package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------
    // Atributos
    //----------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelSalida miPanelSalida;
    

    //--------
    // Metodos
    //--------

    /*Método constructor*/
    public VentanaPrincipal()
    {
        //Contenedor de la ventana
        this.setLayout(null);

        //Crear y agregar el PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,480,200);
        this.add(miPanelEntradaDatos);

        //Crear y agregar el PanelEntradaDatos
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,200,480,140);
        this.add(miPanelOperaciones);

        //Crear y agregar el PanelEntradaDatos
        miPanelSalida = new PanelSalida();
        miPanelSalida.setBounds(10,325,480,120);
        this.add(miPanelSalida);

        // Caracteristicas de la ventana
        this.setTitle("Bandera de Colombia");
        this.setSize(500,500);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public PanelEntradaDatos getMiPanelEntradaDatos() {
        return miPanelEntradaDatos;
    }

    public void setMiPanelEntradaDatos(PanelEntradaDatos miPanelEntradaDatos) {
        this.miPanelEntradaDatos = miPanelEntradaDatos;
    }
}