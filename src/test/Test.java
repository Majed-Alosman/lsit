package test;

import java.awt.event.*;
import java.awt.*;


public class Test extends  Frame implements ActionListener , WindowListener  {

    
    List l1 ;
    List l2; 
    Label la;
    Button b1;
    
 public  Test (String majed){
   super(majed);
   
l1= new List(4,false);
l1.setBounds(200, 200,50, 50);
l1.add("c");
l1.add("c++");
l1.add("java");
l1.add("c#");


l2 = new List(4, true);
l2.setBounds(270, 270, 60, 60);
l2.add("ss");
l2.add("cc");
l2.add("vv");
l2.add("bb");

la = new Label ();
la.setBounds(50,50,50,50);
la.setAlignment(Label.CENTER);
la.setSize(650,100);

b1 = new Button ("show");
b1.setBounds(150,150,30, 30);
b1.addActionListener(this);

add(l1);
add(l2);add(b1);
add(la);

     setSize(600, 600);
     setLayout(null);
     setVisible(true);

 
 
 
 }  
    
    
    public static void main(String[] args) {
        Test m = new Test ("majed");
       // m.setSize(600, 600);
       // m.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       String data = "get selected item " +l1.getSelectedItem();
       la.setText(data);
            
    }

    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
    }

    @Override
    public void windowClosed(WindowEvent we) {
       
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
