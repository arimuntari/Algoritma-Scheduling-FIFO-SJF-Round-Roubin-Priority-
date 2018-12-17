/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FIFO extends Variabel{
    public FIFO(DefaultTableModel model,DefaultTableModel model2, JTable table, JTable table2){
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
}
