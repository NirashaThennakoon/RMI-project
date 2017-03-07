/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.thogakade.views;

//import lk.ijse.jasper.report.JasperReportViewer;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static javax.xml.bind.DatatypeConverter.parseDate;
import lk.ijse.thogakade.controller.ControllerFactory;
import lk.ijse.thogakade.controller.custom.CustomerController;
import lk.ijse.thogakade.controller.custom.ItemController;
import lk.ijse.thogakade.controller.custom.OrderDetailController;
import lk.ijse.thogakade.controller.custom.PlaceOrderController;
import lk.ijse.thogakade.dto.CustomerDTO;
import lk.ijse.thogakade.dto.ItemDTO;
import lk.ijse.thogakade.dto.OrderDTO;
import lk.ijse.thogakade.dto.OrderDetailDTO;
import lk.ijse.thogakade.views.*;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.util.JRLoader;


/**
 *
 * @author linux
 */
public class PlaceOrderForm extends javax.swing.JFrame {
     private PlaceOrderController ctrlPlaceOrder;
     private CustomerController ctrlCustomer;
     private ItemController ctrlItem;
     private OrderDetailController ctrlOrderDetail;
    

    /**
     * Creates new form PlaceOrderForm
     */
    public PlaceOrderForm() {
        initComponents();
        setIconImage();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(new Date());
        dateTxt.setText(formattedDate);
         try {
             ctrlPlaceOrder = (PlaceOrderController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.PLACE_ORDER
             );
             ctrlCustomer = (CustomerController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.CUSTOMER);
            ctrlItem= (ItemController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.ITEM);
            ctrlOrderDetail = (OrderDetailController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.ORDER_DETAIL);
         } catch (NotBoundException ex) {
             Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
         } catch (MalformedURLException ex) {
             Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
         } catch (RemoteException ex) {
             Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
         }
          try {
             loadDataIntoCombos();
         } catch (Exception ex) {
             Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
         }
          setOrderId();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        custIdCombo = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        descriptionText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        unitPriceText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        qtyOnHandText = new javax.swing.JTextField();
        qtyText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        codeCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        removeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        amountText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        orderIdText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CashTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ChangeTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Place Order");

        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel2.setText("Order ID : ");

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel3.setText("Date : ");

        dateTxt.setEditable(false);
        dateTxt.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)), "Customer Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Serif", 1, 14), new java.awt.Color(0, 204, 204))); // NOI18N

        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel4.setText("ID : ");

        jLabel5.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel5.setText("Name : ");

        nameText.setEditable(false);
        nameText.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N

        custIdCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                custIdComboItemStateChanged(evt);
            }
        });
        custIdCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIdComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addComponent(custIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameText)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)), "Item Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Serif", 1, 14), new java.awt.Color(0, 204, 204))); // NOI18N

        jLabel6.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel6.setText("Code : ");

        jLabel7.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel7.setText("Description : ");

        descriptionText.setEditable(false);
        descriptionText.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel8.setText("Unit Price : ");

        unitPriceText.setEditable(false);
        unitPriceText.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel9.setText("Qty On Hand : ");

        qtyOnHandText.setEditable(false);
        qtyOnHandText.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N

        qtyText.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        qtyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyTextActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel10.setText("Qty : ");

        codeCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                codeComboItemStateChanged(evt);
            }
        });
        codeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)
                        .addComponent(unitPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descriptionText))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(qtyOnHandText)
                                .addGap(32, 32, 32))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 36, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(unitPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(qtyOnHandText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        itemTable.setFont(new java.awt.Font("DejaVu Serif", 0, 12)); // NOI18N
        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Description", "Unit Price", "Qty", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemTable);

        removeButton.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        amountText.setEditable(false);
        amountText.setFont(new java.awt.Font("DejaVu Serif", 1, 16)); // NOI18N
        amountText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        amountText.setText("0.0");

        jLabel11.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel11.setText("Total Amount : ");

        orderIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIdTextActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Cash");

        CashTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashTxtActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Change");

        ChangeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeTxtActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Confirm Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(orderIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeButton))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(51, 51, 51)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(CashTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                                .addComponent(ChangeTxt))))
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(addButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(CashTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(ChangeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qtyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyTextActionPerformed

    }//GEN-LAST:event_qtyTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (codeCombo.getSelectedIndex() != -1) {

            int qtyOnHand = Integer.parseInt(qtyOnHandText.getText());
            if (qtyText.getText().trim().isEmpty()) {
                return;
            }
            int qty = Integer.parseInt(qtyText.getText());

            DefaultTableModel dtm = (DefaultTableModel) itemTable.getModel();

            for (int i = 0; i < dtm.getRowCount(); i++) {
                if (dtm.getValueAt(i, 0).toString().equals(codeCombo.getSelectedItem().toString())) {
                    JOptionPane.showMessageDialog(this, "Sorry, Item has been already  added.");
                    return;
                }
            }

            if (qty <= qtyOnHand && qty > 0) {

                double amount = qty * Double.parseDouble(unitPriceText.getText());

                Object[] rowData = {
                    codeCombo.getSelectedItem().toString(),
                    descriptionText.getText(),
                    unitPriceText.getText(),
                    qtyText.getText(),
                    String.valueOf(amount)
                };

                dtm.addRow(rowData);

            }
        }

        calculateTotalAmount();
                            
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
      DefaultTableModel dtm = (DefaultTableModel) itemTable.getModel();
        
        if (itemTable.getSelectedRow() != -1) {
            dtm.removeRow(itemTable.getSelectedRow());
           
        }
        calculateTotalAmount();   
    }//GEN-LAST:event_removeButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
      System.out.println("save data ready...");   
      OrderDTO orderDTO;
        orderDTO = new OrderDTO(
                orderIdText.getText(),
                parseDate(dateTxt.getText()),
                custIdCombo.getSelectedItem().toString()
        );
        try {
             ctrlPlaceOrder.add(orderDTO);
         } catch (Exception ex) {
             Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
         }
        OrderDetailDTO orderDetailDTO;
            orderDetailDTO = new OrderDetailDTO();
        System.out.println("save data ready...");
        DefaultTableModel dtm=(DefaultTableModel) itemTable.getModel();
        
        for(int i =0;i<dtm.getRowCount();i++){
            OrderDetailDTO detailDTO=new OrderDetailDTO(
                    orderIdText.getText(), 
                    dtm.getValueAt(i, 0).toString(),
                    Integer.parseInt(dtm.getValueAt(i, 3).toString()),
                    Double.parseDouble(dtm.getValueAt(i, 2).toString())
            );
          try {
              
             
              ctrlOrderDetail.add(detailDTO);
          } catch (Exception ex) {
              Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("catch");
          }
     Double s= Double.parseDouble(CashTxt.getText());
     Double a= Double.parseDouble(amountText.getText());
     
     String d= String.valueOf(s-a);
     ChangeTxt.setText(d);
            
        }
       JOptionPane.showMessageDialog(this, "Save done successfully");
         
            
         
    }//GEN-LAST:event_saveButtonActionPerformed

    private void custIdComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_custIdComboItemStateChanged
        if(custIdCombo.getSelectedIndex()!=-1){
            try {
                CustomerDTO customerDTO=new CustomerDTO(custIdCombo.getSelectedItem().toString());
                customerDTO = (CustomerDTO) ctrlCustomer.get(customerDTO.getId());
                nameText.setText(customerDTO.getName());
            } catch (Exception ex) {
                Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_custIdComboItemStateChanged

    private void codeComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_codeComboItemStateChanged
        cmbItemAction();
    }//GEN-LAST:event_codeComboItemStateChanged

    private void custIdComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIdComboActionPerformed
        
    }//GEN-LAST:event_custIdComboActionPerformed

    private void codeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeComboActionPerformed

    private void orderIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIdTextActionPerformed
       
    }//GEN-LAST:event_orderIdTextActionPerformed

    private void CashTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CashTxtActionPerformed

    private void ChangeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangeTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

JasperReport compiledReport;
         try {
             compiledReport = (JasperReport) JRLoader.loadObject(this.getClass().getResourceAsStream("/lk\\ijse\\thogakade\\jasperReport\\thogakade.jasper"));
              HashMap<String, Object> params = new HashMap<>();
              
                params.put("Total", amountText.getText());
                params.put("Cash",CashTxt.getText());
                params.put("Change",ChangeTxt.getText());
                params.put("OrderId",orderIdText.getText());
                JasperPrint filledReport = JasperFillManager.fillReport(compiledReport, params, new JRTableModelDataSource(itemTable.getModel()));
                JasperReportViewer myViewer = new JasperReportViewer(filledReport);
                myViewer.setVisible(true);
        
         } catch (JRException ex) {
             Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
         }
               
           
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrderForm().setVisible(true);
            }
        });
    }
     private String formattedPrice(String price) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setGroupingUsed(false);
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        return nf.format(Double.parseDouble(price));
    }
    private void loadDataIntoCombos() throws Exception {

        // Loading customers in to the customer combo
          
         
          ArrayList<CustomerDTO> allCustomers;
              allCustomers =  ctrlCustomer.getAll();
         
             
        for (CustomerDTO customer : allCustomers) {
            custIdCombo.addItem(customer.getId());
        }

        // Loading items into the item combo
        ArrayList<ItemDTO> allItems = ctrlItem.getAll();
        for (ItemDTO item : allItems) {
            codeCombo.addItem(item.getCode());
        }
    
        
    
    }
    
    private void calculateTotalAmount() {
        DefaultTableModel dtm = (DefaultTableModel) itemTable.getModel();

        double total = 0;

        for (int i = 0; i < dtm.getRowCount(); i++) {
            total += Double.parseDouble((String) dtm.getValueAt(i, 4));
        }
        amountText.setText(formattedPrice(String.valueOf(total)));

    }
     public void cmbItemAction(){
        if(codeCombo.getSelectedIndex()!=-1){
            try {
                ItemDTO itemDTO=new ItemDTO(codeCombo.getSelectedItem().toString());
                itemDTO=(ItemDTO) ctrlItem.get(itemDTO.getCode());
                descriptionText.setText(itemDTO.getDescription());
                qtyOnHandText.setText(""+itemDTO.getQtyOnHand());
                unitPriceText.setText(""+itemDTO.getUnitPrice());
                
            } catch (Exception ex) {
                Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     }

      private Date parseDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
       private void setOrderId(){
        int a;
         try {
             a = ctrlPlaceOrder.getAll().size()+1;
             System.out.println(a);
        if(a<10){
            orderIdText.setText("D00"+a);
        }else if(a<100){
            orderIdText.setText("D0"+a);
        }else{
            orderIdText.setText("D"+a);
        }
        
         } catch (Exception ex) {
             Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
         }
       }
     
               private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images.png")));
    }            
           
            
        
    

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CashTxt;
    private javax.swing.JTextField ChangeTxt;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField amountText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox codeCombo;
    private javax.swing.JComboBox custIdCombo;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextField descriptionText;
    private javax.swing.JTable itemTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField orderIdText;
    private javax.swing.JTextField qtyOnHandText;
    private javax.swing.JTextField qtyText;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField unitPriceText;
    // End of variables declaration//GEN-END:variables

}