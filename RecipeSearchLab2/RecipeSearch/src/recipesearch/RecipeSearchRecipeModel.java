/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipesearch;

import java.awt.Font;
import se.chalmers.ait.dat215.lab2.*;

/**
 *
 * @author jonathan
 */
public class RecipeSearchRecipeModel extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    
    private Recipe recipe;
    
    /**
     * Creates new customizer RecipeSearchRecipeModel
     */
    public RecipeSearchRecipeModel() {
        initComponents();
        
        
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }
    
    
    public void setRecipe(Recipe r) {
        this.recipe = r;
        this.nameLabel.setText(this.recipe.getName());
        this.nbrOfPortionsLabel.setText(Integer.toString(this.recipe.getServings()));
        this.recipeTimeLabel.setText(Integer.toString(this.recipe.getTime()));
        this.recipePriceLabel.setText(Integer.toString(this.recipe.getPrice()));
        this.recipeCouisineLabel.setText(this.recipe.getCuisine());
        this.recipeDifficultyLabel.setText(this.recipe.getDifficulty());
        this.descriptionTextPane.setText(this.recipe.getDescription());
        this.imageLabel.setIcon(recipe.getImage());
        this.ingredientTextArea.setText(recipe.getIngredients().toString());
        this.ingredientTextArea.setLineWrap(true);
        this.descriptionTextPane.setLineWrap(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        portionsLabel = new javax.swing.JLabel();
        nbrOfPortionsLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        cuisineLabel = new javax.swing.JLabel();
        difficultyLabel = new javax.swing.JLabel();
        recipeTimeLabel = new javax.swing.JLabel();
        recipePriceLabel = new javax.swing.JLabel();
        recipeCouisineLabel = new javax.swing.JLabel();
        recipeDifficultyLabel = new javax.swing.JLabel();
        descriptionPane = new javax.swing.JScrollPane();
        descriptionTextPane = new javax.swing.JTextArea();
        ingredientsList = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingredientTextArea = new javax.swing.JTextArea();
        imageLabel = new javax.swing.JLabel();

        nameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Namn");

        infoPanel.setBackground(new java.awt.Color(200, 200, 200));

        portionsLabel.setText("Antal Portioner:");

        nbrOfPortionsLabel.setText("portioner");

        timeLabel.setText("Tid:");

        priceLabel.setText("Pris:");

        cuisineLabel.setText("Kök:");

        difficultyLabel.setText("Svårighetsgrad:");

        recipeTimeLabel.setText("tid");

        recipePriceLabel.setText("pris");

        recipeCouisineLabel.setText("kök");

        recipeDifficultyLabel.setText("svårighet");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(infoPanelLayout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addComponent(timeLabel))
                                .addComponent(portionsLabel)
                                .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(difficultyLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recipeDifficultyLabel)
                            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(recipeTimeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(recipePriceLabel)
                                .addComponent(recipeCouisineLabel)
                                .addComponent(nbrOfPortionsLabel))))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(cuisineLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portionsLabel)
                    .addComponent(nbrOfPortionsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel)
                    .addComponent(recipeTimeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(recipePriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuisineLabel)
                    .addComponent(recipeCouisineLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(difficultyLabel)
                    .addComponent(recipeDifficultyLabel))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        descriptionTextPane.setColumns(20);
        descriptionTextPane.setRows(5);
        descriptionTextPane.setText("\n");
        descriptionPane.setViewportView(descriptionTextPane);

        jLabel1.setText("Ingredienser");

        ingredientTextArea.setColumns(20);
        ingredientTextArea.setRows(5);
        jScrollPane1.setViewportView(ingredientTextArea);

        javax.swing.GroupLayout ingredientsListLayout = new javax.swing.GroupLayout(ingredientsList);
        ingredientsList.setLayout(ingredientsListLayout);
        ingredientsListLayout.setHorizontalGroup(
            ingredientsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredientsListLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ingredientsListLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        ingredientsListLayout.setVerticalGroup(
            ingredientsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredientsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(descriptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ingredientsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nameLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ingredientsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(descriptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cuisineLabel;
    private javax.swing.JScrollPane descriptionPane;
    private javax.swing.JTextArea descriptionTextPane;
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JTextArea ingredientTextArea;
    private javax.swing.JPanel ingredientsList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nbrOfPortionsLabel;
    private javax.swing.JLabel portionsLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel recipeCouisineLabel;
    private javax.swing.JLabel recipeDifficultyLabel;
    private javax.swing.JLabel recipePriceLabel;
    private javax.swing.JLabel recipeTimeLabel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
