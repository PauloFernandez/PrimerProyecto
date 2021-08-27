import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener {
  private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4;
  private JTextField cajatexto;
  private JButton boton;
  public static String texto = "";

  public Bienvenida(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    etiqueta1 = new JLabel(imagen);
    etiqueta1.setBounds(25,15,300,150);
    add(etiqueta1);

    etiqueta2 = new JLabel("Sistema de Control Vacacional");
    etiqueta2.setBounds(35,135,300,30);
    etiqueta2.setFont(new Font("Andale Mono", 3, 18));
    etiqueta2.setForeground(new Color(255,255,255));
    add(etiqueta2);

    etiqueta3 = new JLabel("Ingrese Nombre de Usuario");
    etiqueta3.setBounds(45,212,200,30);
    etiqueta3.setFont(new Font("Andale Mono", 1, 12));
    etiqueta3.setForeground(new Color(255,255,255));
    add(etiqueta3);

    etiqueta4 = new JLabel("©2017 The Coca-Cola Company");
    etiqueta4.setBounds(85,400,300,30);
    etiqueta4.setFont(new Font("Andale Mono", 1, 12));
    etiqueta4.setForeground(new Color(255,255,255));
    add(etiqueta4);

    cajatexto = new JTextField();
    cajatexto.setBounds(45,240,255,25);
    cajatexto.setBackground(new Color(224,224,224));
    cajatexto.setFont(new Font("Andale Mono", 1, 14));
    cajatexto.setForeground(new Color(255,0,0));
    add(cajatexto);

    boton = new JButton("Ingresar");
    boton.setBounds(125,280,100,30);
    boton.setBackground(new Color(225,225,225));
    boton.setFont(new Font("Andale Mono", 1, 14));
    boton.setForeground(new Color(255,0,0));
    boton.addActionListener(this);
    add(boton);
  }

  public void actionPerformed(ActionEvent e){
    if (e.getSource() == boton) {
      texto = cajatexto.getText().trim();
      if (texto.equals("")) {
        JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
      }else {
        TerminosCondiciones Formulario2 = new TerminosCondiciones();
        Formulario2.setBounds(0,0,700,500);
        Formulario2.setVisible(true);
        Formulario2.setResizable(false);
        Formulario2.setLocationRelativeTo(null);
        this.setVisible(false);
      }
    }
  }

  public static void main(String[] args) {
    Bienvenida Formulario1 = new Bienvenida();
    Formulario1.setBounds(0,0,350,500);
    Formulario1.setVisible(true);
    Formulario1.setResizable(false);
    Formulario1.setLocationRelativeTo(null);
  }
}
