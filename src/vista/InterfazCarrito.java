package vista;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Carrito;
import modelo.Categoria;
import modelo.GuardarToXML;
import modelo.LineaDePedido;
import modelo.Pedido;
import modelo.Producto;
import static vista.InterfazLoginAdmin.controlador;
import static vista.InterfazLoginAdmin.ultimoLogueado;

public class InterfazCarrito extends javax.swing.JFrame {

    public static Carrito carro = new Carrito();
    ArrayList<LineaDePedido> linea = new ArrayList<>();
    static DefaultListModel<LineaDePedido> modeloCarro = new DefaultListModel<>();

    public InterfazCarrito() {
        carro.getLdp().clear();
        modeloCarro.removeAllElements();
        initComponents();
        fillComboCategoria();
        jListCarrito.setModel(modeloCarro);

        if (controlador.getMoneda().getNombre().equals("Peso")) {
            jLabelTipoMoneda.setText("LOS PRECIOS ESTAN EXPRESADOS EN PESOS A VALOR $1=U$D" + controlador.getMoneda().getValor());
        } else {
            jLabelTipoMoneda.setText("LOS PRECIOS ESTAN EXPRESADOS EN DOLARES.");
        }
        jButtonFinalizar.setEnabled(false);
        jButtonRemover.setEnabled(false);

    }

    //rellenar el combobox de productos
    private void fillComboProd(Categoria cat) {

        for (Map.Entry ent : controlador.getListaProductos().getProductos().entrySet()) {

            Producto p = (Producto) ent.getValue();

            if (p.getCategoria().equals(cat)) {
                jComboBoxProductos.addItem(p);

            }
        }

    }

    private void fillComboCategoria() {

        for (Map.Entry ent : controlador.getListaCategorias().getCategorias().entrySet()) {

            Categoria p = (Categoria) ent.getValue();
            jComboBoxFiltrarCat.addItem(p);
        }
    }

    public void fillListaCarrito() {

        for (int i = 0; i < carro.getLdp().size(); i++) {

            modeloCarro.addElement(carro.getLdp().get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelBienvenido = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jComboBoxProductos = new javax.swing.JComboBox<>();
        jTextFieldCantidad = new javax.swing.JTextField();
        jButtonAgregarProd = new javax.swing.JButton();
        jLabelPrecioUnit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButtonFinalizar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListCarrito = new javax.swing.JList<>();
        jComboBoxFiltrarCat = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNumPedido = new javax.swing.JTextField();
        jLabelPedidoEstado = new javax.swing.JLabel();
        jButtonBuscarPedido = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaPedido = new javax.swing.JTextArea();
        jLabelcart = new javax.swing.JLabel();
        jLabelTipoMoneda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CheckOut");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 102));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(231, 111, 81));

        jLabelBienvenido.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(60, 63, 65));

        jTabbedPane1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1000, 1000));

        jPanel4.setBackground(new java.awt.Color(42, 157, 143));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(980, 779));

        jComboBoxProductos.setBackground(new java.awt.Color(233, 196, 106));
        jComboBoxProductos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jComboBoxProductos.setForeground(new java.awt.Color(38, 70, 83));
        jComboBoxProductos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxProductosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTextFieldCantidad.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldCantidad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldCantidad.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadActionPerformed(evt);
            }
        });

        jButtonAgregarProd.setBackground(new java.awt.Color(231, 111, 81));
        jButtonAgregarProd.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonAgregarProd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar.png"))); // NOI18N
        jButtonAgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarProdActionPerformed(evt);
            }
        });

        jLabelPrecioUnit.setBackground(new java.awt.Color(0, 153, 153));
        jLabelPrecioUnit.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelPrecioUnit.setForeground(new java.awt.Color(38, 70, 83));

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 70, 83));
        jLabel5.setText("PRODUCTO");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(38, 70, 83));
        jLabel15.setText("FILTRAR POR CATEGORIA");

        jButtonFinalizar.setBackground(new java.awt.Color(38, 70, 83));
        jButtonFinalizar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkout.png"))); // NOI18N
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        jButtonRemover.setBackground(new java.awt.Color(231, 111, 81));
        jButtonRemover.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonRemover.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove.png"))); // NOI18N
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jListCarrito.setBackground(new java.awt.Color(233, 196, 106));
        jListCarrito.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jListCarrito.setForeground(new java.awt.Color(38, 70, 83));
        jListCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jListCarrito.setSelectionBackground(new java.awt.Color(231, 111, 81));
        jListCarrito.setSelectionForeground(new java.awt.Color(233, 196, 106));
        jListCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListCarritoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jListCarrito);

        jComboBoxFiltrarCat.setBackground(new java.awt.Color(233, 196, 106));
        jComboBoxFiltrarCat.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jComboBoxFiltrarCat.setForeground(new java.awt.Color(38, 70, 83));
        jComboBoxFiltrarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFiltrarCatActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(38, 70, 83));
        jLabel7.setText("CANTIDAD");

        jLabel56.setBackground(new java.awt.Color(0, 153, 153));
        jLabel56.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(38, 70, 83));
        jLabel56.setText("PRECIO UNITARIO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxFiltrarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(1879, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                            .addComponent(jComboBoxProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jButtonAgregarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(1377, 1377, 1377))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPrecioUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxFiltrarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecioUnit))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jButtonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/images/buy.png")), jPanel4, "HACER UN PEDIDO"); // NOI18N

        jPanel5.setBackground(new java.awt.Color(42, 157, 143));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(38, 70, 83));
        jLabel2.setText("No. DE PEDIDO:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(38, 70, 83));
        jLabel4.setText("Ingrese su número de pedido para conocer el estado en el que se encuentra actualmente.");

        jTextFieldNumPedido.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldNumPedido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldNumPedido.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldNumPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumPedidoActionPerformed(evt);
            }
        });
        jTextFieldNumPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNumPedidoKeyReleased(evt);
            }
        });

        jLabelPedidoEstado.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabelPedidoEstado.setForeground(new java.awt.Color(233, 196, 106));

        jButtonBuscarPedido.setBackground(new java.awt.Color(231, 111, 81));
        jButtonBuscarPedido.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonBuscarPedido.setForeground(new java.awt.Color(38, 70, 83));
        jButtonBuscarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tracking.png"))); // NOI18N
        jButtonBuscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPedidoActionPerformed(evt);
            }
        });

        jTextAreaPedido.setEditable(false);
        jTextAreaPedido.setBackground(new java.awt.Color(233, 196, 106));
        jTextAreaPedido.setColumns(20);
        jTextAreaPedido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextAreaPedido.setForeground(new java.awt.Color(38, 70, 83));
        jTextAreaPedido.setRows(5);
        jScrollPane2.setViewportView(jTextAreaPedido);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabelPedidoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNumPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNumPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPedidoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/images/search.png")), jPanel5, "CONSULTAR PEDIDO"); // NOI18N

        jLabelcart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping_cart.png"))); // NOI18N

        jLabelTipoMoneda.setBackground(new java.awt.Color(38, 70, 83));
        jLabelTipoMoneda.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelTipoMoneda.setForeground(new java.awt.Color(38, 70, 83));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelcart, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2477, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBienvenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelcart, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadActionPerformed

    private void jButtonAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarProdActionPerformed

        String cant = jTextFieldCantidad.getText();
        Producto producto = (Producto) jComboBoxProductos.getSelectedItem();

        try {
            if ((!cant.equals("")) && (Integer.parseInt(cant) > 0)) {
                if (producto.hayStock(Integer.parseInt(cant))) {

                    carro.setCliente(ultimoLogueado);

                    linea.add(new LineaDePedido(producto, Integer.parseInt(cant)));

                    carro.setLdp(linea);
                    carro.setTotal(linea);

                    producto.setStock(producto.getStock() - Integer.parseInt(cant));

                    jTextFieldCantidad.setText("");

                    modeloCarro.removeAllElements();
                    fillListaCarrito();

                    if ((carro.getLdp().isEmpty())) {
                        jButtonFinalizar.setEnabled(false);

                        jButtonRemover.setEnabled(false);
                    } else {
                        jButtonFinalizar.setEnabled(true);

                        jButtonRemover.setEnabled(true);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "No hay stock suficiente", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingresa un número válido.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa un número.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButtonAgregarProdActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed

        if (JOptionPane.showConfirmDialog(this, "Ya completaste tu pedido?", "IR AL CHECKOUT", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            InterfazCheckout c = new InterfazCheckout();

            c.setVisible(true);
            this.setVisible(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(this, "Desea guardar los datos?", "GUARDAR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                GuardarToXML.guardar(controlador);
                JOptionPane.showMessageDialog(this, "Los datos se guardaron correctamente.", "EXITO", JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "No se pudieron exportar los datos\n" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabelBienvenido.setText("¡Bienvenido, " + ultimoLogueado.getNombre() + "!");
    }//GEN-LAST:event_formWindowOpened

    private void jTextFieldNumPedidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumPedidoKeyReleased


    }//GEN-LAST:event_jTextFieldNumPedidoKeyReleased

    private void jButtonBuscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPedidoActionPerformed

        String num = jTextFieldNumPedido.getText();

        if (!num.equals("") && Integer.parseInt(num) > 0) {
            try {
                Pedido p = controlador.getListaPedidos().getPedidos().get(Integer.parseInt(num));

                if (!(p == null) && (p.getCarrito().getCliente().equals(ultimoLogueado))) {

                    jLabelPedidoEstado.setText("TU PEDIDO SE ENCUENTRA " + p.getEstado());

                    jTextAreaPedido.setText(p.toString());

                } else {
                    JOptionPane.showMessageDialog(this, "No tienes pedidos con ese número.", "YOU SHALL NOT PASS!", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(this, "Ingresa un número.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Ingresa un número válido.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButtonBuscarPedidoActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed

        LineaDePedido ldp = jListCarrito.getSelectedValue();

        carro.getLdp().remove(ldp);

        ldp.getProd().setStock(ldp.getProd().getStock() + ldp.getCantidad());

        modeloCarro.removeAllElements();
        fillListaCarrito();

        jComboBoxProductos.removeAllItems();
        fillComboProd(ldp.getProd().getCategoria());

        if ((carro.getLdp().isEmpty())) {
            jButtonFinalizar.setEnabled(false);
            jButtonRemover.setEnabled(false);
        } else {
            jButtonFinalizar.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jListCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCarritoMouseClicked


    }//GEN-LAST:event_jListCarritoMouseClicked

    private void jComboBoxFiltrarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFiltrarCatActionPerformed

        jComboBoxProductos.removeAllItems();

        Categoria c = (Categoria) jComboBoxFiltrarCat.getSelectedItem();

        fillComboProd(c);// TODO add your handling code here:


    }//GEN-LAST:event_jComboBoxFiltrarCatActionPerformed

    private void jTextFieldNumPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumPedidoActionPerformed

    private void jComboBoxProductosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxProductosPopupMenuWillBecomeInvisible
        Producto producto = (Producto) jComboBoxProductos.getSelectedItem();

        if (controlador.getMoneda().getNombre().equals("Peso")) {

            jLabelPrecioUnit.setText("$" + (producto.getPrecio() * controlador.getMoneda().getValor()));

        } else {
            jLabelPrecioUnit.setText("U$D" + (producto.getPrecio()));

        }         // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProductosPopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(InterfazCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCarrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarProd;
    private javax.swing.JButton jButtonBuscarPedido;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JComboBox<Categoria> jComboBoxFiltrarCat;
    private javax.swing.JComboBox<Producto> jComboBoxProductos;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelPedidoEstado;
    private javax.swing.JLabel jLabelPrecioUnit;
    private javax.swing.JLabel jLabelTipoMoneda;
    private javax.swing.JLabel jLabelcart;
    private javax.swing.JList<LineaDePedido> jListCarrito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaPedido;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldNumPedido;
    // End of variables declaration//GEN-END:variables
}
