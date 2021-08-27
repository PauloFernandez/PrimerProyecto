import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
  private JMenuBar menubar;
  private JMenu opciones, calculo, desarrollador, color;
  private JMenuItem rojo, negro, morado, nuevo, salir, vacaciones, datocreador;
  private JLabel logo1, nombre, apellidoP, apellidoM, departamento, antiguedad, resultado, etiqueta1, etiqueta2, etiqueta3;
  private JTextField nombreBox, apellidoPBox, apellidoMBox;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JScrollPane scroll;
  private JTextArea area;
  String nombre2 = "";

  public Principal(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Principal");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombre2 = ventanaBienvenida.texto;

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    logo1 = new JLabel(imagen);
    logo1.setBounds(5,5,250,100);
    add(logo1);

    menubar = new JMenuBar();
    menubar.setBackground(new Color(255,0,0));
    setJMenuBar(menubar);

    opciones = new JMenu("Opciones");
    opciones.setBackground(new Color(255,0,0));
    opciones.setFont(new Font("Andale Mono", 1, 14));
    opciones.setForeground(new Color(255,255,255));
    menubar.add(opciones);

    calculo = new JMenu("Calcular");
    calculo.setBackground(new Color(255,0,0));
    calculo.setFont(new Font("Andale Mono", 1, 14));
    calculo.setForeground(new Color(255,255,255));
    menubar.add(calculo);

    desarrollador = new JMenu("Acerca de:");
    desarrollador.setBackground(new Color(255,0,0));
    desarrollador.setFont(new Font("Andale Mono", 1, 14));
    desarrollador.setForeground(new Color(255,255,255));
    menubar.add(desarrollador);

    color = new JMenu("Color de Fondo");
    color.setFont(new Font("Andale Mono", 1, 14));
    color.setForeground(new Color(255,0,0));
    opciones.add(color);

    vacaciones = new JMenuItem("Vacaciones");
    vacaciones.setFont(new Font("Andale Mono", 1, 14));
    vacaciones.setForeground(new Color(255,0,0));
    vacaciones.addActionListener(this);
    calculo.add(vacaciones);

    rojo = new JMenuItem("Rojo");
    rojo.setFont(new Font("Andale Mono", 1, 14));
    rojo.setForeground(new Color(255,0,0));
    rojo.addActionListener(this);
    color.add(rojo);

    negro = new JMenuItem("Negro");
    negro.setFont(new Font("Andale Mono", 1, 14));
    negro.setForeground(new Color(255,0,0));
    negro.addActionListener(this);
    color.add(negro);

    morado = new JMenuItem("Morado");
    morado.setFont(new Font("Andale Mono", 1, 14));
    morado.setForeground(new Color(255,0,0));
    morado.addActionListener(this);
    color.add(morado);

    nuevo = new JMenuItem("Nuevo");
    nuevo.setFont(new Font("Andale Mono", 1, 14));
    nuevo.setForeground(new Color(255,0,0));
    nuevo.addActionListener(this);
    opciones.add(nuevo);

    salir = new JMenuItem("Salir");
    salir.setFont(new Font("Andale Mono", 1, 14));
    salir.setForeground(new Color(255,0,0));
    salir.addActionListener(this);
    opciones.add(salir);

    datocreador = new JMenuItem("Info. Desarrollador");
    datocreador.setFont(new Font("Andale Mono", 1, 14));
    datocreador.setForeground(new Color(255,0,0));
    datocreador.addActionListener(this);
    desarrollador.add(datocreador);

    etiqueta1 = new JLabel("Bienvenido " + nombre2);
    etiqueta1.setBounds(280,30,300,50);
    etiqueta1.setFont(new Font("Andale Mono", 1, 32));
    etiqueta1.setForeground(new Color(255,255,255));
    add(etiqueta1);

    etiqueta2 = new JLabel("Datos del trabajador para el calculo de vacaciones");
    etiqueta2.setBounds(45,140,900,25);
    etiqueta2.setFont(new Font("Andale Mono", 0, 24));
    etiqueta2.setForeground(new Color(255,255,255));
    add(etiqueta2);

    nombre = new JLabel("Nombre Completo:");
    nombre.setBounds(25,188,180,25);
    nombre.setFont(new Font("Andale Mono", 1, 12));
    nombre.setForeground(new Color(255,255,255));
    add(nombre);

    nombreBox = new JTextField();
    nombreBox.setBounds(25,213,150,25);
    nombreBox.setBackground(new java.awt.Color(224,224,224));
    nombreBox.setFont(new java.awt.Font("Andale Mono", 1, 12));
    nombreBox.setForeground(new java.awt.Color(255,0,0));
    add(nombreBox);

    apellidoP = new JLabel("Apellido Paterno");
    apellidoP.setBounds(25,248,180,25);
    apellidoP.setFont(new Font("Andale Mono", 1, 12));
    apellidoP.setForeground(new Color(255,255,255));
    add(apellidoP);

    apellidoPBox = new JTextField();
    apellidoPBox.setBounds(25,273,150,25);
    apellidoPBox.setBackground(new java.awt.Color(224,224,224));
    apellidoPBox.setFont(new java.awt.Font("Andale Mono", 1, 14));
    apellidoPBox.setForeground(new java.awt.Color(255,0,0));
    add(apellidoPBox);

    apellidoM = new JLabel("Apellido Materno");
    apellidoM.setBounds(25,307,180,25);
    apellidoM.setFont(new Font("Andale Mono", 1, 12));
    apellidoM.setForeground(new Color(255,255,255));
    add(apellidoM);

    apellidoMBox = new JTextField();
    apellidoMBox.setBounds(25,333,150,25);
    apellidoMBox.setBackground(new java.awt.Color(224,224,224));
    apellidoMBox.setFont(new java.awt.Font("Andale Mono", 1,14));
    apellidoMBox.setForeground(new java.awt.Color(255,0,0));
    add(apellidoMBox);

    departamento = new JLabel("Selecciona el Departamento:");
    departamento.setBounds(220,188,180,25);
    departamento.setFont(new Font("Andale Mono", 1, 12));
    departamento.setForeground(new Color(255,255,255));
    add(departamento);

    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(220,213,220,25);
    comboDepartamento.setBackground(new java.awt.Color(224,224,224));
    comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
    comboDepartamento.setForeground(new java.awt.Color(255,0,0));
    add(comboDepartamento);
    comboDepartamento.addItem("");
    comboDepartamento.addItem("Atencion al Cliente");
    comboDepartamento.addItem("Departamento de Logistica");
    comboDepartamento.addItem("Departamento de Gerencia");

    antiguedad = new JLabel("Selecciona la Antiguedad:");
    antiguedad.setBounds(220,248,180,25);
    antiguedad.setFont(new Font("Andale Mono",1 ,12));
    antiguedad.setForeground(new Color(255,255,255));
    add(antiguedad);

    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(220,273,220,25);
    comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
    comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
    comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
    add(comboAntiguedad);
    comboAntiguedad.addItem("");
    comboAntiguedad.addItem("1 año de servicio");
    comboAntiguedad.addItem("2 a 6 años de servicio");
    comboAntiguedad.addItem("7 años o mas de servicio");

    resultado = new JLabel("Resultado del Calculo:");
    resultado .setBounds(220,307,180,25);
    resultado .setFont(new Font("Andale Mono",1 ,12));
    resultado .setForeground(new Color(255,255,255));
    add(resultado);

    area = new JTextArea();
    area.setEditable(false);
    area.setBackground(new Color(224,224,224));
    area.setFont(new Font("Andale Mono", 1, 11));
    area.setForeground(new Color(255,0,0));
    area.setText("\n Aqui aparecel el resultado del calculo de las vacaciones.");
    scroll = new JScrollPane(area);
    scroll.setBounds(220,333,385,90);
    add(scroll);

    etiqueta3 = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
    etiqueta3.setBounds(135,445,500,30);
    etiqueta3.setFont(new java.awt.Font("Andale Mono", 1, 12));
    etiqueta3.setForeground(new java.awt.Color(255,255,255));
    add(etiqueta3);
  }

  public void actionPerformed(ActionEvent e){
    if (e.getSource() == rojo) {
      getContentPane().setBackground(new Color(255,0,0));
    }
    if (e.getSource() == negro) {
      getContentPane().setBackground(new Color(0,0,0));
    }
    if (e.getSource() == morado) {
      getContentPane().setBackground(new Color(128,0,128));
    }
    if (e.getSource() == nuevo) {
      nombreBox.setText("");
      apellidoPBox.setText("");
      apellidoMBox.setText("");
      comboDepartamento.setSelectedIndex(0);
      comboAntiguedad.setSelectedIndex(0);
      area.setText("\n Aqui aparecel el resultado del calculo de las vacaciones.");
    }
    if (e.getSource() == salir) {
      Bienvenida Formulario1 = new Bienvenida();
      Formulario1.setBounds(0,0,350,500);
      Formulario1.setVisible(true);
      Formulario1.setResizable(false);
      Formulario1.setLocationRelativeTo(null);
      this.setVisible(false);
    }
    if (e.getSource() == vacaciones) {
      String nom = nombreBox.getText();
      String apPaterno = apellidoPBox.getText();
      String apMaterno = apellidoMBox.getText();
      String dep = comboDepartamento.getSelectedItem().toString();
      String ant = comboAntiguedad.getSelectedItem().toString();
      if (nom.equals("") || apPaterno.equals("") || apMaterno.equals("") || dep.equals("") || ant.equals("")) {
        JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
      }else {
        if (dep.equals("Atencion al Cliente")) {
          if (ant.equals("1 año de servicio")) {
            area.setText("\n El Trabajador " + nom + " " + apPaterno + " " + apMaterno +
                         "\n quien labora en " + dep + " con " + ant + " recibe 6 dias de vacaciones.");
          }
          if (ant.equals("2 a 6 años de servicio")) {
            area.setText("\n El Trabajador " + nom + " " + apPaterno + " " + apMaterno +
                         "\n quien labora en " + dep + " con " + ant +
                         "\n recibe 14 dias de vacaciones.");
          }
          if (ant.equals("7 años o mas de servicio")) {
            area.setText("\n El Trabajador " + nom + " " + apPaterno + " " + apMaterno +
                         "\n quien labora en " + dep + " con " + ant +
                         "\n recibe 20 dias de vacaciones.");
          }
        }
        if (dep.equals("Departamento de Logistica")) {
          if (ant.equals("1 año de servicio")) {
            area.setText("\n El Trabajador " + nom + " " + apPaterno + " " + apMaterno +
                         "\n quien labora en " + dep + " con " + ant +
                         "\n recibe 7 dias de vacaciones.");
          }
          if (ant.equals("2 a 6 años de servicio")) {
            area.setText("\n El Trabajador " + nom + " " + apPaterno + " " + apMaterno +
                         "\n quien labora en " + dep + " con " + ant +
                         "\n recibe 15 dias de vacaciones.");
          }
          if (ant.equals("7 años o mas de servicio")) {
            area.setText("\n El Trabajador " + nom + " " + apPaterno + " " + apMaterno +
                         "\n quien labora en " + dep + " con " + ant +
                         "\n recibe 22 dias de vacaciones.");
          }
        }
        if (dep.equals("Departamento de Gerencia")) {
          if (ant.equals("1 año de servicio")) {
            area.setText("\n El trabajador " + nom + " " + apPaterno + " " + apMaterno +
                         "\n quien labora en " + dep + " con " + ant +
                         "\n recibe 10 dias de vacaciones.");
          }
          if (ant.equals("2 a 6 años de servicio")) {
            area.setText("\n El trabajador " + nom + " " + apPaterno + " " + apMaterno +
                         "\n quien labora en " + dep + " con " + ant +
                         "\n recibe 20 dias de vacaciones.");
          }
          if (ant.equals("7 años o mas de servicio")) {
            area.setText("\n El trabajador " + nom + " " + apPaterno + " " + apMaterno +
                         "\n quien labora en " + dep + " con " + ant +
                         "\n recibe 30 dias de vacaciones.");
          }
        }
      }
    }
    if (e.getSource() == datocreador) {
      JOptionPane.showMessageDialog(null, "Sistema Desarrollado por PJ Software" +
                                    "\n       http:www.pjsoftware.com");
    }
  }

  public static void main(String[] args) {
    Principal Formulario3 = new Principal();
    Formulario3.setBounds(0,0,640,535);
    Formulario3.setVisible(true);
    Formulario3.setResizable(false);
    Formulario3.setLocationRelativeTo(null);
  }
}
