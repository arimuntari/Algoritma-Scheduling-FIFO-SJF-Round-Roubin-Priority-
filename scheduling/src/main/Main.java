/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Main {

    public static void main(String[] args) {
        JFrame  frame =new JFrame("Algoritma Scheduling");
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        model.addColumn("Proses");
        model.addColumn("Jalan");
        model.addColumn("Tunggu");
        model.addColumn("Selesai");
        
        DefaultTableModel model2 = new DefaultTableModel();
        JTable table2 = new JTable(model2);
        model2.addColumn("Proses");
        model2.addColumn("Jalan");
        JButton fifo = new JButton("FIFO");
        fifo.setBounds(210, 20, 150, 30);
        fifo.addActionListener((e) -> {
             model2.setColumnCount(2);
           model2.setRowCount(0);
           model.setColumnCount(4);
           model.setRowCount(0);
           FIFO fif = new FIFO(model,model2,  table, table2);
        });
        
        JButton sjf = new JButton("SJF");
        sjf.setBounds(210, 60, 150, 30);
        sjf.addActionListener((e) -> {model2.setColumnCount(2);
           model2.setRowCount(0);
             model.setColumnCount(4);
           model.setRowCount(0);
           SJF s = new SJF(model,model2,  table, table2);
        });
        JButton RR = new JButton("Round Roubin");
        RR.setBounds(210, 100, 150, 30);
        RR.addActionListener((e) -> {
            model2.setColumnCount(2);
            model2.setRowCount(0);
            model.setColumnCount(4);
            model.setRowCount(0);
             RR r = new RR(model, model2,  table, table2);
        });
        
        JButton pr = new JButton("Priority");
        pr.setBounds(210, 140, 150, 30);
        pr.addActionListener((e) -> {
            model2.addColumn("Priority");
            model2.setColumnCount(3);
            model2.setRowCount(0);
            model.addColumn("Priority");
            model.setColumnCount(5);
            model.setRowCount(0);
            Priority s = new Priority(model,model2,  table, table2);
        });
        //model.addRow( new Object[]{"asd", "",""});
        JScrollPane pane = new JScrollPane(table);
        JScrollPane pane2 = new JScrollPane(table2);
        pane.setBounds(7, 200, 370, 180);       
        pane2.setBounds(7, 10, 190, 180);
        table.setFillsViewportHeight(true);        
        table2.setFillsViewportHeight(true);
        pane.setBackground(Color.white);
        pane2.setBackground(Color.white);      
        frame.add(fifo);
        frame.add(sjf);
        frame.add(RR);
        frame.add(pr);
        frame.add(pane); 
        frame.add(pane2);    
        frame.setBounds(10, 10, 400, 450);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
