/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilu;

import java.sql.SQLException;
import model.database;
import model.datacalon;
import model.datavoter;
import view.mainview;
import view.secondview;

/**
 *
 * @author ACER
 */
public class Pemilu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
            datavoter voter = new datavoter();
            database db = new database();
            mainview view = new mainview();
            view.setVisible(true);

    }
    
}
