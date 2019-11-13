/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCC.POO.SistemaMacDONALDS;

/**
 *
 * @author Gazebo
 */
public class Lanche {
    private String lanche;
    private String carne;
    private boolean Ketchup;
    private boolean MolhoEspecial;
    private String Queijo;
    private boolean picles;
    private boolean cebola;
    private boolean Mostarda;
    private boolean gergilim;

    public Lanche(String lanche, String carne, boolean Ketchup, boolean MolhoEspecial, String Queijo, boolean picles, boolean cebola, boolean Mostarda, boolean gergilim) {
        this.lanche = lanche;
        this.carne = carne;
        this.Ketchup = Ketchup;
        this.MolhoEspecial = MolhoEspecial;
        this.Queijo = Queijo;
        this.picles = picles;
        this.cebola = cebola;
        this.Mostarda = Mostarda;
        this.gergilim = gergilim;
    }
    
    public boolean isGergilim() {
        return gergilim;
    }

    public void setGergilim(boolean gergilim) {
        this.gergilim = gergilim;
    }
        
    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public boolean isKetchup() {
        return Ketchup;
    }

    public void setKetchup(boolean Ketchup) {
        this.Ketchup = Ketchup;
    }

    public boolean isMolhoEspecial() {
        return MolhoEspecial;
    }

    public void setMolhoEspecial(boolean MolhoEspecial) {
        this.MolhoEspecial = MolhoEspecial;
    }

    public String getQueijo() {
        return Queijo;
    }

    public void setQueijo(String Queijo) {
        this.Queijo = Queijo;
    }

    public boolean isPicles() {
        return picles;
    }

    public void setPicles(boolean picles) {
        this.picles = picles;
    }

    public boolean isCebola() {
        return cebola;
    }

    public void setCebola(boolean cebola) {
        this.cebola = cebola;
    }

    public boolean isMostarda() {
        return Mostarda;
    }

    public void setMostarda(boolean Mostarda) {
        this.Mostarda = Mostarda;
    }
        
        
}
