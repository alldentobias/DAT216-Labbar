package recipesearch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathan
 */
public class RecipeSearchResultItemModel extends javax.swing.JButton implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer RecipeSearchResultItemModel
     */
    public RecipeSearchResultItemModel(se.chalmers.ait.dat215.lab2.Recipe recipe) {
        initComponents();
        this.nameLabel.setText(recipe.getName());
        
        
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        portionLabelText = new javax.swing.JLabel();
        timeLabelText = new javax.swing.JLabel();
        priceLabelText = new javax.swing.JLabel();
        difficultyLabelText = new javax.swing.JLabel();
        difficultyLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        portionLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        iconLabel.setText("Icon");

        nameLabel.setText("Namn");

        jScrollPane1.setViewportView(jTextPane1);

        portionLabelText.setText("Portioner:");

        timeLabelText.setText("Tid:");

        priceLabelText.setText("Pris:");

        difficultyLabelText.setText("Svårighetsgrad:");

        difficultyLabel.setText("jLabel1");

        priceLabel.setText("jLabel2");

        timeLabel.setText("jLabel3");

        portionLabel.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(portionLabelText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(portionLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(difficultyLabelText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(difficultyLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceLabelText)
                                    .addComponent(timeLabelText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(timeLabel, javax.swing.GroupLayout.Alignment.TRAILING)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nameLabel)
                                .addComponent(portionLabelText))
                            .addComponent(portionLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(timeLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(timeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(priceLabelText)
                                    .addComponent(priceLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(difficultyLabelText)
                                    .addComponent(difficultyLabel)))
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JLabel difficultyLabelText;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel portionLabel;
    private javax.swing.JLabel portionLabelText;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel priceLabelText;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel timeLabelText;
    // End of variables declaration//GEN-END:variables
}
