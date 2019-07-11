/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.controlinput;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class input extends JFrame{
    private controlinput ci;
    
    public JTextField fid_pilih = new JTextField(20);
    public JTextField fid_voter = new JTextField(20);
    public JTextField fid_calon = new JTextField(20);
    
    public JLabel lid_pilih = new JLabel("id_pilih");
    public JLabel lid_voter = new JLabel("id_voter");
    public JLabel lid_calon = new JLabel("id_calon");
    public JButton simpan = new JButton("Simpan");
    
    public input(){
        super("Input Data");
        setDefaultCloseOperation(3);
        setSize(300,500);
        setLayout(null);
        add(fid_pilih);
        add(fid_voter);
        add(fid_calon);
        add(lid_pilih);
        add(lid_voter);
        add(lid_calon);
        add(simpan);
        setVisible(true);
        
        lid_pilih.setBounds(10,10,120,20);
        fid_pilih.setBounds(130,10,120,20);
        lid_voter.setBounds(10,40,120,20);
        fid_voter.setBounds(130,40,120,20);
        lid_calon.setBounds(10,70,120,20);
        fid_calon.setBounds(130,70,120,20);
        simpan.setBounds(130,150,120,20);
                setVisible(true);
    }
    


    public void getController(controlinput c) {
                this.ci = c;
        simpan.addActionListener(c);
    }
}
