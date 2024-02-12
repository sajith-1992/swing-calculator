import java.awt.event.*;


import java.awt.Color;
import java.awt.Font;

import javax.swing.*;  

public class calculator implements ActionListener {
    boolean isoperatorPressed=false;
    
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b3;
    JButton b2;
    JButton b1,div,subtractionbutton,additionbutton;
    JButton zero;
    JButton clear;
    String oldValString;
   

    JLabel screen;
    calculator(){
        JFrame jf=new JFrame("calculator"); 
        jf.setLayout(null);
        jf.setSize(300,400);
        jf.setLocation(100,100);

        screen=new JLabel("");
        screen.setBounds(20,40,250,40);
        screen.setBackground(Color.BLUE);
        screen.setOpaque(true);
        screen.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(screen);
        
        
        b7= new JButton("7");
        b7.setBounds(10,100,50, 50);
        b7.setFont(new Font("Arial", Font.PLAIN,15 ));
        jf.add(b7);
        b7.addActionListener(this);
        
        b8=new JButton("8");
        b8.setBounds(80,100,50, 50);
        jf.add(b8);
        b8.addActionListener(this);
        
        b9=new JButton("9");
        b9.setBounds(160,100,50, 50);
        jf.add(b9);
        b9.addActionListener(this);

        b4=new JButton("4");
        b4.setBounds(10,180,50, 50);
        jf.add(b4);
        b4.addActionListener(this);


        b5=new JButton("5");
        b5.setBounds(80,180,50, 50);
        jf.add(b5);
        b5.addActionListener(this);

        b6=new JButton("6");
        b6.setBounds(160,180,50, 50);
        jf.add(b6);
        b6.addActionListener(this);


        b3=new JButton("3");  
        b3.setBounds(10,260,50, 50);
        jf.add(b3);
        b3.addActionListener(this);



        b2=new JButton("2");
        b2.setBounds(80,260,50, 50);
        jf.add(b2);
        b2.addActionListener(this);

        b1=new JButton("1");
        b1.setBounds(160,260,50, 50);
        jf.add(b1);
        b1.addActionListener(this);

        JButton star=new JButton("*");
        star.setBounds(10,320,50, 50);
        jf.add(star);
        star.addActionListener(this);

         zero=new JButton("0");
        zero.setBounds(80,320,50, 50);
        jf.add(zero);
        zero.addActionListener(this);

         clear=new JButton("c");
        clear.setBounds(160,320,50, 50);
        jf.add(clear);
        clear.addActionListener(this);


        div=new JButton("/");
        div.setBounds(230,100,50, 50);
        jf.add(div);
        div.addActionListener(this);


        subtractionbutton=new JButton("-");
        subtractionbutton.setBounds(230,180,50, 50);
        jf.add(subtractionbutton);
        subtractionbutton.addActionListener(this);


        additionbutton=new JButton("+");
        additionbutton.setBounds(230,260,50, 50);
        jf.add(additionbutton);
        additionbutton.addActionListener(this);

       
      


        jf.setVisible(true);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    public static void main(String[] args) throws Exception {
     new calculator();
    }
     
    
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b7){
            if(isoperatorPressed){
                screen.setText("7");
                isoperatorPressed=false;
            } else
            {screen.setText(screen.getText()+"7");}
       }else if(e.getSource()==b8){
        if(isoperatorPressed){
            screen.setText("8");
            isoperatorPressed=false;
        } else
        {screen.setText(screen.getText()+"8");}
       }else if (e.getSource()==b9){
        if(isoperatorPressed){
            screen.setText("9");
            isoperatorPressed=false;
        } else
        {screen.setText(screen.getText()+"9");}
       }
       else if (e.getSource()==b4){
           screen.setText(screen.getText()+"4");

       } 
        else if (e.getSource()==b5){
           screen.setText(screen.getText()+"5");
       }
       else if (e.getSource()==b6){
        screen.setText(screen.getText()+"6");
       }
      
               
            else if (e.getSource()==b3){
                screen.setText(screen.getText()+"3");
            }
            else if (e.getSource()==b2){
                screen.setText(screen.getText()+"2");
            }
            else if (e.getSource()==b1){
                screen.setText(screen.getText()+"1");
            }
            else if (e.getSource()==clear){
                screen.setText("");
            }
            else if (e.getSource()==zero){
                screen.setText(screen.getText()+"0");
            }
            else if (e.getSource()==additionbutton){
                isoperatorPressed=true;
               oldValString = screen.getText();
               
              
                
            }
            else if (e.getSource()==subtractionbutton){
                
            }
            else if (e.getSource()==div){
                
            }
      }
    }
    
        
       


    
