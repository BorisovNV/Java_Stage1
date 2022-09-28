package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class MainApp extends JFrame implements ActionListener {

        public static void main(String arg[]) {
            new MainApp();
        }
        JButton bPlus,bMinus,bMulti,bDiv,bRes,bClear;
        JButton b[]=new JButton[10];
        int i,r,n1,n2;
        JTextField res;
        char op;

        public MainApp() {
            super("Калькулятор");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            setLayout(new BorderLayout());
            JPanel p=new JPanel();
            p.setLayout(new GridLayout(4,4));

            for(int i=0;i<=9;i++) {
                b[i]=new JButton(i+"");
                p.add(b[i]);
                b[i].addActionListener(this);
            }

            bPlus=new JButton("+");
            p.add(bPlus);
            bPlus.addActionListener(this);
            Font bPl = new Font("Arial", Font.BOLD, 30);


            bMinus=new JButton("-");
            p.add(bMinus);
            bMinus.addActionListener(this);
            Font bMi = new Font("Arial", Font.BOLD, 30);

            bMulti=new JButton("*");
            p.add(bMulti);
            bMulti.addActionListener(this);
            Font bMu = new Font("Arial", Font.BOLD, 30);

            bDiv=new JButton("/");
            p.add(bDiv);
            bDiv.addActionListener(this);
            Font bDi = new Font("Arial", Font.BOLD, 30);

            bRes=new JButton("=");
            p.add(bRes);
            bRes.addActionListener(this);
            Font bRe = new Font("Arial", Font.BOLD, 30);

            bClear=new JButton("C");
            p.add(bClear);
            bClear.addActionListener(this);
            Font bCl = new Font("Arial", Font.BOLD, 30);

            res=new JTextField(10);
            add(p,BorderLayout.CENTER);
            add(res,BorderLayout.NORTH);
            setVisible(true);
            setSize(400,400);
        }
        public void actionPerformed(ActionEvent e) {
            JButton pb=(JButton)e.getSource();
            if(pb==bClear) {
                r=n1=n2=0;
                res.setText("");
            }
            else if(pb==bRes) {
                n2=Integer.parseInt(res.getText());
                eval();
                res.setText(""+r);
            }
            else {
                boolean opf=false;
                if(pb==bPlus)
                { op='+';
                    opf=true;
                }
                if(pb==bMinus)
                { op='-';opf=true;}
                if(pb==bMulti)
                { op='*';opf=true;}
                if(pb==bDiv)
                { op='/';opf=true;}

                if(!opf) {
                    for(i=0;i<10;i++) {
                        if(pb==b[i]) {
                            String t=res.getText();
                            t+=i;
                            res.setText(t);
                        }
                    }
                }
                else {
                    n1=Integer.parseInt(res.getText());
                    res.setText("");
                }
            }
        }
        int eval() {
            switch(op) {
                case '+':   r=n1+n2;  break;
                case '-':   r=n1-n2;  break;
                case '*':   r=n1*n2;  break;
                case '/':   r=n1/n2;  break;
            }
            return 0;
        }
    }
