/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.database;
import view.input;

/**
 *
 * @author ACER
 */
public class controlinput implements ActionListener {
    private input input;
    private database db;
    
        public controlinput(input input, database db) {
        this.input = input;
        this.db = db;
        input.getController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==input.simpan){
            JOptionPane.showMessageDialog(null,"Data Berhaasil di Input");
            try {
                model.datapilih d = new model.datapilih();
                d.setId_pilih(parseInt(input.fid_pilih.getText().toString()));
                d.setId_voter(parseInt(input.fid_voter.getText().toString()));
                d.setId_calon(parseInt(input.fid_calon.getText().toString()));
                new database().input(d);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(controlinput.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(controlinput.class.getName()).log(Level.SEVERE, null, ex);
            }
            input.fid_pilih.setText("");
            input.fid_voter.setText("");
            input.fid_calon.setText("");
        }
    }
        
        
    
    
    
    
    
}
