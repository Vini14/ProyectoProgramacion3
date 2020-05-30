package chatbot;

import java.awt.Dimension;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Todo extends javax.swing.JFrame {
    
public void imagen(){
 setIconImage(new ImageIcon(getClass().getResource("/img/Burguer.png")).getImage());
 }
    String pregunta, respuesta, preguntagenerada;

    void suma() {

        int t1 = Integer.parseInt(tot1.getText());
        int t2 = Integer.parseInt(tot2.getText());
        int t3 = Integer.parseInt(tot3.getText());
        int t4 = Integer.parseInt(tot4.getText());

        int tot = t1 + t2 + t3 + t4;

        String muestralo = String.valueOf(tot);

        TOTAL.setText("Q. " + muestralo);

    }

    void operacion1() {

        String spinner = "catch Value";
        Integer myint = (Integer) FF.getValue();
        spinner = myint.toString();
        q1.setText(spinner);

        int Pollitos = 15;
        int omborguesa = 17;
        int cant = Integer.parseInt(spinner);
        int suma;
        String show;

        if (P.isSelected()) {
            suma = Pollitos * cant;

            show = String.valueOf(suma);

        } else if (H.isSelected()) {
            suma = omborguesa * cant;
            show = String.valueOf(suma);

        } else {
            suma = 0 * cant;
            show = String.valueOf(suma);

        }
        tot1.setText(show);

        suma();

    }

    void operacion2() {

        String spinner = "catch Value";
        Integer myint = (Integer) PP.getValue();
        spinner = myint.toString();
        q2.setText(spinner);

        int Papitas = 15;
        int cant = Integer.parseInt(spinner);
        int suma;
        String show;

        if (pa.isSelected()) {
            suma = Papitas * cant;

            show = String.valueOf(suma);

        } else {
            suma = 0 * cant;
            show = String.valueOf(suma);

        }
        tot2.setText(show);

        suma();

    }

    void operacion3() {

        String spinner = "catch Value";
        Integer myint = (Integer) PP1.getValue();
        spinner = myint.toString();
        q3.setText(spinner);

        int heladito = 10;
        int pastelito = 8;
        int cant = Integer.parseInt(spinner);
        int suma;
        String show;

        if (hel.isSelected()) {
            suma = heladito * cant;

            show = String.valueOf(suma);

        } else if (cake.isSelected()) {
            suma = pastelito * cant;

            show = String.valueOf(suma);

        } else {
            suma = 0 * cant;
            show = String.valueOf(suma);

        }
        tot3.setText(show);

        suma();

    }

    void operacion4() {
        String spinner = "catch Value";
        Integer myint = (Integer) SS.getValue();
        spinner = myint.toString();
        q4.setText(spinner);

        int aguita = 8;
        int cant = Integer.parseInt(spinner);
        int suma;
        String show;

        if (agua.isSelected()) {
            suma = aguita * cant;

            show = String.valueOf(suma);

        } else {
            suma = 0 * cant;
            show = String.valueOf(suma);

        }
        tot4.setText(show);

        suma();
    }

    void enviar() {
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pregunta = texto.getText();
                    respuesta = (new BuscaDatos().translate(texto.getText()));
                    preguntagenerada = (new BuscaDatos().translate(generarpregunta()));
                    pantalla.append("USUARIO: " + texto.getText() + "\n");

                    texto.setText("");
                    animacionEscribir(respuesta);
                    int probabilidad = mitadProbabilidad();
                  
                    if (probabilidad > 5) {
                        
                        animacionpregunta(preguntagenerada);

                    }
                } catch (Exception e) {
                }
            }
        });
        hilo.start();

    }

    public Todo() {
        initComponents();
        setTitle("Hamburguesas Express");
        setIconImage(new ImageIcon(getClass().getResource("/img/Burguer.png")).getImage());
        q1.setVisible(false);
        q2.setVisible(false);
        q3.setVisible(false);
        q4.setVisible(false);

    }

    public String generarpregunta() {
        int numero;
        numero = (int) (Math.random() * 9) + 1;
        String preguntaAleatoria = Integer.toString(numero);
        String preguntacompletada = preguntaAleatoria + "p";
        return preguntacompletada;
    }

    public int mitadProbabilidad() {
        int numero;
        numero = (int) (Math.random() * 9) + 1;
        return numero;
    }

    public void animacionEscribir(String respuestaxd) throws InterruptedException, URISyntaxException, IOException {
        Thread.sleep(generarRandom());
        pantalla.append("CAJERO: " + respuestaxd + "\n");

        
    }

    public void animacionpregunta(String respuestaxd) throws InterruptedException {

    }

    public int generarRandom() {
        int numero;
        numero = (int) (Math.random() * 100) + 100;
        return numero;

    }

    public void fijarTexto() {
        pantalla.append("CAJERO: " + respuesta + "\n");
        texto.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fuerte = new javax.swing.ButtonGroup();
        Papas = new javax.swing.ButtonGroup();
        Postre = new javax.swing.ButtonGroup();
        Agua = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        enviar = new javax.swing.JButton();
        texto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pantalla = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ayuda = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        Panelarmalo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        P = new javax.swing.JRadioButton();
        H = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pa = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hel = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        cake = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        agua = new javax.swing.JRadioButton();
        FF = new javax.swing.JSpinner();
        tot1 = new javax.swing.JLabel();
        tot2 = new javax.swing.JLabel();
        tot3 = new javax.swing.JLabel();
        tot4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        PP = new javax.swing.JSpinner();
        PP1 = new javax.swing.JSpinner();
        SS = new javax.swing.JSpinner();
        Nombre = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        Direccion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 700));

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jTabbedPane2.setBackground(new java.awt.Color(0, 0, 255));

        jInternalFrame1.setVisible(true);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        enviar.setBackground(new java.awt.Color(255, 255, 255));
        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enviarPeq.png"))); // NOI18N
        enviar.setBorderPainted(false);
        enviar.setContentAreaFilled(false);
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        enviar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enviarPeq.png"))); // NOI18N
        enviar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enviarGra.png"))); // NOI18N
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        texto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });
        texto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoKeyTyped(evt);
            }
        });

        pantalla.setEditable(false);
        pantalla.setColumns(20);
        pantalla.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        pantalla.setLineWrap(true);
        pantalla.setRows(5);
        pantalla.setWrapStyleWord(true);
        jScrollPane1.setViewportView(pantalla);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/informacionPeq.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/informacionPeq.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/informacioGra.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hamburguesa.png"))); // NOI18N
        jLabel1.setText("Hamburguesas Expres");

        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayudar.png"))); // NOI18N
        ayuda.setText("ayuda");
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(129, 129, 129)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(texto)
                        .addGap(18, 18, 18)
                        .addComponent(enviar)
                        .addGap(48, 48, 48))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ayuda))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Chat", jInternalFrame1);

        jInternalFrame2.setVisible(true);

        Panelarmalo.setBackground(new java.awt.Color(153, 153, 153));
        Panelarmalo.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panelarmalo.add(jLabel3);
        jLabel3.setBounds(-40, 50, 607, 23);

        P.setBackground(new java.awt.Color(153, 153, 153));
        Fuerte.add(P);
        P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PMouseClicked(evt);
            }
        });
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });
        Panelarmalo.add(P);
        P.setBounds(88, 76, 25, 32);

        H.setBackground(new java.awt.Color(153, 153, 153));
        Fuerte.add(H);
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HMouseClicked(evt);
            }
        });
        Panelarmalo.add(H);
        H.setBounds(159, 76, 25, 32);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piernita.png"))); // NOI18N
        Panelarmalo.add(jLabel4);
        jLabel4.setBounds(56, 76, 32, 32);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hamburguesa.png"))); // NOI18N
        Panelarmalo.add(jLabel5);
        jLabel5.setBounds(127, 76, 32, 32);

        pa.setBackground(new java.awt.Color(153, 153, 153));
        Papas.add(pa);
        pa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paMouseClicked(evt);
            }
        });
        Panelarmalo.add(pa);
        pa.setBounds(88, 118, 25, 32);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/papas.png"))); // NOI18N
        Panelarmalo.add(jLabel6);
        jLabel6.setBounds(56, 118, 32, 32);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IceCream.png"))); // NOI18N
        Panelarmalo.add(jLabel7);
        jLabel7.setBounds(56, 156, 32, 32);

        hel.setBackground(new java.awt.Color(153, 153, 153));
        Postre.add(hel);
        hel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helMouseClicked(evt);
            }
        });
        Panelarmalo.add(hel);
        hel.setBounds(88, 156, 25, 32);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ChocolateCake.png"))); // NOI18N
        Panelarmalo.add(jLabel8);
        jLabel8.setBounds(127, 156, 32, 32);

        cake.setBackground(new java.awt.Color(153, 153, 153));
        Postre.add(cake);
        cake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cakeMouseClicked(evt);
            }
        });
        Panelarmalo.add(cake);
        cake.setBounds(159, 156, 25, 32);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Soda2.png"))); // NOI18N
        Panelarmalo.add(jLabel9);
        jLabel9.setBounds(56, 194, 32, 32);

        agua.setBackground(new java.awt.Color(153, 153, 153));
        Agua.add(agua);
        Panelarmalo.add(agua);
        agua.setBounds(88, 194, 25, 32);

        FF.setModel(new javax.swing.SpinnerNumberModel(0, 0, 8, 1));
        FF.setToolTipText("n");
        FF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FF.setDoubleBuffered(true);
        FF.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                FFStateChanged(evt);
            }
        });
        FF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FFMouseClicked(evt);
            }
        });
        Panelarmalo.add(FF);
        FF.setBounds(225, 76, 41, 32);

        tot1.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        tot1.setForeground(new java.awt.Color(255, 255, 255));
        tot1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tot1.setText("0");
        Panelarmalo.add(tot1);
        tot1.setBounds(333, 76, 104, 32);

        tot2.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        tot2.setForeground(new java.awt.Color(255, 255, 255));
        tot2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tot2.setText("0");
        Panelarmalo.add(tot2);
        tot2.setBounds(333, 114, 104, 32);

        tot3.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        tot3.setForeground(new java.awt.Color(255, 255, 255));
        tot3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tot3.setText("0");
        Panelarmalo.add(tot3);
        tot3.setBounds(333, 153, 104, 31);

        tot4.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        tot4.setForeground(new java.awt.Color(255, 255, 255));
        tot4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tot4.setText("0");
        Panelarmalo.add(tot4);
        tot4.setBounds(333, 190, 104, 32);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("=");
        Panelarmalo.add(jLabel10);
        jLabel10.setBounds(288, 76, 27, 32);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("=");
        Panelarmalo.add(jLabel11);
        jLabel11.setBounds(288, 123, 27, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("=");
        Panelarmalo.add(jLabel12);
        jLabel12.setBounds(288, 164, 27, 15);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("=");
        Panelarmalo.add(jLabel13);
        jLabel13.setBounds(288, 202, 27, 15);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("__________");
        Panelarmalo.add(jLabel14);
        jLabel14.setBounds(333, 228, 104, 15);

        TOTAL.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        TOTAL.setForeground(new java.awt.Color(255, 255, 255));
        TOTAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TOTAL.setText("0");
        Panelarmalo.add(TOTAL);
        TOTAL.setBounds(333, 254, 104, 16);
        Panelarmalo.add(q1);
        q1.setBounds(480, 17, 54, 0);
        Panelarmalo.add(q2);
        q2.setBounds(427, 17, 47, 0);
        Panelarmalo.add(q3);
        q3.setBounds(544, 17, 0, 0);
        Panelarmalo.add(q4);
        q4.setBounds(377, 17, 0, 0);

        PP.setModel(new javax.swing.SpinnerNumberModel(0, 0, 8, 1));
        PP.setToolTipText("n");
        PP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PP.setDoubleBuffered(true);
        PP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PPStateChanged(evt);
            }
        });
        PP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PPMouseClicked(evt);
            }
        });
        Panelarmalo.add(PP);
        PP.setBounds(225, 115, 41, 32);

        PP1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 8, 1));
        PP1.setToolTipText("n");
        PP1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PP1.setDoubleBuffered(true);
        PP1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PP1StateChanged(evt);
            }
        });
        PP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PP1MouseClicked(evt);
            }
        });
        Panelarmalo.add(PP1);
        PP1.setBounds(225, 156, 41, 32);

        SS.setModel(new javax.swing.SpinnerNumberModel(0, 0, 8, 1));
        SS.setToolTipText("n");
        SS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SS.setDoubleBuffered(true);
        SS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SSStateChanged(evt);
            }
        });
        SS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SSMouseClicked(evt);
            }
        });
        Panelarmalo.add(SS);
        SS.setBounds(225, 194, 41, 32);
        Panelarmalo.add(Nombre);
        Nombre.setBounds(530, 90, 130, 22);

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sumaPeq.png"))); // NOI18N
        agregar.setBorderPainted(false);
        agregar.setContentAreaFilled(false);
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        agregar.setDefaultCapable(false);
        agregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sumaPeq.png"))); // NOI18N
        agregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sumaGra.png"))); // NOI18N
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        Panelarmalo.add(agregar);
        agregar.setBounds(510, 180, 100, 50);

        Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionActionPerformed(evt);
            }
        });
        Panelarmalo.add(Direccion);
        Direccion.setBounds(530, 120, 130, 22);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre:");
        Panelarmalo.add(jLabel15);
        jLabel15.setBounds(460, 90, 60, 16);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Direccion:");
        Panelarmalo.add(jLabel16);
        jLabel16.setBounds(460, 120, 70, 16);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telefono:");
        Panelarmalo.add(jLabel17);
        jLabel17.setBounds(460, 150, 70, 16);
        Panelarmalo.add(Telefono);
        Telefono.setBounds(530, 150, 130, 22);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelarmalo, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelarmalo, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Crea tu Propio combo", jInternalFrame2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        
        String tot = TOTAL.getText();
        String nom = Nombre.getText();
        String dir = Direccion.getText();
        String tel = Telefono.getText();
        JOptionPane.showMessageDialog(null, "Gracias por armar su combo " + nom+" "+"puede regresar al chat para ver el total ");
        pantalla.append("Cajero: "+nom+ " Su total a pagar es de "+ tot + " su orden llegara aproximadamente en 30 minutos. Cualquiero duda nuestro repartidor lo estara llamando al numero "+ tel +""+"Es un gusto atenderle, algo mas en lo que le pueda ayudar? \n" );

    }//GEN-LAST:event_agregarActionPerformed

    private void SSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SSMouseClicked

    private void SSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SSStateChanged

        operacion4();
    }//GEN-LAST:event_SSStateChanged

    private void PP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PP1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PP1MouseClicked

    private void PP1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PP1StateChanged

        operacion3();
    }//GEN-LAST:event_PP1StateChanged

    private void PPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPMouseClicked
       
    }//GEN-LAST:event_PPMouseClicked

    private void PPStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PPStateChanged

        operacion2();
    }//GEN-LAST:event_PPStateChanged

    private void FFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FFMouseClicked

        String spinner = "catch Value";
        Integer myint = (Integer) FF.getValue();
        spinner = myint.toString();
        tot1.setText(spinner);
        int cant;
    }//GEN-LAST:event_FFMouseClicked

    private void FFStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_FFStateChanged

        operacion1();
    }//GEN-LAST:event_FFStateChanged

    private void cakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cakeMouseClicked

        operacion3();
    }//GEN-LAST:event_cakeMouseClicked

    private void helMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helMouseClicked

        operacion3();
    }//GEN-LAST:event_helMouseClicked

    private void paMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paMouseClicked

        operacion2();
    }//GEN-LAST:event_paMouseClicked

    private void HMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseClicked

        operacion1();
    }//GEN-LAST:event_HMouseClicked

    private void PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMouseClicked

        operacion1();
    }//GEN-LAST:event_PMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String UsuarioPregunta = JOptionPane.showInputDialog("Ingrese pregunta");
        String respuestUsuarioPregunta = JOptionPane.showInputDialog("Que responder a '" + UsuarioPregunta + "'");
        Leer aprender = new Leer();
        String nuevapalabra = aprender.preguntanueva(UsuarioPregunta, respuestUsuarioPregunta);
        aprender.guardar(aprender.leertxt("datos.txt"), nuevapalabra);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoKeyTyped

    }//GEN-LAST:event_textoKeyTyped

    private void textoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoKeyReleased

    }//GEN-LAST:event_textoKeyReleased

    private void textoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoKeyPressed

    }//GEN-LAST:event_textoKeyPressed

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
        
    }//GEN-LAST:event_textoActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed

        enviar();
    }//GEN-LAST:event_enviarActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
    JOptionPane.showMessageDialog(null,"Puedes iniciar el chat con uno de nuestros operadores con tan solo un hola, ademas si lo que buscas no esta en nuestros combos puedes armar el tuyo a tu gusto con tan solo un click en la pestaña de armalo tu!, es un placer atenderte!!");
    }//GEN-LAST:event_ayudaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Todo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Todo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Todo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Todo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Todo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Agua;
    private javax.swing.JTextField Direccion;
    private javax.swing.JSpinner FF;
    private javax.swing.ButtonGroup Fuerte;
    private javax.swing.JRadioButton H;
    private javax.swing.JTextField Nombre;
    private javax.swing.JRadioButton P;
    private javax.swing.JSpinner PP;
    private javax.swing.JSpinner PP1;
    private javax.swing.JPanel Panelarmalo;
    private javax.swing.ButtonGroup Papas;
    private javax.swing.ButtonGroup Postre;
    private javax.swing.JSpinner SS;
    private javax.swing.JLabel TOTAL;
    private javax.swing.JTextField Telefono;
    private javax.swing.JButton agregar;
    private javax.swing.JRadioButton agua;
    private javax.swing.JButton ayuda;
    private javax.swing.JRadioButton cake;
    private javax.swing.JButton enviar;
    private javax.swing.JRadioButton hel;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JRadioButton pa;
    private javax.swing.JTextArea pantalla;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JTextField texto;
    private javax.swing.JLabel tot1;
    private javax.swing.JLabel tot2;
    private javax.swing.JLabel tot3;
    private javax.swing.JLabel tot4;
    // End of variables declaration//GEN-END:variables
}
