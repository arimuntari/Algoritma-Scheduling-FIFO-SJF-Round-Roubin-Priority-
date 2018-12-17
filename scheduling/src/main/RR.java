/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RR extends Variabel{
    public RR (DefaultTableModel model,DefaultTableModel model2, JTable table, JTable table2){
        super.model = model;
        super.table = table;
        super.model = model;        
        super.model2 = model2;
        super.table = table;
        super.table2 = table2;
        for(int i=0;i<super.jml;i++){
            input(i);
        }
        w_tunggu();
        w_selesai();
        updateTable();
    }
    
    public void w_tunggu(){
        int asd, l=0, q=2;
        int[] tmp_jalan = new int[jml];
        System.arraycopy(w_jalan, 0, tmp_jalan, 0, jml);
        boolean cek =true;
        while(cek){
            asd = 0;
            for(int i=0;i<jml;i++){
                if(tmp_jalan[i]>0){
                    l++;
                    w_tunggu[i]++;
                    tmp_jalan[i]= tmp_jalan[i]-q;
                    if(tmp_jalan[i]<=0){
                        w_tunggu[i] = l-w_tunggu[i];
                    }
                    asd++;
                }
            }
            if(asd==0){
               cek = false;
            }
        }
    }
}
