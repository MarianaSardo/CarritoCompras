package vista;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Controlador;
import modelo.GuardarToXML;
import modelo.Moneda;
import modelo.OperacionInvalidaException;
import modelo.Carrito;
import modelo.Pedido;
import modelo.PedidoEstado;
import modelo.Producto;
import modelo.Usuario;
import modelo.UsuarioCliente;
import modelo.UsuarioGestor;

public class InterfazLoginAdmin extends javax.swing.JFrame {

    static Controlador controlador = new Controlador();
    static UsuarioCliente ultimoLogueado;
    static DefaultListModel<Categoria> modeloCateg = new DefaultListModel<>();
    static DefaultListModel<Producto> modeloProd = new DefaultListModel<>();
    static DefaultListModel<Pedido> modeloPedido = new DefaultListModel<>();
    static DefaultListModel<UsuarioCliente> modeloCliente = new DefaultListModel<>();
    static DefaultListModel<UsuarioGestor> modeloGestor = new DefaultListModel<>();

    public InterfazLoginAdmin() {
        initComponents();
        jListClientesEdit.setModel(modeloCliente);
        jListGestoresEdit.setModel(modeloGestor);
        jListCategoria.setModel(modeloCateg);
        jListCategoriaEdit.setModel(modeloCateg);
        jListCategoriaFiltrar.setModel(modeloCateg);
        jListCategoriaEditProd.setModel(modeloCateg);
        jListPedidosEdit.setModel(modeloPedido);
        jListProductosEdit.setModel(modeloProd);
        jListClienteFiltrar.setModel(modeloCliente);
        fillComboPedidoEstado();

       
    }

//llenar lista usuarios
    public void fillListaCliente() {

        for (Map.Entry entry : controlador.getListaUsuarios().getUsuarios().entrySet()) {
            Usuario u = (Usuario) entry.getValue();

            if (u.getTipoUser().equals("cliente")) {
                modeloCliente.addElement((UsuarioCliente) entry.getValue());
            }
        }
    }

    public void fillListaGestor() {

        for (Map.Entry entry : controlador.getListaUsuarios().getUsuarios().entrySet()) {
            Usuario u = (Usuario) entry.getValue();

            if (u.getTipoUser().equals("gestor")) {
                modeloGestor.addElement((UsuarioGestor) entry.getValue());
            }
        }
    }

    //llenar lista categorias
    public void fillListaCategoria() {
        for (Map.Entry entry : controlador.getListaCategorias().getCategorias().entrySet()) {
            Categoria u = (Categoria) entry.getValue();
            modeloCateg.addElement((Categoria) entry.getValue());

        }
    }
    //llenar lista pedidos

    public void fillListaPedido() {
        for (Map.Entry entry : controlador.getListaPedidos().getPedidos().entrySet()) {
            Pedido u = (Pedido) entry.getValue();
            modeloPedido.addElement((Pedido) entry.getValue());

        }
    }

    //llenar lista producto
    public void fillListaProducto() {
        for (Map.Entry entry : controlador.getListaProductos().getProductos().entrySet()) {
            Producto u = (Producto) entry.getValue();
            modeloProd.addElement((Producto) entry.getValue());

        }
    }

    //llenar combo de estados de pedido
    private void fillComboPedidoEstado() {

        jComboBoxPedidoEstado.addItem(PedidoEstado.ENTREGADO);
        jComboBoxPedidoEstado.addItem(PedidoEstado.ENVIADO);
        jComboBoxPedidoEstado.addItem(PedidoEstado.INGRESADO);
        jComboBoxPedidoEstado.addItem(PedidoEstado.PAGADO);
        jComboBoxPedidoEstado.addItem(PedidoEstado.PROCESADO);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupMoneda = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabbedPaneTodo = new javax.swing.JTabbedPane();
        jPanelAgregar = new javax.swing.JPanel();
        jTabbedPaneAgregar = new javax.swing.JTabbedPane();
        jPanelAgregarCliente = new javax.swing.JPanel();
        jLabelCuitCliente = new javax.swing.JLabel();
        jLabelPasswordCliente = new javax.swing.JLabel();
        jLabelNombreCliente = new javax.swing.JLabel();
        jLabelTelefonoCliente = new javax.swing.JLabel();
        jLabelDireccionCliente = new javax.swing.JLabel();
        jLabelLocalidadCliente = new javax.swing.JLabel();
        jTextFieldCuitCliente = new javax.swing.JTextField();
        jTextFieldLocalidadCliente = new javax.swing.JTextField();
        jTextFieldTelefonoCliente = new javax.swing.JTextField();
        jTextFieldNombreCliente = new javax.swing.JTextField();
        jTextFieldDireccionCliente = new javax.swing.JTextField();
        jButtonAgregarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPasswordCliente = new javax.swing.JPasswordField();
        jPanelAgregarGestor = new javax.swing.JPanel();
        jTextFieldNombreGestor = new javax.swing.JTextField();
        jTextFieldCuitGestor = new javax.swing.JTextField();
        jTextFieldTelefonoGestor = new javax.swing.JTextField();
        jLabelCuitGestor = new javax.swing.JLabel();
        jLabelPasswordGestor = new javax.swing.JLabel();
        jLabelNombreGestor = new javax.swing.JLabel();
        jLabelTelefonoGestor = new javax.swing.JLabel();
        jButtonAgregarGestor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPasswordGestor = new javax.swing.JPasswordField();
        jPanelAgregarProducto = new javax.swing.JPanel();
        jLabelNombreProd = new javax.swing.JLabel();
        jLabelCategoriaProd = new javax.swing.JLabel();
        jLabelDescripcionProd = new javax.swing.JLabel();
        jLabelPrecioProd = new javax.swing.JLabel();
        jLabelStockProd = new javax.swing.JLabel();
        jTextFieldDescripcionProd = new javax.swing.JTextField();
        jTextFieldPrecioProd = new javax.swing.JTextField();
        jTextFieldStockProd = new javax.swing.JTextField();
        jButtonAgregarProducto = new javax.swing.JButton();
        jTextFieldCodigoProd = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListCategoria = new javax.swing.JList<>();
        jLabelNombreProd5 = new javax.swing.JLabel();
        jTextFieldNombreProd = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabelPrecioProd2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelDescripcionProd1 = new javax.swing.JLabel();
        jTextFieldNombreCateg = new javax.swing.JTextField();
        jTextFieldDescripcionCateg = new javax.swing.JTextField();
        jLabelNombreProd1 = new javax.swing.JLabel();
        jButtonAgregarCateg = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanelModificar = new javax.swing.JPanel();
        jTabbedPaneMod = new javax.swing.JTabbedPane();
        jPanelEditUser = new javax.swing.JPanel();
        jTextFieldEditDireccionUsuario = new javax.swing.JTextField();
        jButtonEditarUsuario = new javax.swing.JButton();
        jLabelNombreCliente1 = new javax.swing.JLabel();
        jLabelTelefonoCliente1 = new javax.swing.JLabel();
        jLabelDireccionCliente1 = new javax.swing.JLabel();
        jLabelLocalidadCliente1 = new javax.swing.JLabel();
        jTextFieldEditLocalidadUsuario = new javax.swing.JTextField();
        jTextFieldEditTelefonoUsuario = new javax.swing.JTextField();
        jTextFieldEditNombreUsuario = new javax.swing.JTextField();
        jButtonEliminarUsuario = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListClientesEdit = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jPanelEditGestor = new javax.swing.JPanel();
        jButtonEditarGestor = new javax.swing.JButton();
        jLabelNombreCliente2 = new javax.swing.JLabel();
        jLabelTelefonoCliente2 = new javax.swing.JLabel();
        jTextFieldEditTelefonoGestor = new javax.swing.JTextField();
        jTextFieldEditNombreGestor = new javax.swing.JTextField();
        jButtonEliminarGestor = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListGestoresEdit = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        jPanelEditarProd = new javax.swing.JPanel();
        jTextFieldNombreProdEdit = new javax.swing.JTextField();
        jLabelNombreProd2 = new javax.swing.JLabel();
        jLabelCategoriaProd1 = new javax.swing.JLabel();
        jLabelDescripcionProd2 = new javax.swing.JLabel();
        jLabelPrecioProd1 = new javax.swing.JLabel();
        jLabelStockProd1 = new javax.swing.JLabel();
        jTextFieldDescripcionProdEdit = new javax.swing.JTextField();
        jTextFieldPrecioProdEdit = new javax.swing.JTextField();
        jTextFieldStockProdEdit = new javax.swing.JTextField();
        jButtonEliminarProd = new javax.swing.JButton();
        jButtonEditarProd = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListProductosEdit = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        jListCategoriaEditProd = new javax.swing.JList<>();
        jLabel20 = new javax.swing.JLabel();
        jPanelEditarCateg2 = new javax.swing.JPanel();
        jLabelDescripcionProd3 = new javax.swing.JLabel();
        jTextFieldNombreCategEdit = new javax.swing.JTextField();
        jTextFieldDescripcionCategEdit = new javax.swing.JTextField();
        jLabelNombreProd3 = new javax.swing.JLabel();
        jButtonEditarCateg = new javax.swing.JButton();
        jButtonEliminarCateg = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jListCategoriaEdit = new javax.swing.JList<>();
        jLabel21 = new javax.swing.JLabel();
        jPanelActualizarPedido = new javax.swing.JPanel();
        jLabelNombreProd4 = new javax.swing.JLabel();
        jButtonEditarPedido = new javax.swing.JButton();
        jComboBoxPedidoEstado = new javax.swing.JComboBox<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jListPedidosEdit = new javax.swing.JList<>();
        jButtonEliminarPedido = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jPanelCambiarMoneda = new javax.swing.JPanel();
        jButtonEditarMoneda = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jRadioButtonPeso = new javax.swing.JRadioButton();
        JRadioButtonDolar = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldValorDolar = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPanelMostrar = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelUsr = new javax.swing.JPanel();
        jTextAreaUsuarios = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jPanelProd = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaProd = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jListCategoriaFiltrar = new javax.swing.JList<>();
        jLabel25 = new javax.swing.JLabel();
        jPanelUsr2 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jListClienteFiltrar = new javax.swing.JList<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextAreaPedidos = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setBackground(new java.awt.Color(255, 153, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(38, 70, 83));
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setToolTipText("Admin");
        jScrollPane3.setPreferredSize(new java.awt.Dimension(992, 638));

        jTabbedPaneTodo.setBackground(new java.awt.Color(38, 70, 83));
        jTabbedPaneTodo.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPaneTodo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTabbedPaneTodo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneTodoStateChanged(evt);
            }
        });

        jPanelAgregar.setBackground(new java.awt.Color(38, 70, 83));
        jPanelAgregar.setPreferredSize(new java.awt.Dimension(0, 0));

        jTabbedPaneAgregar.setBackground(new java.awt.Color(38, 70, 83));
        jTabbedPaneAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPaneAgregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTabbedPaneAgregar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneAgregarStateChanged(evt);
            }
        });

        jPanelAgregarCliente.setBackground(new java.awt.Color(42, 157, 143));

        jLabelCuitCliente.setBackground(new java.awt.Color(0, 153, 153));
        jLabelCuitCliente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelCuitCliente.setForeground(new java.awt.Color(38, 70, 83));
        jLabelCuitCliente.setText("CUIT");

        jLabelPasswordCliente.setBackground(new java.awt.Color(0, 153, 153));
        jLabelPasswordCliente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelPasswordCliente.setForeground(new java.awt.Color(38, 70, 83));
        jLabelPasswordCliente.setText("PASSWORD");

        jLabelNombreCliente.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombreCliente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelNombreCliente.setForeground(new java.awt.Color(38, 70, 83));
        jLabelNombreCliente.setText("NOMBRE");

        jLabelTelefonoCliente.setBackground(new java.awt.Color(0, 153, 153));
        jLabelTelefonoCliente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelTelefonoCliente.setForeground(new java.awt.Color(38, 70, 83));
        jLabelTelefonoCliente.setText("TELEFONO");

        jLabelDireccionCliente.setBackground(new java.awt.Color(0, 153, 153));
        jLabelDireccionCliente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelDireccionCliente.setForeground(new java.awt.Color(38, 70, 83));
        jLabelDireccionCliente.setText("DIRECCION");

        jLabelLocalidadCliente.setBackground(new java.awt.Color(0, 153, 153));
        jLabelLocalidadCliente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelLocalidadCliente.setForeground(new java.awt.Color(38, 70, 83));
        jLabelLocalidadCliente.setText("LOCALIDAD");

        jTextFieldCuitCliente.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldCuitCliente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldCuitCliente.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldCuitCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCuitClienteActionPerformed(evt);
            }
        });

        jTextFieldLocalidadCliente.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldLocalidadCliente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldLocalidadCliente.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldLocalidadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLocalidadClienteActionPerformed(evt);
            }
        });

        jTextFieldTelefonoCliente.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldTelefonoCliente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldTelefonoCliente.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoClienteActionPerformed(evt);
            }
        });

        jTextFieldNombreCliente.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldNombreCliente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldNombreCliente.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreClienteActionPerformed(evt);
            }
        });

        jTextFieldDireccionCliente.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldDireccionCliente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldDireccionCliente.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionClienteActionPerformed(evt);
            }
        });

        jButtonAgregarCliente.setBackground(new java.awt.Color(231, 111, 81));
        jButtonAgregarCliente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonAgregarCliente.setForeground(new java.awt.Color(38, 70, 83));
        jButtonAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        jButtonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 111, 81));
        jLabel1.setText("Agregar cliente");

        jTextFieldPasswordCliente.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldPasswordCliente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldPasswordCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAgregarClienteLayout = new javax.swing.GroupLayout(jPanelAgregarCliente);
        jPanelAgregarCliente.setLayout(jPanelAgregarClienteLayout);
        jPanelAgregarClienteLayout.setHorizontalGroup(
            jPanelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(344, 344, 344))
            .addGroup(jPanelAgregarClienteLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(jPanelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAgregarClienteLayout.createSequentialGroup()
                        .addGroup(jPanelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLocalidadCliente)
                            .addComponent(jLabelCuitCliente)
                            .addComponent(jLabelPasswordCliente)
                            .addComponent(jLabelNombreCliente)
                            .addComponent(jLabelTelefonoCliente)
                            .addComponent(jLabelDireccionCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCuitCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLocalidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefonoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDireccionCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPasswordCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAgregarClienteLayout.setVerticalGroup(
            jPanelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarClienteLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAgregarClienteLayout.createSequentialGroup()
                        .addGroup(jPanelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCuitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCuitCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPasswordCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPasswordCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombreCliente))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefonoCliente))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDireccionCliente))
                        .addGap(12, 12, 12)
                        .addComponent(jTextFieldLocalidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarClienteLayout.createSequentialGroup()
                        .addComponent(jLabelLocalidadCliente)
                        .addGap(31, 31, 31)))
                .addComponent(jButtonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneAgregar.addTab("Cliente", jPanelAgregarCliente);

        jPanelAgregarGestor.setBackground(new java.awt.Color(42, 157, 143));
        jPanelAgregarGestor.setForeground(new java.awt.Color(255, 255, 255));

        jTextFieldNombreGestor.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldNombreGestor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldNombreGestor.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldNombreGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreGestorActionPerformed(evt);
            }
        });

        jTextFieldCuitGestor.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldCuitGestor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldCuitGestor.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldCuitGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCuitGestorActionPerformed(evt);
            }
        });

        jTextFieldTelefonoGestor.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldTelefonoGestor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldTelefonoGestor.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldTelefonoGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoGestorActionPerformed(evt);
            }
        });

        jLabelCuitGestor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelCuitGestor.setForeground(new java.awt.Color(38, 70, 83));
        jLabelCuitGestor.setText("CUIL");

        jLabelPasswordGestor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelPasswordGestor.setForeground(new java.awt.Color(38, 70, 83));
        jLabelPasswordGestor.setText("PASSWORD");

        jLabelNombreGestor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelNombreGestor.setForeground(new java.awt.Color(38, 70, 83));
        jLabelNombreGestor.setText("NOMBRE");

        jLabelTelefonoGestor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelTelefonoGestor.setForeground(new java.awt.Color(38, 70, 83));
        jLabelTelefonoGestor.setText("TELEFONO");

        jButtonAgregarGestor.setBackground(new java.awt.Color(231, 111, 81));
        jButtonAgregarGestor.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonAgregarGestor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregarGestor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        jButtonAgregarGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarGestorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 111, 81));
        jLabel4.setText("Agregar gestor");

        jTextFieldPasswordGestor.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldPasswordGestor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldPasswordGestor.setForeground(new java.awt.Color(38, 70, 83));

        javax.swing.GroupLayout jPanelAgregarGestorLayout = new javax.swing.GroupLayout(jPanelAgregarGestor);
        jPanelAgregarGestor.setLayout(jPanelAgregarGestorLayout);
        jPanelAgregarGestorLayout.setHorizontalGroup(
            jPanelAgregarGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarGestorLayout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addGroup(jPanelAgregarGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCuitGestor)
                    .addComponent(jLabelPasswordGestor)
                    .addComponent(jLabelNombreGestor)
                    .addComponent(jLabelTelefonoGestor))
                .addGap(12, 12, 12)
                .addGroup(jPanelAgregarGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPasswordGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombreGestor, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jTextFieldTelefonoGestor, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jTextFieldCuitGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarGestorLayout.createSequentialGroup()
                .addGap(174, 376, Short.MAX_VALUE)
                .addGroup(jPanelAgregarGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarGestorLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(349, 349, 349))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarGestorLayout.createSequentialGroup()
                        .addComponent(jButtonAgregarGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(458, 458, 458))))
        );

        jPanelAgregarGestorLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldCuitGestor, jTextFieldNombreGestor, jTextFieldTelefonoGestor});

        jPanelAgregarGestorLayout.setVerticalGroup(
            jPanelAgregarGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarGestorLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addGap(82, 82, 82)
                .addGroup(jPanelAgregarGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCuitGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuitGestor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAgregarGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPasswordGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPasswordGestor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAgregarGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreGestor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAgregarGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefonoGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefonoGestor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jButtonAgregarGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanelAgregarGestorLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldCuitGestor, jTextFieldNombreGestor, jTextFieldTelefonoGestor});

        jTextFieldNombreGestor.getAccessibleContext().setAccessibleName("");
        jTextFieldCuitGestor.getAccessibleContext().setAccessibleName("");
        jTextFieldTelefonoGestor.getAccessibleContext().setAccessibleName("");

        jTabbedPaneAgregar.addTab("Gestor", jPanelAgregarGestor);

        jPanelAgregarProducto.setBackground(new java.awt.Color(42, 157, 143));

        jLabelNombreProd.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombreProd.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelNombreProd.setForeground(new java.awt.Color(38, 70, 83));
        jLabelNombreProd.setText("CODIGO");

        jLabelCategoriaProd.setBackground(new java.awt.Color(0, 153, 153));
        jLabelCategoriaProd.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelCategoriaProd.setForeground(new java.awt.Color(38, 70, 83));
        jLabelCategoriaProd.setText("CATEGORIA");

        jLabelDescripcionProd.setBackground(new java.awt.Color(0, 153, 153));
        jLabelDescripcionProd.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelDescripcionProd.setForeground(new java.awt.Color(38, 70, 83));
        jLabelDescripcionProd.setText("DESCRIPCION");

        jLabelPrecioProd.setBackground(new java.awt.Color(0, 153, 153));
        jLabelPrecioProd.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelPrecioProd.setForeground(new java.awt.Color(38, 70, 83));
        jLabelPrecioProd.setText("PRECIO");

        jLabelStockProd.setBackground(new java.awt.Color(0, 153, 153));
        jLabelStockProd.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelStockProd.setForeground(new java.awt.Color(38, 70, 83));
        jLabelStockProd.setText("STOCK");

        jTextFieldDescripcionProd.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldDescripcionProd.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldDescripcionProd.setForeground(new java.awt.Color(38, 70, 83));

        jTextFieldPrecioProd.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldPrecioProd.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldPrecioProd.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldPrecioProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioProdActionPerformed(evt);
            }
        });

        jTextFieldStockProd.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldStockProd.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldStockProd.setForeground(new java.awt.Color(38, 70, 83));

        jButtonAgregarProducto.setBackground(new java.awt.Color(231, 111, 81));
        jButtonAgregarProducto.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        jButtonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarProductoActionPerformed(evt);
            }
        });

        jTextFieldCodigoProd.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldCodigoProd.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldCodigoProd.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldCodigoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoProdActionPerformed(evt);
            }
        });

        jListCategoria.setBackground(new java.awt.Color(233, 196, 106));
        jListCategoria.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jListCategoria.setForeground(new java.awt.Color(38, 70, 83));
        jListCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jListCategoria.setSelectionBackground(new java.awt.Color(231, 111, 81));
        jListCategoria.setSelectionForeground(new java.awt.Color(233, 196, 106));
        jListCategoria.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListCategoriaValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jListCategoria);

        jLabelNombreProd5.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombreProd5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelNombreProd5.setForeground(new java.awt.Color(38, 70, 83));
        jLabelNombreProd5.setText("NOMBRE");

        jTextFieldNombreProd.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldNombreProd.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldNombreProd.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldNombreProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreProdActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(231, 111, 81));
        jLabel17.setText("Agregar producto");

        jLabelPrecioProd2.setBackground(new java.awt.Color(0, 153, 153));
        jLabelPrecioProd2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelPrecioProd2.setForeground(new java.awt.Color(38, 70, 83));
        jLabelPrecioProd2.setText("(En dolares)");

        javax.swing.GroupLayout jPanelAgregarProductoLayout = new javax.swing.GroupLayout(jPanelAgregarProducto);
        jPanelAgregarProducto.setLayout(jPanelAgregarProductoLayout);
        jPanelAgregarProductoLayout.setHorizontalGroup(
            jPanelAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(455, 455, 455))
            .addGroup(jPanelAgregarProductoLayout.createSequentialGroup()
                .addGroup(jPanelAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAgregarProductoLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(jPanelAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreProd)
                            .addComponent(jLabelCategoriaProd)
                            .addComponent(jLabelDescripcionProd, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombreProd5)
                            .addComponent(jLabelStockProd)
                            .addGroup(jPanelAgregarProductoLayout.createSequentialGroup()
                                .addComponent(jLabelPrecioProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelPrecioProd2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldCodigoProd, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDescripcionProd, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addComponent(jTextFieldPrecioProd, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(jTextFieldStockProd, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
                    .addGroup(jPanelAgregarProductoLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel17)))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jPanelAgregarProductoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane4, jTextFieldCodigoProd, jTextFieldDescripcionProd, jTextFieldPrecioProd, jTextFieldStockProd});

        jPanelAgregarProductoLayout.setVerticalGroup(
            jPanelAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarProductoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreProd5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescripcionProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescripcionProd))
                .addGroup(jPanelAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAgregarProductoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabelCategoriaProd))
                    .addGroup(jPanelAgregarProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecioProd)
                    .addComponent(jLabelPrecioProd2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStockProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStockProd))
                .addGap(20, 20, 20)
                .addComponent(jButtonAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanelAgregarProductoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldCodigoProd, jTextFieldDescripcionProd, jTextFieldPrecioProd, jTextFieldStockProd});

        jTabbedPaneAgregar.addTab("Producto", jPanelAgregarProducto);

        jPanel1.setBackground(new java.awt.Color(42, 157, 143));

        jLabelDescripcionProd1.setBackground(new java.awt.Color(0, 153, 153));
        jLabelDescripcionProd1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelDescripcionProd1.setForeground(new java.awt.Color(38, 70, 83));
        jLabelDescripcionProd1.setText("DESCRIPCION");

        jTextFieldNombreCateg.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldNombreCateg.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldNombreCateg.setForeground(new java.awt.Color(38, 70, 83));

        jTextFieldDescripcionCateg.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldDescripcionCateg.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldDescripcionCateg.setForeground(new java.awt.Color(38, 70, 83));

        jLabelNombreProd1.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombreProd1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelNombreProd1.setForeground(new java.awt.Color(38, 70, 83));
        jLabelNombreProd1.setText("NOMBRE");

        jButtonAgregarCateg.setBackground(new java.awt.Color(231, 111, 81));
        jButtonAgregarCateg.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonAgregarCateg.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregarCateg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        jButtonAgregarCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarCategActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(231, 111, 81));
        jLabel18.setText("Agregar categoría");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAgregarCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(459, 459, 459))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(310, 310, 310))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescripcionProd1)
                    .addComponent(jLabelNombreProd1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombreCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDescripcionCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreProd1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescripcionProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDescripcionCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154)
                .addComponent(jButtonAgregarCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jTabbedPaneAgregar.addTab("Categoria", jPanel1);

        javax.swing.GroupLayout jPanelAgregarLayout = new javax.swing.GroupLayout(jPanelAgregar);
        jPanelAgregar.setLayout(jPanelAgregarLayout);
        jPanelAgregarLayout.setHorizontalGroup(
            jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarLayout.createSequentialGroup()
                .addComponent(jTabbedPaneAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanelAgregarLayout.setVerticalGroup(
            jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarLayout.createSequentialGroup()
                .addComponent(jTabbedPaneAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jTabbedPaneTodo.addTab("", new javax.swing.ImageIcon(getClass().getResource("/images/agregar.png")), jPanelAgregar, "AGREGAR"); // NOI18N

        jPanelModificar.setBackground(new java.awt.Color(38, 70, 83));

        jTabbedPaneMod.setBackground(new java.awt.Color(38, 70, 83));
        jTabbedPaneMod.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPaneMod.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTabbedPaneMod.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneModStateChanged(evt);
            }
        });

        jPanelEditUser.setBackground(new java.awt.Color(42, 157, 143));

        jTextFieldEditDireccionUsuario.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldEditDireccionUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldEditDireccionUsuario.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldEditDireccionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditDireccionUsuarioActionPerformed(evt);
            }
        });

        jButtonEditarUsuario.setBackground(new java.awt.Color(231, 111, 81));
        jButtonEditarUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonEditarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        jButtonEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarUsuarioActionPerformed(evt);
            }
        });

        jLabelNombreCliente1.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombreCliente1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelNombreCliente1.setForeground(new java.awt.Color(38, 70, 83));
        jLabelNombreCliente1.setText("NOMBRE");

        jLabelTelefonoCliente1.setBackground(new java.awt.Color(0, 153, 153));
        jLabelTelefonoCliente1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelTelefonoCliente1.setForeground(new java.awt.Color(38, 70, 83));
        jLabelTelefonoCliente1.setText("TELEFONO");

        jLabelDireccionCliente1.setBackground(new java.awt.Color(0, 153, 153));
        jLabelDireccionCliente1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelDireccionCliente1.setForeground(new java.awt.Color(38, 70, 83));
        jLabelDireccionCliente1.setText("DIRECCION");

        jLabelLocalidadCliente1.setBackground(new java.awt.Color(0, 153, 153));
        jLabelLocalidadCliente1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelLocalidadCliente1.setForeground(new java.awt.Color(38, 70, 83));
        jLabelLocalidadCliente1.setText("LOCALIDAD");

        jTextFieldEditLocalidadUsuario.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldEditLocalidadUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldEditLocalidadUsuario.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldEditLocalidadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditLocalidadUsuarioActionPerformed(evt);
            }
        });

        jTextFieldEditTelefonoUsuario.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldEditTelefonoUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldEditTelefonoUsuario.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldEditTelefonoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditTelefonoUsuarioActionPerformed(evt);
            }
        });

        jTextFieldEditNombreUsuario.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldEditNombreUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldEditNombreUsuario.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldEditNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditNombreUsuarioActionPerformed(evt);
            }
        });

        jButtonEliminarUsuario.setBackground(new java.awt.Color(231, 111, 81));
        jButtonEliminarUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButtonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarUsuarioActionPerformed(evt);
            }
        });

        jListClientesEdit.setBackground(new java.awt.Color(233, 196, 106));
        jListClientesEdit.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jListClientesEdit.setForeground(new java.awt.Color(38, 70, 83));
        jListClientesEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jListClientesEdit.setSelectionBackground(new java.awt.Color(231, 111, 81));
        jListClientesEdit.setSelectionForeground(new java.awt.Color(233, 196, 106));
        jListClientesEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListClientesEditMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jListClientesEdit);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(231, 111, 81));
        jLabel5.setText("Editar cliente");

        javax.swing.GroupLayout jPanelEditUserLayout = new javax.swing.GroupLayout(jPanelEditUser);
        jPanelEditUser.setLayout(jPanelEditUserLayout);
        jPanelEditUserLayout.setHorizontalGroup(
            jPanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditUserLayout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelEditUserLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditUserLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelLocalidadCliente1)
                            .addGroup(jPanelEditUserLayout.createSequentialGroup()
                                .addGroup(jPanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombreCliente1)
                                    .addComponent(jLabelTelefonoCliente1))
                                .addGap(12, 12, 12))
                            .addComponent(jLabelDireccionCliente1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEditNombreUsuario)
                            .addComponent(jTextFieldEditTelefonoUsuario)
                            .addComponent(jTextFieldEditDireccionUsuario)
                            .addComponent(jTextFieldEditLocalidadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(jPanelEditUserLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))))
        );
        jPanelEditUserLayout.setVerticalGroup(
            jPanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditUserLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addGroup(jPanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditUserLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEditNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombreCliente1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEditTelefonoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefonoCliente1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEditDireccionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDireccionCliente1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEditLocalidadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLocalidadCliente1))
                        .addGap(42, 42, 42)
                        .addGroup(jPanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditUserLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPaneMod.addTab("Editar cliente", jPanelEditUser);

        jPanelEditGestor.setBackground(new java.awt.Color(42, 157, 143));

        jButtonEditarGestor.setBackground(new java.awt.Color(231, 111, 81));
        jButtonEditarGestor.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonEditarGestor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarGestor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        jButtonEditarGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarGestorActionPerformed(evt);
            }
        });

        jLabelNombreCliente2.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombreCliente2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelNombreCliente2.setForeground(new java.awt.Color(38, 70, 83));
        jLabelNombreCliente2.setText("NOMBRE");

        jLabelTelefonoCliente2.setBackground(new java.awt.Color(0, 153, 153));
        jLabelTelefonoCliente2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelTelefonoCliente2.setForeground(new java.awt.Color(38, 70, 83));
        jLabelTelefonoCliente2.setText("TELEFONO");

        jTextFieldEditTelefonoGestor.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldEditTelefonoGestor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldEditTelefonoGestor.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldEditTelefonoGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditTelefonoGestorActionPerformed(evt);
            }
        });

        jTextFieldEditNombreGestor.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldEditNombreGestor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldEditNombreGestor.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldEditNombreGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditNombreGestorActionPerformed(evt);
            }
        });

        jButtonEliminarGestor.setBackground(new java.awt.Color(231, 111, 81));
        jButtonEliminarGestor.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonEliminarGestor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarGestor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButtonEliminarGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarGestorActionPerformed(evt);
            }
        });

        jListGestoresEdit.setBackground(new java.awt.Color(233, 196, 106));
        jListGestoresEdit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jListGestoresEdit.setForeground(new java.awt.Color(38, 70, 83));
        jListGestoresEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jListGestoresEdit.setSelectionBackground(new java.awt.Color(231, 111, 81));
        jListGestoresEdit.setSelectionForeground(new java.awt.Color(233, 196, 106));
        jListGestoresEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListGestoresEditMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jListGestoresEdit);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(231, 111, 81));
        jLabel19.setText("Editar gestor");

        javax.swing.GroupLayout jPanelEditGestorLayout = new javax.swing.GroupLayout(jPanelEditGestor);
        jPanelEditGestor.setLayout(jPanelEditGestorLayout);
        jPanelEditGestorLayout.setHorizontalGroup(
            jPanelEditGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditGestorLayout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelEditGestorLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelEditGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditGestorLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanelEditGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelefonoCliente2)
                            .addComponent(jLabelNombreCliente2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEditGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEditNombreGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEditTelefonoGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditGestorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditarGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminarGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237))))
        );
        jPanelEditGestorLayout.setVerticalGroup(
            jPanelEditGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditGestorLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel19)
                .addGroup(jPanelEditGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelEditGestorLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanelEditGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEditNombreGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombreCliente2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEditGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEditTelefonoGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefonoCliente2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelEditGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEditarGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminarGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEditGestorLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPaneMod.addTab("Editar gestor", jPanelEditGestor);

        jPanelEditarProd.setBackground(new java.awt.Color(42, 157, 143));

        jTextFieldNombreProdEdit.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldNombreProdEdit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldNombreProdEdit.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldNombreProdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreProdEditActionPerformed(evt);
            }
        });

        jLabelNombreProd2.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombreProd2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelNombreProd2.setForeground(new java.awt.Color(38, 70, 83));
        jLabelNombreProd2.setText("NOMBRE");

        jLabelCategoriaProd1.setBackground(new java.awt.Color(0, 153, 153));
        jLabelCategoriaProd1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelCategoriaProd1.setForeground(new java.awt.Color(38, 70, 83));
        jLabelCategoriaProd1.setText("CATEGORIA");

        jLabelDescripcionProd2.setBackground(new java.awt.Color(0, 153, 153));
        jLabelDescripcionProd2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelDescripcionProd2.setForeground(new java.awt.Color(38, 70, 83));
        jLabelDescripcionProd2.setText("DESCRIPCION");

        jLabelPrecioProd1.setBackground(new java.awt.Color(0, 153, 153));
        jLabelPrecioProd1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelPrecioProd1.setForeground(new java.awt.Color(38, 70, 83));
        jLabelPrecioProd1.setText("PRECIO");

        jLabelStockProd1.setBackground(new java.awt.Color(0, 153, 153));
        jLabelStockProd1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelStockProd1.setForeground(new java.awt.Color(38, 70, 83));
        jLabelStockProd1.setText("STOCK");

        jTextFieldDescripcionProdEdit.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldDescripcionProdEdit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldDescripcionProdEdit.setForeground(new java.awt.Color(38, 70, 83));

        jTextFieldPrecioProdEdit.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldPrecioProdEdit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldPrecioProdEdit.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldPrecioProdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioProdEditActionPerformed(evt);
            }
        });

        jTextFieldStockProdEdit.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldStockProdEdit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldStockProdEdit.setForeground(new java.awt.Color(38, 70, 83));

        jButtonEliminarProd.setBackground(new java.awt.Color(231, 111, 81));
        jButtonEliminarProd.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonEliminarProd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButtonEliminarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarProdActionPerformed(evt);
            }
        });

        jButtonEditarProd.setBackground(new java.awt.Color(231, 111, 81));
        jButtonEditarProd.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonEditarProd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        jButtonEditarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarProdActionPerformed(evt);
            }
        });

        jListProductosEdit.setBackground(new java.awt.Color(233, 196, 106));
        jListProductosEdit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jListProductosEdit.setForeground(new java.awt.Color(38, 70, 83));
        jListProductosEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jListProductosEdit.setSelectionBackground(new java.awt.Color(231, 111, 81));
        jListProductosEdit.setSelectionForeground(new java.awt.Color(233, 196, 106));
        jListProductosEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProductosEditMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jListProductosEdit);

        jListCategoriaEditProd.setBackground(new java.awt.Color(233, 196, 106));
        jListCategoriaEditProd.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jListCategoriaEditProd.setForeground(new java.awt.Color(38, 70, 83));
        jListCategoriaEditProd.setModel(jListCategoria.getModel());
        jListCategoriaEditProd.setSelectionBackground(new java.awt.Color(255, 153, 102));
        jScrollPane10.setViewportView(jListCategoriaEditProd);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(231, 111, 81));
        jLabel20.setText("Editar producto");

        javax.swing.GroupLayout jPanelEditarProdLayout = new javax.swing.GroupLayout(jPanelEditarProd);
        jPanelEditarProd.setLayout(jPanelEditarProdLayout);
        jPanelEditarProdLayout.setHorizontalGroup(
            jPanelEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarProdLayout.createSequentialGroup()
                .addGroup(jPanelEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditarProdLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel20))
                    .addGroup(jPanelEditarProdLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEditarProdLayout.createSequentialGroup()
                                .addGroup(jPanelEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombreProd2)
                                    .addComponent(jLabelDescripcionProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPrecioProd1)
                                    .addComponent(jLabelStockProd1)
                                    .addComponent(jLabelCategoriaProd1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jTextFieldNombreProdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDescripcionProdEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPrecioProdEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(jTextFieldStockProdEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarProdLayout.createSequentialGroup()
                                .addComponent(jButtonEditarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEliminarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(184, 184, 184)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEditarProdLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane10, jTextFieldDescripcionProdEdit, jTextFieldNombreProdEdit, jTextFieldPrecioProdEdit, jTextFieldStockProdEdit});

        jPanelEditarProdLayout.setVerticalGroup(
            jPanelEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarProdLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel20)
                .addGap(46, 46, 46)
                .addGroup(jPanelEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditarProdLayout.createSequentialGroup()
                        .addGroup(jPanelEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombreProdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombreProd2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDescripcionProdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDescripcionProd2))
                        .addGap(14, 14, 14)
                        .addGroup(jPanelEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrecioProdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrecioProd1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldStockProdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStockProd1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCategoriaProd1)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEditarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanelEditarProdLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldDescripcionProdEdit, jTextFieldNombreProdEdit, jTextFieldPrecioProdEdit, jTextFieldStockProdEdit});

        jTabbedPaneMod.addTab("Editar producto", jPanelEditarProd);

        jPanelEditarCateg2.setBackground(new java.awt.Color(42, 157, 143));

        jLabelDescripcionProd3.setBackground(new java.awt.Color(0, 153, 153));
        jLabelDescripcionProd3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelDescripcionProd3.setForeground(new java.awt.Color(38, 70, 83));
        jLabelDescripcionProd3.setText("DESCRIPCION");

        jTextFieldNombreCategEdit.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldNombreCategEdit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldNombreCategEdit.setForeground(new java.awt.Color(38, 70, 83));

        jTextFieldDescripcionCategEdit.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldDescripcionCategEdit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldDescripcionCategEdit.setForeground(new java.awt.Color(38, 70, 83));

        jLabelNombreProd3.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombreProd3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelNombreProd3.setForeground(new java.awt.Color(38, 70, 83));
        jLabelNombreProd3.setText("NOMBRE");

        jButtonEditarCateg.setBackground(new java.awt.Color(231, 111, 81));
        jButtonEditarCateg.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonEditarCateg.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarCateg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        jButtonEditarCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarCategActionPerformed(evt);
            }
        });

        jButtonEliminarCateg.setBackground(new java.awt.Color(231, 111, 81));
        jButtonEliminarCateg.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonEliminarCateg.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarCateg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButtonEliminarCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCategActionPerformed(evt);
            }
        });

        jListCategoriaEdit.setBackground(new java.awt.Color(233, 196, 106));
        jListCategoriaEdit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jListCategoriaEdit.setForeground(new java.awt.Color(38, 70, 83));
        jListCategoriaEdit.setModel(jListCategoria.getModel());
        jListCategoriaEdit.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListCategoriaEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jListCategoriaEdit.setSelectedIndex(0);
        jListCategoriaEdit.setSelectionBackground(new java.awt.Color(231, 111, 81));
        jListCategoriaEdit.setSelectionForeground(new java.awt.Color(233, 196, 106));
        jListCategoriaEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListCategoriaEditMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jListCategoriaEdit);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(231, 111, 81));
        jLabel21.setText("Editar categoría");

        javax.swing.GroupLayout jPanelEditarCateg2Layout = new javax.swing.GroupLayout(jPanelEditarCateg2);
        jPanelEditarCateg2.setLayout(jPanelEditarCateg2Layout);
        jPanelEditarCateg2Layout.setHorizontalGroup(
            jPanelEditarCateg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarCateg2Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelEditarCateg2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelEditarCateg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditarCateg2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanelEditarCateg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelDescripcionProd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNombreProd3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEditarCateg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombreCategEdit)
                            .addComponent(jTextFieldDescripcionCategEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(jPanelEditarCateg2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditarCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );
        jPanelEditarCateg2Layout.setVerticalGroup(
            jPanelEditarCateg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarCateg2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanelEditarCateg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarCateg2Layout.createSequentialGroup()
                        .addGroup(jPanelEditarCateg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombreCategEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombreProd3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEditarCateg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDescripcionCategEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDescripcionProd3))
                        .addGap(139, 139, 139)
                        .addGroup(jPanelEditarCateg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEditarCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminarCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jTabbedPaneMod.addTab("Editar categoría", jPanelEditarCateg2);

        jPanelActualizarPedido.setBackground(new java.awt.Color(42, 157, 143));

        jLabelNombreProd4.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombreProd4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelNombreProd4.setForeground(new java.awt.Color(38, 70, 83));
        jLabelNombreProd4.setText("ACTUALIZAR ESTADO DEL PEDIDO ");

        jButtonEditarPedido.setBackground(new java.awt.Color(231, 111, 81));
        jButtonEditarPedido.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonEditarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        jButtonEditarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarPedidoActionPerformed(evt);
            }
        });

        jComboBoxPedidoEstado.setBackground(new java.awt.Color(233, 196, 106));
        jComboBoxPedidoEstado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jComboBoxPedidoEstado.setForeground(new java.awt.Color(38, 70, 83));
        jComboBoxPedidoEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPedidoEstadoActionPerformed(evt);
            }
        });

        jListPedidosEdit.setBackground(new java.awt.Color(233, 196, 106));
        jListPedidosEdit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jListPedidosEdit.setForeground(new java.awt.Color(38, 70, 83));
        jListPedidosEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jListPedidosEdit.setSelectionBackground(new java.awt.Color(231, 111, 81));
        jListPedidosEdit.setSelectionForeground(new java.awt.Color(233, 196, 106));
        jListPedidosEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPedidosEditMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jListPedidosEdit);

        jButtonEliminarPedido.setBackground(new java.awt.Color(231, 111, 81));
        jButtonEliminarPedido.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonEliminarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButtonEliminarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarPedidoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(231, 111, 81));
        jLabel22.setText("Actualizar pedidos");

        javax.swing.GroupLayout jPanelActualizarPedidoLayout = new javax.swing.GroupLayout(jPanelActualizarPedido);
        jPanelActualizarPedido.setLayout(jPanelActualizarPedidoLayout);
        jPanelActualizarPedidoLayout.setHorizontalGroup(
            jPanelActualizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActualizarPedidoLayout.createSequentialGroup()
                .addGroup(jPanelActualizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelActualizarPedidoLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel22))
                    .addGroup(jPanelActualizarPedidoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelActualizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelActualizarPedidoLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabelNombreProd4))
                            .addGroup(jPanelActualizarPedidoLayout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jButtonEditarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEliminarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelActualizarPedidoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jComboBoxPedidoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelActualizarPedidoLayout.setVerticalGroup(
            jPanelActualizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelActualizarPedidoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel22)
                .addGroup(jPanelActualizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelActualizarPedidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNombreProd4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxPedidoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addGroup(jPanelActualizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEditarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(jPanelActualizarPedidoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );

        jTabbedPaneMod.addTab("Actualizar pedído", jPanelActualizarPedido);

        jPanelCambiarMoneda.setBackground(new java.awt.Color(42, 157, 143));

        jButtonEditarMoneda.setBackground(new java.awt.Color(231, 111, 81));
        jButtonEditarMoneda.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonEditarMoneda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarMoneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        jButtonEditarMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarMonedaActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(42, 157, 143));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButtonPeso.setBackground(new java.awt.Color(42, 157, 143));
        buttonGroupMoneda.add(jRadioButtonPeso);
        jRadioButtonPeso.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jRadioButtonPeso.setForeground(new java.awt.Color(38, 70, 83));
        jRadioButtonPeso.setText("PESO");
        jRadioButtonPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonPesoMouseClicked(evt);
            }
        });

        JRadioButtonDolar.setBackground(new java.awt.Color(42, 157, 143));
        buttonGroupMoneda.add(JRadioButtonDolar);
        JRadioButtonDolar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        JRadioButtonDolar.setForeground(new java.awt.Color(38, 70, 83));
        JRadioButtonDolar.setText("DOLARES");
        JRadioButtonDolar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JRadioButtonDolarMouseClicked(evt);
            }
        });
        JRadioButtonDolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioButtonDolarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jRadioButtonPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(JRadioButtonDolar)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPeso)
                    .addComponent(JRadioButtonDolar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel14.setBackground(new java.awt.Color(0, 153, 153));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(38, 70, 83));
        jLabel14.setText("VALOR DEL DOLAR:");

        jTextFieldValorDolar.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldValorDolar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldValorDolar.setForeground(new java.awt.Color(38, 70, 83));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(231, 111, 81));
        jLabel23.setText("Cambiar moneda del carrito de compras");

        javax.swing.GroupLayout jPanelCambiarMonedaLayout = new javax.swing.GroupLayout(jPanelCambiarMoneda);
        jPanelCambiarMoneda.setLayout(jPanelCambiarMonedaLayout);
        jPanelCambiarMonedaLayout.setHorizontalGroup(
            jPanelCambiarMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambiarMonedaLayout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addGroup(jPanelCambiarMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCambiarMonedaLayout.createSequentialGroup()
                        .addGroup(jPanelCambiarMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldValorDolar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(117, 117, 117)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCambiarMonedaLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(jPanelCambiarMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCambiarMonedaLayout.createSequentialGroup()
                        .addComponent(jButtonEditarMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(442, 442, 442))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCambiarMonedaLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(120, 120, 120))))
        );
        jPanelCambiarMonedaLayout.setVerticalGroup(
            jPanelCambiarMonedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCambiarMonedaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel23)
                .addGap(91, 91, 91)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldValorDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButtonEditarMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jTabbedPaneMod.addTab("Cambiar moneda", jPanelCambiarMoneda);

        javax.swing.GroupLayout jPanelModificarLayout = new javax.swing.GroupLayout(jPanelModificar);
        jPanelModificar.setLayout(jPanelModificarLayout);
        jPanelModificarLayout.setHorizontalGroup(
            jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarLayout.createSequentialGroup()
                .addComponent(jTabbedPaneMod, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelModificarLayout.setVerticalGroup(
            jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarLayout.createSequentialGroup()
                .addComponent(jTabbedPaneMod, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        jTabbedPaneTodo.addTab("", new javax.swing.ImageIcon(getClass().getResource("/images/edit.png")), jPanelModificar, "EDITAR"); // NOI18N

        jPanelMostrar.setBackground(new java.awt.Color(42, 157, 143));

        jTabbedPane1.setBackground(new java.awt.Color(38, 70, 83));
        jTabbedPane1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanelUsr.setBackground(new java.awt.Color(42, 157, 143));
        jPanelUsr.setForeground(new java.awt.Color(255, 255, 255));

        jTextAreaUsuarios.setBackground(new java.awt.Color(233, 196, 106));
        jTextAreaUsuarios.setColumns(20);
        jTextAreaUsuarios.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextAreaUsuarios.setForeground(new java.awt.Color(38, 70, 83));
        jTextAreaUsuarios.setRows(5);
        jTextAreaUsuarios.setTabSize(10);
        jTextAreaUsuarios.setCaretColor(new java.awt.Color(0, 153, 153));
        jTextAreaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextAreaUsuarios.setDisabledTextColor(new java.awt.Color(231, 111, 81));
        jTextAreaUsuarios.setEnabled(false);
        jTextAreaUsuarios.setSelectedTextColor(new java.awt.Color(233, 196, 106));
        jTextAreaUsuarios.setSelectionColor(new java.awt.Color(231, 111, 81));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(231, 111, 81));
        jLabel24.setText("Listado de usuarios");

        javax.swing.GroupLayout jPanelUsrLayout = new javax.swing.GroupLayout(jPanelUsr);
        jPanelUsr.setLayout(jPanelUsrLayout);
        jPanelUsrLayout.setHorizontalGroup(
            jPanelUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsrLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel24)
                .addContainerGap(341, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsrLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextAreaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanelUsrLayout.setVerticalGroup(
            jPanelUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsrLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel24)
                .addGap(44, 44, 44)
                .addComponent(jTextAreaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuarios", jPanelUsr);

        jPanelProd.setBackground(new java.awt.Color(42, 157, 143));
        jPanelProd.setForeground(new java.awt.Color(255, 255, 255));

        jTextAreaProd.setBackground(new java.awt.Color(233, 196, 106));
        jTextAreaProd.setColumns(20);
        jTextAreaProd.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextAreaProd.setForeground(new java.awt.Color(38, 70, 83));
        jTextAreaProd.setRows(5);
        jTextAreaProd.setCaretColor(new java.awt.Color(0, 153, 153));
        jTextAreaProd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextAreaProd.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        jTextAreaProd.setEnabled(false);
        jTextAreaProd.setSelectedTextColor(new java.awt.Color(233, 196, 106));
        jTextAreaProd.setSelectionColor(new java.awt.Color(231, 111, 81));
        jTextAreaProd.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextAreaProdInputMethodTextChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jTextAreaProd);

        jLabel15.setBackground(new java.awt.Color(38, 70, 83));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(38, 70, 83));
        jLabel15.setText("FILTRAR POR CATEGORIA");

        jListCategoriaFiltrar.setBackground(new java.awt.Color(233, 196, 106));
        jListCategoriaFiltrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jListCategoriaFiltrar.setForeground(new java.awt.Color(38, 70, 83));
        jListCategoriaFiltrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jListCategoriaFiltrar.setSelectionBackground(new java.awt.Color(231, 111, 81));
        jListCategoriaFiltrar.setSelectionForeground(new java.awt.Color(233, 196, 106));
        jListCategoriaFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListCategoriaFiltrarMouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(231, 111, 81));
        jLabel25.setText("Listado de productos");

        javax.swing.GroupLayout jPanelProdLayout = new javax.swing.GroupLayout(jPanelProd);
        jPanelProd.setLayout(jPanelProdLayout);
        jPanelProdLayout.setHorizontalGroup(
            jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanelProdLayout.createSequentialGroup()
                        .addComponent(jListCategoriaFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(jPanelProdLayout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProdLayout.setVerticalGroup(
            jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel25)
                .addGap(30, 30, 30)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                    .addComponent(jListCategoriaFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Productos", jPanelProd);

        jPanelUsr2.setBackground(new java.awt.Color(42, 157, 143));
        jPanelUsr2.setForeground(new java.awt.Color(255, 255, 255));

        jListClienteFiltrar.setBackground(new java.awt.Color(233, 196, 106));
        jListClienteFiltrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jListClienteFiltrar.setForeground(new java.awt.Color(38, 70, 83));
        jListClienteFiltrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jListClienteFiltrar.setSelectionBackground(new java.awt.Color(231, 111, 81));
        jListClienteFiltrar.setSelectionForeground(new java.awt.Color(233, 196, 106));
        jListClienteFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListClienteFiltrarMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(jListClienteFiltrar);

        jTextAreaPedidos.setBackground(new java.awt.Color(233, 196, 106));
        jTextAreaPedidos.setColumns(20);
        jTextAreaPedidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextAreaPedidos.setForeground(new java.awt.Color(38, 70, 83));
        jTextAreaPedidos.setRows(5);
        jTextAreaPedidos.setCaretColor(new java.awt.Color(0, 153, 153));
        jTextAreaPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextAreaPedidos.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        jTextAreaPedidos.setEnabled(false);
        jTextAreaPedidos.setSelectionColor(new java.awt.Color(231, 111, 81));
        jTextAreaPedidos.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextAreaPedidosInputMethodTextChanged(evt);
            }
        });
        jScrollPane13.setViewportView(jTextAreaPedidos);

        jLabel16.setBackground(new java.awt.Color(38, 70, 83));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(38, 70, 83));
        jLabel16.setText("FILTRAR POR CLIENTE");

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(231, 111, 81));
        jLabel26.setText("Listado de pedidos");

        javax.swing.GroupLayout jPanelUsr2Layout = new javax.swing.GroupLayout(jPanelUsr2);
        jPanelUsr2.setLayout(jPanelUsr2Layout);
        jPanelUsr2Layout.setHorizontalGroup(
            jPanelUsr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsr2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(318, 318, 318))
            .addGroup(jPanelUsr2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelUsr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanelUsr2Layout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanelUsr2Layout.setVerticalGroup(
            jPanelUsr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsr2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel26)
                .addGap(36, 36, 36)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUsr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane13)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pedidos", jPanelUsr2);

        javax.swing.GroupLayout jPanelMostrarLayout = new javax.swing.GroupLayout(jPanelMostrar);
        jPanelMostrar.setLayout(jPanelMostrarLayout);
        jPanelMostrarLayout.setHorizontalGroup(
            jPanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanelMostrarLayout.setVerticalGroup(
            jPanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        jTabbedPaneTodo.addTab("", new javax.swing.ImageIcon(getClass().getResource("/images/search.png")), jPanelMostrar, "listados"); // NOI18N

        jScrollPane3.setViewportView(jTabbedPaneTodo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Desea guardar los datos?", "GUARDAR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                GuardarToXML.guardar(controlador);
                JOptionPane.showMessageDialog(this, "Los datos se guardaron correctamente.", "EXITO", JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "No se pudieron exportar los datos\n" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void jTabbedPaneTodoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneTodoStateChanged

        switch (jTabbedPaneTodo.getSelectedIndex()) {
            case 1:
                jTextAreaUsuarios.setText(controlador.getListaUsuarios().usertoString());
                jTextAreaPedidos.setText(controlador.getListaPedidos().pedidotoString());
                //                jTextAreaProd.setText(controlador.getListaProductos().productotoString());

                if (controlador.getMoneda().getNombre().equals("Peso")) {
                    jRadioButtonPeso.setSelected(true);

                } else {
                    JRadioButtonDolar.setSelected(true);
                    jTextFieldValorDolar.setText(controlador.getMoneda().getValor() + "");
                }

                modeloCliente.removeAllElements();
                modeloCateg.removeAllElements();
                modeloGestor.removeAllElements();
                modeloPedido.removeAllElements();
                modeloProd.removeAllElements();
                fillListaCliente();
                fillListaGestor();
                fillListaCategoria();
                fillListaPedido();
                fillListaProducto();
                break;
            case 2:

                modeloCliente.removeAllElements();
                modeloCateg.removeAllElements();
                modeloGestor.removeAllElements();
                modeloPedido.removeAllElements();
                modeloProd.removeAllElements();
                fillListaCliente();
                fillListaGestor();
                fillListaCategoria();
                fillListaPedido();
                fillListaProducto();
                break;
            default:
                modeloCateg.removeAllElements();
                fillListaCategoria();
                break;
        }

    }//GEN-LAST:event_jTabbedPaneTodoStateChanged

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged

    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jTextAreaPedidosInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextAreaPedidosInputMethodTextChanged

    }//GEN-LAST:event_jTextAreaPedidosInputMethodTextChanged

    private void jListClienteFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListClienteFiltrarMouseClicked

        UsuarioCliente u = (UsuarioCliente) jListClienteFiltrar.getSelectedValue();

        jTextAreaPedidos.setText(controlador.getListaPedidos().pedidoPorClientetoString(u));

        // TODO add your handling code here:
    }//GEN-LAST:event_jListClienteFiltrarMouseClicked

    private void jListCategoriaFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCategoriaFiltrarMouseClicked

        Categoria c = (Categoria) jListCategoriaFiltrar.getSelectedValue();

        jTextAreaProd.setText(controlador.getListaProductos().productosPorCatestoString(c));
    }//GEN-LAST:event_jListCategoriaFiltrarMouseClicked

    private void jTextAreaProdInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextAreaProdInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaProdInputMethodTextChanged

    private void jTabbedPaneModStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneModStateChanged

        if (jTabbedPaneMod.getSelectedIndex() == 5) {

            jTextFieldValorDolar.setText("");

            if (controlador.getMoneda().getNombre().equals("Peso")) {
                jTextFieldValorDolar.setText(controlador.getMoneda().getValor() + "");
                jRadioButtonPeso.setSelected(true);
                
               jTextFieldValorDolar.setEnabled(true);
            } else {
                JRadioButtonDolar.setSelected(true);
               jTextFieldValorDolar.setEnabled(false);
            }

        }
    }//GEN-LAST:event_jTabbedPaneModStateChanged

    private void JRadioButtonDolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioButtonDolarActionPerformed


    }//GEN-LAST:event_JRadioButtonDolarActionPerformed

    private void JRadioButtonDolarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JRadioButtonDolarMouseClicked
        jTextFieldValorDolar.setEnabled(false);
        if (controlador.getMoneda().getNombre().equals("Peso")) {
            jTextFieldValorDolar.setText(controlador.getMoneda().getValor() + "");

        } else {

            jTextFieldValorDolar.setText("");
        }
    }//GEN-LAST:event_JRadioButtonDolarMouseClicked

    private void jRadioButtonPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonPesoMouseClicked
        jTextFieldValorDolar.setEnabled(true);
        if (controlador.getMoneda().getNombre().equals("Peso")) {
            jTextFieldValorDolar.setText(controlador.getMoneda().getValor() + "");

        } else {

            jTextFieldValorDolar.setText("");
        }


    }//GEN-LAST:event_jRadioButtonPesoMouseClicked

    private void jButtonEditarMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarMonedaActionPerformed

        String valor = jTextFieldValorDolar.getText();

        try {

            if (JRadioButtonDolar.isSelected()) {
                controlador.setMoneda(new Moneda("Dolar", 1));

                JOptionPane.showMessageDialog(this, "Se cambio el tipo de moneda del carrito de compras a dolares.", "Exito", JOptionPane.INFORMATION_MESSAGE);

            } else {

                if (!valor.equals("")) {

                    controlador.setMoneda(new Moneda("Peso", Double.parseDouble(valor)));
                    JOptionPane.showMessageDialog(this, "Se cambio el tipo de moneda del carrito de compras a pesos.", "Exito", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "Complete el campo con el valor del dolar actual.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese solo numeros.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButtonEditarMonedaActionPerformed

    private void jListPedidosEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPedidosEditMouseClicked

        Pedido p = jListPedidosEdit.getSelectedValue();

        jComboBoxPedidoEstado.setSelectedItem(p.getEstado());

        // TODO add your handling code here:
    }//GEN-LAST:event_jListPedidosEditMouseClicked

    private void jComboBoxPedidoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPedidoEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPedidoEstadoActionPerformed

    private void jButtonEditarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarPedidoActionPerformed

        Pedido p = (Pedido) jListPedidosEdit.getSelectedValue();

        PedidoEstado pe = (PedidoEstado) jComboBoxPedidoEstado.getSelectedItem();

        p.setEstado(pe);

        modeloPedido.removeAllElements();
        fillListaPedido();

        JOptionPane.showMessageDialog(this, "Se modificó el estado del pedido", "Exito", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButtonEditarPedidoActionPerformed

    private void jListCategoriaEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCategoriaEditMouseClicked

        Categoria c = jListCategoriaEdit.getSelectedValue();

        jTextFieldNombreCategEdit.setText(c.getNombre());
        jTextFieldDescripcionCategEdit.setText(c.getDescripcion());

        // TODO add your handling code here:
    }//GEN-LAST:event_jListCategoriaEditMouseClicked

    private void jButtonEliminarCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCategActionPerformed

        Categoria c = jListCategoriaEdit.getSelectedValue();

        if (JOptionPane.showConfirmDialog(this, "Desea eliminar la categoría " + c.getNombre() + "?", "ELIMINAR CATEGORIA", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            if (!(controlador.getListaProductos().contieneCategoria(c))) {
                controlador.getListaCategorias().borrarCategoria(c);

                modeloCateg.removeAllElements();
                fillListaCategoria();

                jTextFieldDescripcionCategEdit.setText("");
                jTextFieldNombreCategEdit.setText("");

                JOptionPane.showMessageDialog(this, "Se eliminó una categoría.", "Exito", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "No se puede eliminar la categoría, ya que hay productos en ella.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }


    }//GEN-LAST:event_jButtonEliminarCategActionPerformed

    private void jButtonEditarCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarCategActionPerformed

        Categoria c = jListCategoriaEdit.getSelectedValue();

        String nombre = jTextFieldNombreCategEdit.getText();
        String desc = jTextFieldDescripcionCategEdit.getText();

        if (!nombre.equals("") && !desc.equals("")) {

            c.setNombre(nombre);
            c.setDescripcion(desc);

            modeloCateg.removeAllElements();
            fillListaCategoria();

            JOptionPane.showMessageDialog(this, "Se edito la categoría.", "Exito.", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this, "Faltan completar campos.", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jButtonEditarCategActionPerformed

    private void jListProductosEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProductosEditMouseClicked

        Producto p = jListProductosEdit.getSelectedValue();

        jTextFieldNombreProdEdit.setText(p.getNombre());
        jTextFieldDescripcionProdEdit.setText(p.getDescripcion());
        jTextFieldPrecioProdEdit.setText(p.getPrecio() + "");
        jTextFieldStockProdEdit.setText(p.getStock() + "");
        jListCategoriaEditProd.setSelectedValue(p.getCategoria(), false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jListProductosEditMouseClicked

    private void jButtonEditarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarProdActionPerformed

        Producto p = jListProductosEdit.getSelectedValue();

        String nombre = jTextFieldNombreProdEdit.getText();
        String desc = jTextFieldDescripcionProdEdit.getText();
        String precio = jTextFieldPrecioProdEdit.getText();
        String stock = jTextFieldStockProdEdit.getText();
        Categoria cat = jListCategoriaEditProd.getSelectedValue();

        if (!nombre.equals("") && !desc.equals("") && !precio.equals("") && !stock.equals("")) {

            if ((Integer.parseInt(stock) > 0) && (Double.parseDouble(precio) > 0)) {
                p.setNombre(nombre);
                p.setDescripcion(desc);
                p.setCategoria(cat);
                p.setPrecio(Double.parseDouble(precio));
                p.setStock(Integer.parseInt(stock));

                modeloProd.removeAllElements();
                fillListaProducto();

                JOptionPane.showMessageDialog(this, "Se modificó un producto.", "Exito", JOptionPane.INFORMATION_MESSAGE);

            } else {

                JOptionPane.showMessageDialog(this, "Ingrese un número valido.", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } else {

            JOptionPane.showMessageDialog(this, "Faltan completar campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarProdActionPerformed

    private void jButtonEliminarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarProdActionPerformed

        Producto u = (Producto) jListProductosEdit.getSelectedValue();

        if (JOptionPane.showConfirmDialog(this, "Desea eliminar el producto " + u.getNombre() + "?", "ELIMINAR PRODUCTO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                controlador.getListaProductos().borrarProducto(u);

                modeloProd.removeAllElements();
                fillListaProducto();

                JOptionPane.showMessageDialog(this, "Se eliminó el producto", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            jTextFieldNombreProdEdit.setText("");
            jTextFieldDescripcionProdEdit.setText("");
            jTextFieldStockProdEdit.setText("");
            jTextFieldPrecioProdEdit.setText("");
        }


    }//GEN-LAST:event_jButtonEliminarProdActionPerformed

    private void jTextFieldPrecioProdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioProdEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioProdEditActionPerformed

    private void jTextFieldNombreProdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreProdEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreProdEditActionPerformed

    private void jListGestoresEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListGestoresEditMouseClicked

        UsuarioGestor u = jListGestoresEdit.getSelectedValue();

        jTextFieldEditNombreGestor.setText(u.getNombre());
        jTextFieldEditTelefonoGestor.setText(u.getTelefono());        // TODO add your handling code here:
    }//GEN-LAST:event_jListGestoresEditMouseClicked

    private void jButtonEliminarGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarGestorActionPerformed

        UsuarioGestor u = jListGestoresEdit.getSelectedValue();
        if (JOptionPane.showConfirmDialog(this, "Desea eliminar el gestor " + u.getNombre() + "?", "ELIMINAR GESTOR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            controlador.getListaUsuarios().borrarUsuario(u);

            modeloGestor.removeAllElements();
            fillListaGestor();

            jTextFieldEditNombreGestor.setText("");
            jTextFieldEditTelefonoGestor.setText("");

            JOptionPane.showMessageDialog(this, "Se eliminó el usuario", "Exito", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_jButtonEliminarGestorActionPerformed

    private void jTextFieldEditNombreGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditNombreGestorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditNombreGestorActionPerformed

    private void jTextFieldEditTelefonoGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditTelefonoGestorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditTelefonoGestorActionPerformed

    private void jButtonEditarGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarGestorActionPerformed

        UsuarioGestor u = jListGestoresEdit.getSelectedValue();

        String nombre = jTextFieldEditNombreGestor.getText();
        String telefono = jTextFieldEditTelefonoGestor.getText();

        if (!nombre.equals("") && !telefono.equals("")) {

            if (controlador.getListaUsuarios().nombreCorrecto(nombre)) {

                if (controlador.getListaUsuarios().esTelefono(telefono)) {

                    u.setNombre(nombre);
                    u.setTelefono(telefono);

                    JOptionPane.showMessageDialog(this, "Se modificaron los datos.", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    modeloGestor.removeAllElements();
                    fillListaGestor();
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente el telefono.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente el nombre.", "ERROR", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan completar campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarGestorActionPerformed

    private void jListClientesEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListClientesEditMouseClicked

        UsuarioCliente u = jListClientesEdit.getSelectedValue();

        jTextFieldEditNombreUsuario.setText(u.getNombre());
        jTextFieldEditDireccionUsuario.setText(u.getDireccion());
        jTextFieldEditLocalidadUsuario.setText(u.getLocalidad());
        jTextFieldEditTelefonoUsuario.setText(u.getTelefono());
    }//GEN-LAST:event_jListClientesEditMouseClicked

    private void jButtonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarUsuarioActionPerformed

        UsuarioCliente u = jListClientesEdit.getSelectedValue();
        if (JOptionPane.showConfirmDialog(this, "Desea eliminar el cliente " + u.getNombre() + "?", "ELIMINAR CLIENTE", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            controlador.getListaUsuarios().borrarUsuario(u);

            modeloCliente.removeAllElements();
            fillListaCliente();

            jTextFieldEditNombreUsuario.setText("");
            jTextFieldEditDireccionUsuario.setText("");
            jTextFieldEditLocalidadUsuario.setText("");
            jTextFieldEditTelefonoUsuario.setText("");

            JOptionPane.showMessageDialog(this, "Se eliminó el usuario", "Exito", JOptionPane.INFORMATION_MESSAGE);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarUsuarioActionPerformed

    private void jTextFieldEditNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditNombreUsuarioActionPerformed

    private void jTextFieldEditTelefonoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditTelefonoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditTelefonoUsuarioActionPerformed

    private void jTextFieldEditLocalidadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditLocalidadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditLocalidadUsuarioActionPerformed

    private void jButtonEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarUsuarioActionPerformed

        UsuarioCliente u = jListClientesEdit.getSelectedValue();

        String nombre = jTextFieldEditNombreUsuario.getText();
        String direccion = jTextFieldEditDireccionUsuario.getText();
        String localidad = jTextFieldEditLocalidadUsuario.getText();
        String telefono = jTextFieldEditTelefonoUsuario.getText();

        if (!nombre.equals("") && !direccion.equals("") && !localidad.equals("") && !telefono.equals("")) {

            if (controlador.getListaUsuarios().nombreCorrecto(nombre)) {
                if (controlador.getListaUsuarios().esTelefono(telefono)) {
                    if (controlador.getListaUsuarios().localidadCorrecta(localidad)) {
                        u.setNombre(nombre);
                        u.setDireccion(direccion);
                        u.setLocalidad(localidad);
                        u.setTelefono(telefono);

                        modeloCliente.removeAllElements();
                        fillListaCliente();
                        JOptionPane.showMessageDialog(this, "Se modifico el cliente.", "Exito.", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente la localidad.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente el telefono.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente el nombre.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan completar campos.", "Error", JOptionPane.ERROR_MESSAGE);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarUsuarioActionPerformed

    private void jTextFieldEditDireccionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditDireccionUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditDireccionUsuarioActionPerformed

    private void jTabbedPaneAgregarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneAgregarStateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPaneAgregarStateChanged

    private void jButtonAgregarCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarCategActionPerformed
        // TODO add your handling code here:

        String nombre = jTextFieldNombreCateg.getText();
        String descripcion = jTextFieldDescripcionCateg.getText();

        if (!nombre.equals("") && !descripcion.equals("")) {

            Categoria c = new Categoria(nombre, descripcion);
            try {
                controlador.getListaCategorias().agregarCategoria(c);

                jListCategoria.setModel(modeloCateg);
                modeloCateg.addElement(c);

                JOptionPane.showMessageDialog(this, "Se agrego una categoria.", "Exito.", JOptionPane.INFORMATION_MESSAGE);

                jTextFieldNombreCateg.setText("");
                jTextFieldDescripcionCateg.setText("");
            } catch (OperacionInvalidaException ex) {
                JOptionPane.showMessageDialog(this, "La categoría " + c.getNombre() + " ya existe.", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } else {
            JOptionPane.showMessageDialog(this, "Faltan completar campos.", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonAgregarCategActionPerformed

    private void jListCategoriaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListCategoriaValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListCategoriaValueChanged

    private void jTextFieldCodigoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoProdActionPerformed

    private void jButtonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarProductoActionPerformed
        // TODO add your handling code here:

        String codigo = jTextFieldCodigoProd.getText();
        String nombre = jTextFieldNombreProd.getText();
        String descripcion = jTextFieldDescripcionProd.getText();
        Categoria categoria = jListCategoria.getSelectedValue();
        String precio = jTextFieldPrecioProd.getText();
        String stock = jTextFieldStockProd.getText();

        if (!nombre.equals("") && !descripcion.equals("") && !precio.equals("") && !stock.equals("") && !(categoria == null)) {

            try {
                Integer.parseInt(stock);
                Double.parseDouble(precio);

                controlador.getListaProductos().agregarProducto(new Producto(Integer.parseInt(codigo), nombre, descripcion, categoria, Double.parseDouble(precio), Integer.parseInt(stock)));

                JOptionPane.showMessageDialog(this, "Se agrego un nuevo producto.", "Exito.", JOptionPane.INFORMATION_MESSAGE);

                jTextFieldCodigoProd.setText("");
                jTextFieldNombreProd.setText("");
                jTextFieldDescripcionProd.setText("");
                jTextFieldPrecioProd.setText("");
                jTextFieldStockProd.setText("");

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, solo ingrese numeros en el precio y stock.", "Error", JOptionPane.ERROR_MESSAGE);

            } catch (OperacionInvalidaException e) {
                JOptionPane.showMessageDialog(this, "Ya existe un producto con el codigo " + codigo, "Error", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan completar campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonAgregarProductoActionPerformed

    private void jTextFieldPrecioProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioProdActionPerformed

    private void jButtonAgregarGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarGestorActionPerformed

        String cuit = jTextFieldCuitGestor.getText();
        String password = jTextFieldPasswordGestor.getText();
        String nombre = jTextFieldNombreGestor.getText();
        String telefono = jTextFieldTelefonoGestor.getText();

        if (!cuit.equals("") && !password.equals("") && !nombre.equals("") && !telefono.equals("")) {
            if (controlador.getListaUsuarios().esCUIT(cuit)) {
                if (controlador.getListaUsuarios().nombreCorrecto(nombre)) {
                    if (controlador.getListaUsuarios().esTelefono(telefono)) {

                        try {
                            controlador.getListaUsuarios().agregarUser(new UsuarioGestor(nombre, telefono, cuit, password, "gestor"));

                            jTextFieldCuitGestor.setText("");
                            jTextFieldPasswordGestor.setText("");
                            jTextFieldNombreGestor.setText("");
                            jTextFieldTelefonoGestor.setText("");

                            JOptionPane.showMessageDialog(this, "Se agrego un gestor.", "Exito", JOptionPane.INFORMATION_MESSAGE);

                        } catch (OperacionInvalidaException ex) {
                            JOptionPane.showMessageDialog(this, "Ya existe un usuario registrado con el cuil " + cuit, "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente el telefono.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente el nombre.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente el CUIL.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Faltan completar campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarGestorActionPerformed

    private void jTextFieldTelefonoGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoGestorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoGestorActionPerformed

    private void jTextFieldCuitGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCuitGestorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCuitGestorActionPerformed

    private void jTextFieldNombreGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreGestorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreGestorActionPerformed

    private void jButtonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarClienteActionPerformed

        String cuit = jTextFieldCuitCliente.getText();
        String password = jTextFieldPasswordCliente.getText();
        String nombre = jTextFieldNombreCliente.getText();
        String telefono = jTextFieldTelefonoCliente.getText();
        String direccion = jTextFieldDireccionCliente.getText();
        String localidad = jTextFieldLocalidadCliente.getText();

        if (!cuit.equals("") && !password.equals("") && !nombre.equals("") && !telefono.equals("") && !localidad.equals("") && !direccion.equals("")) {
            if (controlador.getListaUsuarios().esCUIT(cuit)) {
                if (controlador.getListaUsuarios().nombreCorrecto(nombre)) {
                    if (controlador.getListaUsuarios().esTelefono(telefono)) {
                        if (controlador.getListaUsuarios().localidadCorrecta(localidad)) {

                            try {
                                controlador.getListaUsuarios().agregarUser(new UsuarioCliente(nombre, localidad, direccion, telefono, cuit, password, "cliente"));
                                jTextFieldCuitCliente.setText("");
                                jTextFieldPasswordCliente.setText("");
                                jTextFieldDireccionCliente.setText("");
                                jTextFieldLocalidadCliente.setText("");
                                jTextFieldNombreCliente.setText("");
                                jTextFieldTelefonoCliente.setText("");

                                JOptionPane.showMessageDialog(this, "Se agrego un cliente.", "Exito", JOptionPane.INFORMATION_MESSAGE);

                            } catch (OperacionInvalidaException ex) {
                                JOptionPane.showMessageDialog(this, "Ya existe un usuario registrado con el cuit " + cuit, "ERROR", JOptionPane.ERROR_MESSAGE);
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente la localidad.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente el telefono.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente el nombre.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente el CUIT.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Faltan completar campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarClienteActionPerformed

    private void jTextFieldDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionClienteActionPerformed

    private void jTextFieldNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreClienteActionPerformed

    private void jTextFieldTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoClienteActionPerformed

    private void jTextFieldLocalidadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLocalidadClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLocalidadClienteActionPerformed

    private void jTextFieldCuitClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCuitClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCuitClienteActionPerformed

    private void jTextFieldNombreProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreProdActionPerformed

    private void jButtonEliminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarPedidoActionPerformed

        Pedido p = jListPedidosEdit.getSelectedValue();
        if (JOptionPane.showConfirmDialog(this, "Desea eliminar el pedido No. " + p.getIdPedido() + "?", "ELIMINAR PEDIDO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            controlador.getListaPedidos().eliminarPedido(p);
            modeloPedido.removeAllElements();
            fillListaPedido();

            JOptionPane.showMessageDialog(this, "Se elimino un pedido.", "Exito.", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_jButtonEliminarPedidoActionPerformed

    private void jTextFieldPasswordClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordClienteActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazLoginAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazLoginAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazLoginAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazLoginAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazLoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton JRadioButtonDolar;
    private javax.swing.ButtonGroup buttonGroupMoneda;
    private javax.swing.JButton jButtonAgregarCateg;
    private javax.swing.JButton jButtonAgregarCliente;
    private javax.swing.JButton jButtonAgregarGestor;
    private javax.swing.JButton jButtonAgregarProducto;
    private javax.swing.JButton jButtonEditarCateg;
    private javax.swing.JButton jButtonEditarGestor;
    private javax.swing.JButton jButtonEditarMoneda;
    private javax.swing.JButton jButtonEditarPedido;
    private javax.swing.JButton jButtonEditarProd;
    private javax.swing.JButton jButtonEditarUsuario;
    private javax.swing.JButton jButtonEliminarCateg;
    private javax.swing.JButton jButtonEliminarGestor;
    private javax.swing.JButton jButtonEliminarPedido;
    private javax.swing.JButton jButtonEliminarProd;
    private javax.swing.JButton jButtonEliminarUsuario;
    private javax.swing.JComboBox<PedidoEstado> jComboBoxPedidoEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCategoriaProd;
    private javax.swing.JLabel jLabelCategoriaProd1;
    private javax.swing.JLabel jLabelCuitCliente;
    private javax.swing.JLabel jLabelCuitGestor;
    private javax.swing.JLabel jLabelDescripcionProd;
    private javax.swing.JLabel jLabelDescripcionProd1;
    private javax.swing.JLabel jLabelDescripcionProd2;
    private javax.swing.JLabel jLabelDescripcionProd3;
    private javax.swing.JLabel jLabelDireccionCliente;
    private javax.swing.JLabel jLabelDireccionCliente1;
    private javax.swing.JLabel jLabelLocalidadCliente;
    private javax.swing.JLabel jLabelLocalidadCliente1;
    private javax.swing.JLabel jLabelNombreCliente;
    private javax.swing.JLabel jLabelNombreCliente1;
    private javax.swing.JLabel jLabelNombreCliente2;
    private javax.swing.JLabel jLabelNombreGestor;
    private javax.swing.JLabel jLabelNombreProd;
    private javax.swing.JLabel jLabelNombreProd1;
    private javax.swing.JLabel jLabelNombreProd2;
    private javax.swing.JLabel jLabelNombreProd3;
    private javax.swing.JLabel jLabelNombreProd4;
    private javax.swing.JLabel jLabelNombreProd5;
    private javax.swing.JLabel jLabelPasswordCliente;
    private javax.swing.JLabel jLabelPasswordGestor;
    private javax.swing.JLabel jLabelPrecioProd;
    private javax.swing.JLabel jLabelPrecioProd1;
    private javax.swing.JLabel jLabelPrecioProd2;
    private javax.swing.JLabel jLabelStockProd;
    private javax.swing.JLabel jLabelStockProd1;
    private javax.swing.JLabel jLabelTelefonoCliente;
    private javax.swing.JLabel jLabelTelefonoCliente1;
    private javax.swing.JLabel jLabelTelefonoCliente2;
    private javax.swing.JLabel jLabelTelefonoGestor;
    private javax.swing.JList<Categoria> jListCategoria;
    private javax.swing.JList<Categoria> jListCategoriaEdit;
    private javax.swing.JList<Categoria> jListCategoriaEditProd;
    private javax.swing.JList<Categoria> jListCategoriaFiltrar;
    private javax.swing.JList<UsuarioCliente> jListClienteFiltrar;
    private javax.swing.JList<UsuarioCliente> jListClientesEdit;
    private javax.swing.JList<UsuarioGestor> jListGestoresEdit;
    private javax.swing.JList<Pedido> jListPedidosEdit;
    private javax.swing.JList<Producto> jListProductosEdit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanelActualizarPedido;
    private javax.swing.JPanel jPanelAgregar;
    private javax.swing.JPanel jPanelAgregarCliente;
    private javax.swing.JPanel jPanelAgregarGestor;
    private javax.swing.JPanel jPanelAgregarProducto;
    private javax.swing.JPanel jPanelCambiarMoneda;
    private javax.swing.JPanel jPanelEditGestor;
    private javax.swing.JPanel jPanelEditUser;
    private javax.swing.JPanel jPanelEditarCateg2;
    private javax.swing.JPanel jPanelEditarProd;
    private javax.swing.JPanel jPanelModificar;
    private javax.swing.JPanel jPanelMostrar;
    private javax.swing.JPanel jPanelProd;
    private javax.swing.JPanel jPanelUsr;
    private javax.swing.JPanel jPanelUsr2;
    public static javax.swing.JRadioButton jRadioButtonPeso;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPaneAgregar;
    private javax.swing.JTabbedPane jTabbedPaneMod;
    private javax.swing.JTabbedPane jTabbedPaneTodo;
    private javax.swing.JTextArea jTextAreaPedidos;
    private javax.swing.JTextArea jTextAreaProd;
    private javax.swing.JTextArea jTextAreaUsuarios;
    private javax.swing.JTextField jTextFieldCodigoProd;
    private javax.swing.JTextField jTextFieldCuitCliente;
    private javax.swing.JTextField jTextFieldCuitGestor;
    private javax.swing.JTextField jTextFieldDescripcionCateg;
    private javax.swing.JTextField jTextFieldDescripcionCategEdit;
    private javax.swing.JTextField jTextFieldDescripcionProd;
    private javax.swing.JTextField jTextFieldDescripcionProdEdit;
    private javax.swing.JTextField jTextFieldDireccionCliente;
    private javax.swing.JTextField jTextFieldEditDireccionUsuario;
    private javax.swing.JTextField jTextFieldEditLocalidadUsuario;
    private javax.swing.JTextField jTextFieldEditNombreGestor;
    private javax.swing.JTextField jTextFieldEditNombreUsuario;
    private javax.swing.JTextField jTextFieldEditTelefonoGestor;
    private javax.swing.JTextField jTextFieldEditTelefonoUsuario;
    private javax.swing.JTextField jTextFieldLocalidadCliente;
    private javax.swing.JTextField jTextFieldNombreCateg;
    private javax.swing.JTextField jTextFieldNombreCategEdit;
    private javax.swing.JTextField jTextFieldNombreCliente;
    private javax.swing.JTextField jTextFieldNombreGestor;
    private javax.swing.JTextField jTextFieldNombreProd;
    private javax.swing.JTextField jTextFieldNombreProdEdit;
    private javax.swing.JPasswordField jTextFieldPasswordCliente;
    private javax.swing.JPasswordField jTextFieldPasswordGestor;
    private javax.swing.JTextField jTextFieldPrecioProd;
    private javax.swing.JTextField jTextFieldPrecioProdEdit;
    private javax.swing.JTextField jTextFieldStockProd;
    private javax.swing.JTextField jTextFieldStockProdEdit;
    private javax.swing.JTextField jTextFieldTelefonoCliente;
    private javax.swing.JTextField jTextFieldTelefonoGestor;
    private javax.swing.JTextField jTextFieldValorDolar;
    // End of variables declaration//GEN-END:variables

}
