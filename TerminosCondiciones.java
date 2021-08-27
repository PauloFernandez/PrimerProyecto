import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class TerminosCondiciones extends JFrame implements ActionListener, ChangeListener {
  private JLabel etiqueta1, etiqueta2, etiqueta3;
  private JTextArea area;
  private JScrollPane scroll;
  private JCheckBox checkbox;
  private JButton boton1, boton2;
  String nombre1 = "";

  public TerminosCondiciones(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Terminos y Condiciones");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombre1 = ventanaBienvenida.texto;

    ImageIcon imagen = new ImageIcon("images/coca-cola.png");
    etiqueta1 = new JLabel(imagen);
    etiqueta1.setBounds(300,300,300,150);
    add(etiqueta1);

    etiqueta2 = new JLabel("TERMINOS Y CONDICIONES");
    etiqueta2.setBounds(150,30,350,30);
    etiqueta2.setFont(new Font("Andale Mono", 1, 22));
    add(etiqueta2);

    area = new JTextArea();
    area.setEditable(false);
    area.setFont(new Font("Andale Mono", 0, 12));
    area.setText("\n\n          Terminos y Condiciones" +
                "\n\n        A. PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE PJ Software" +
                "\n        B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LA INTERFAZ GRAFICA" +
                "\n        C. PJ Software NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE" +
                "\n\n        LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                "\n        (PJ Software Y EL AUTOR PJ), NO SE RESPONSABILIZAN DEL USO QUE USTED HAGA CON ESTE SOFTWARE" +
                "\n        Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLICK EN (CONTINUAR)." +
                "\n        SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLICK EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                "\n\n       PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +
                "\n        http:www.pjsoftware.com");
    scroll = new JScrollPane(area);
    scroll.setBounds(25,70,650,250);
    add(scroll);

    checkbox = new JCheckBox("Yo " + nombre1 + " acepto los Terminos y Condiciones");
    checkbox.setBounds(25,330,250,30);
    checkbox.addChangeListener(this);
    add(checkbox);

    boton1 = new JButton("Continuar");
    boton1.setBounds(25,370,100,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);

    boton2 = new JButton("No aceptar");
    boton2.setBounds(140,370,100,30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);
    add(boton2);

    etiqueta3 = new JLabel("©2017 The Coca-Cola Company");
    etiqueta3.setBounds(350,410,300,30);
    etiqueta3.setFont(new Font("Andale Mono", 1, 12));
    add(etiqueta3);
  }

  public void stateChanged(ChangeEvent e){
    if (checkbox.isSelected() == true) {
      boton1.setEnabled(true);
      boton2.setEnabled(false);
    }else {
      boton1.setEnabled(false);
      boton2.setEnabled(true);
    }
  }

  public void actionPerformed(ActionEvent e){
    if (e.getSource() == boton1) {
      Principal Formulario3 = new Principal();
      Formulario3.setBounds(0,0,640,535);
      Formulario3.setVisible(true);
      Formulario3.setResizable(false);
      Formulario3.setLocationRelativeTo(null);
      this.setVisible(false);
    }
    if (e.getSource() == boton2) {
      Bienvenida Formulario1 = new Bienvenida();
      Formulario1.setBounds(0,0,350,500);
      Formulario1.setVisible(true);
      Formulario1.setResizable(false);
      Formulario1.setLocationRelativeTo(null);
      this.setVisible(false);
    }
  }

  public static void main(String[] args) {
    TerminosCondiciones Formulario2 = new TerminosCondiciones();
    Formulario2.setBounds(0,0,700,500);
    Formulario2.setVisible(true);
    Formulario2.setResizable(false);
    Formulario2.setLocationRelativeTo(null);
  }
}
