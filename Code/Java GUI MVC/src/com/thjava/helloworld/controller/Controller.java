package com.thjava.helloworld.controller;

import com.thjava.helloworld.model.Model;
import com.thjava.helloworld.view.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controller implements ActionListener { 
    
    // ประกาศตัวแปร  
    private Model m;
    private View v;
    
    // constructor  
    public Controller(Model m, View v) {
        this.m = m;
        this.v = v;
        v.setVisible(true); 
        
        // set action commands
        v.getBtnEnter().setActionCommand("Enter");
        v.getBtnClear().setActionCommand("Clear");
        // ดักฟังเหตุการณ์บนหน้าจอ   
        v.getBtnEnter().addActionListener(this);    
        v.getBtnClear().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();  
        
        if(command.equals("Enter")) {
            //System.out.println("Enter...");
            String name = v.getTxtName().getText();   
            //System.out.println(name);   
            if(!name.equals("")) {
                m.setName(name);
                v.showResult(m);    
                // ล้างค่าใน Text Field
                v.getTxtName().setText(""); 
            } else {
                // กรณีไม่กรอกข้อมูลเข้ามา
                JOptionPane.showMessageDialog(v, "กรุณากรอกชื่อ", "แจ้งเตือน", 2);    
            }
        }
        
        if(command.equals("Clear")) {
            //System.out.println("Clear..."); 
            v.getTxtName().setText(""); 
            v.getLblResult().setText("");   
        }
        
    }
    

} // class Controller
