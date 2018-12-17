/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SJF extends Variabel{
    public SJF(DefaultTableModel model,DefaultTableModel model2, JTable table, JTable table2){
        
        super.model = model;        
        super.model2 = model2;
        super.table = table;
        super.table2 = table2;
        for(int i=0;i<super.jml;i++){
            input(i);
        }
        sorting();
        w_tunggu();
        w_selesai();
        updateTable();
    }
    public void sorting(){
        int tmp_wjalan;
        String tmp_process;
        for(int i=0;i<jml;i++){
            for(int j=0;j<jml-1;j++){
                if(super.w_jalan[j] > super.w_jalan[j+1]){
                    tmp_wjalan = w_jalan[j];
                    super.w_jalan[j] =super. w_jalan[j+1];
                    super.w_jalan[j+1] = tmp_wjalan;

                    tmp_process = super.proses[j];
                    super.proses[j] = super.proses[j+1];
                    super.proses[j+1] = tmp_process;
                }
            }
        }
    }
}
