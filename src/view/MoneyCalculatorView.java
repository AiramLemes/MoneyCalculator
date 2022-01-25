package view;

import java.util.ArrayList;
import model.Currency;
import model.ExchangeRateSet;

/**
 *
 * @author airam
 */
public class MoneyCalculatorView extends javax.swing.JFrame {

    /**
     * Creates new form MoneyCalculatorView
     */
    
    private final ArrayList<Currency> currencies;
    private final ExchangeRateSet rates;
    

    public MoneyCalculatorView(ArrayList<Currency> currencies, ExchangeRateSet rates) {
        initComponents();
        this.setTitle("Money Calculator");
        this.currencies = currencies;
        this.rates = rates;
        this.setVisible(true);
        this.setLocation(500, 250);
        this.textTwo.setEditable(false);
        fillComboBoxes();
        currencyOneComboBox.setSelectedIndex(0);
        currencyTwoComboBox.setSelectedIndex(0);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textOne = new javax.swing.JTextField();
        currencyOneComboBox = new javax.swing.JComboBox<>();
        currencyTwoComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textTwo = new javax.swing.JTextField();
        symbolOne = new javax.swing.JLabel();
        symbolTwo = new javax.swing.JLabel();
        intercambio = new javax.swing.JButton();
        calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        currencyOneComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyOneComboBoxActionPerformed(evt);
            }
        });

        currencyTwoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyTwoComboBoxActionPerformed(evt);
            }
        });

        textTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTwoActionPerformed(evt);
            }
        });

        symbolOne.setText(" ");

        symbolTwo.setText(" ");

        intercambio.setText("Intercambio");
        intercambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intercambioActionPerformed(evt);
            }
        });

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(textOne))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(symbolOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currencyOneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(symbolTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currencyTwoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(intercambio)))))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calcular)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currencyOneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(symbolOne))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currencyTwoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(textTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(symbolTwo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(intercambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calcular)
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void currencyOneComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyOneComboBoxActionPerformed
        // TODO add your handling code here:
        String texto1 = currencies.get(currencyOneComboBox.getSelectedIndex()).getSymbol();
        symbolOne.setText(texto1);
    }//GEN-LAST:event_currencyOneComboBoxActionPerformed

    private void textTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTwoActionPerformed

    private void currencyTwoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyTwoComboBoxActionPerformed
        String texto1 = currencies.get(currencyTwoComboBox.getSelectedIndex()).getSymbol();
        symbolTwo.setText(texto1);
    }//GEN-LAST:event_currencyTwoComboBoxActionPerformed

    private void intercambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intercambioActionPerformed
        int opcion = currencyOneComboBox.getSelectedIndex();
        int opcion2 = currencyTwoComboBox.getSelectedIndex();
        
        currencyOneComboBox.setSelectedIndex(opcion2);
        currencyTwoComboBox.setSelectedIndex(opcion);
        
    }//GEN-LAST:event_intercambioActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        calcularCambio();  
    }//GEN-LAST:event_calcularActionPerformed

    private void calcularCambio() {
        
        double money = Double.parseDouble(textOne.getText());
        //if (currencyOneComboBox.getSelectedIndex() != -1 && currencyTwoComboBox.getSelectedIndex() != -1) {
            
            double rate = rates.getRate(currencies.get(currencyOneComboBox.getSelectedIndex()),
                currencies.get(currencyTwoComboBox.getSelectedIndex()));
        
            textTwo.setText(String.valueOf(money * rate));
        //}
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JComboBox<String> currencyOneComboBox;
    private javax.swing.JComboBox<String> currencyTwoComboBox;
    private javax.swing.JButton intercambio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel symbolOne;
    private javax.swing.JLabel symbolTwo;
    private javax.swing.JTextField textOne;
    private javax.swing.JTextField textTwo;
    // End of variables declaration//GEN-END:variables

    private void fillComboBoxes() {
        
        for (Currency currency : currencies) {
            currencyOneComboBox.addItem(currency.getName());
            currencyTwoComboBox.addItem(currency.getName());
        }
        
    }
}
