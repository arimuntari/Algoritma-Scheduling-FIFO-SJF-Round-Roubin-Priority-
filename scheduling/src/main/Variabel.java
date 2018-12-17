/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muntari
 */
public class Variabel {
    public String[] proses;
    public int[] w_jalan, w_tunggu, w_selesai, priority;
    public int jml;
    public DefaultTableModel model;
    public JTable table;
    public DefaultTableModel model2;
    public JTable table2;
    public Variabel(){
        int jml = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Jumlah Prosess: "));
        proses = new String[jml];
        w_jalan = new int[jml];
        w_tunggu = new int[jml];
        w_selesai = new int[jml];
        priority = new int[jml];
        this.jml = jml;
    }
    public void setWjalan(int i, int nilai){
        proses[i]  = "P"+(i+1);
        w_jalan[i] = nilai; 
        model2.addRow(new Object[]{proses[i],w_jalan[i]});
    }
    public void setWjalan(int i, int nilai, int prio){
        proses[i]  = "P"+(i+1);
        w_jalan[i] = nilai; 
        priority[i] = prio; 
        model2.addRow(new Object[]{proses[i], w_jalan[i] , priority[i]});
    }
    public void w_tunggu(){
        w_tunggu[0] = 0;
        for(int i=1; i<jml;i++){
            w_tunggu[i] = w_jalan[i-1]+w_tunggu[i-1];
        }
    }
    public void w_selesai(){
        for(int i=0; i<jml;i++){
            w_selesai[i] = w_jalan[i]+w_tunggu[i];
        }
    }
    public void updateTable(){
        for(int i=0; i<jml;i++){
            model.addRow(new Object[]{proses[i], w_jalan[i] ,w_tunggu[i], w_selesai[i]});
        }
    }
    public void input(int i){
        try {
            String tunggu = JOptionPane.showInputDialog("Masukkan Proses ke-"+(i+1));
            setWjalan(i, Integer.valueOf(tunggu));
        } catch (Exception e) {
            input(i);
        }
    }
   
}
