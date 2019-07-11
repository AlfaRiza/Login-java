/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ACER
 */
public class datapilih {
    private int id_pilih,id_voter,id_calon;

    public datapilih(int id_voter, int id_calon) {
        this.id_voter = id_voter;
        this.id_calon = id_calon;
    }

    public datapilih() {
        
    }

    public int getId_pilih() {
        return id_pilih;
    }

    public void setId_pilih(int id_pilih) {
        this.id_pilih = id_pilih;
    }

    public int getId_voter() {
        return id_voter;
    }

    public void setId_voter(int id_voter) {
        this.id_voter = id_voter;
    }

    public int getId_calon() {
        return id_calon;
    }

    public void setId_calon(int id_calon) {
        this.id_calon = id_calon;
    }

    


    
    
}
