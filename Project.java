package project;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class Project extends JFrame implements  ActionListener{

    double a,b,d;
    
    JLabel input1;
    JLabel input2;
    JLabel result;
    
    JTextField f1;
    JTextField f2;
    JTextField f3;
            
    JMenuItem c1;
    JMenuItem c2;
    JMenuItem redc;
    JMenuItem greenc;
    JMenuItem cyanc;
    JMenuItem centerc;
    JMenuItem yellowc;
    JMenuItem SUM;
    JMenuItem SUB;
    JMenuItem DIV;
    JMenuItem MUL;
    
    
    
    JMenu cmenu;
    JMenu menu;
    JMenu omenu;
    
    JMenuBar cbar;
    JMenuBar bar;
    JMenuBar obar;
    
    JFrame cframe;
    JFrame frame;
    JFrame opf;
    JFrame frame1;
    
    JPanel cpanel;
    JPanel opp;
    JPanel green;
    JPanel center;
    JPanel cyan;
    JPanel red;
    JPanel yellow;
    JPanel course;
    JPanel color;
    JPanel operation;
    
    JButton cbtn;
    JButton c;
    JButton cor;
    JButton o;
    JButton p1;
    JButton obtn;
    JButton EXIST;
    
    private LayoutManager FlowLayout;
    private LayoutManager GridLayout;

    public Project()  
    {
        o= new JButton("OPERATIONS");
        o.setPreferredSize(new Dimension(100,50));
        o.addActionListener(this);
        cor= new JButton("COURSE");
         cor.setPreferredSize(new Dimension(100,50));
         cor.addActionListener(this);
        c= new JButton("COLOR");
         c.setPreferredSize(new Dimension(100,50));
        c.addActionListener(this);
        EXIST= new JButton("EXIST");
        EXIST.setPreferredSize(new Dimension(100,50));
        EXIST.addActionListener(this);
        
        
        course= new JPanel();
        course.setPreferredSize(new Dimension(200,200));
        course.setBackground(Color.MAGENTA);
        course.add(cor);
        
        
        
        color= new JPanel();
        color.setBackground(Color.cyan);
        color.setPreferredSize(new Dimension(200,200));
        color.add(c);
        color.add(EXIST, BorderLayout.SOUTH);
        operation= new JPanel();
        operation.setBackground(Color.GREEN);
        operation.setPreferredSize(new Dimension(200,200));
        operation.add(o);
       
        
        frame= new JFrame();
        frame.setMinimumSize(new Dimension(1000,1000));
        frame.setMaximumSize(new Dimension(2500,2500));
      //frame.setLayout(FlowLayout);
        frame.add(color, BorderLayout.CENTER);
        frame.add(course, BorderLayout.WEST);
        frame.add(operation, BorderLayout.EAST);
//        frame.add(c,BorderLayout.CENTER);
//        frame.add(cor, BorderLayout.CENTER);
//        frame.add(o, BorderLayout.CENTER);
        frame.setVisible(true);


    
        
    
    
    
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {

Project p= new Project();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String cmd=ae.getActionCommand();
         if(cmd=="EXIST")
        {
            frame.setVisible(false);
            
        }
          
        if(cmd=="COLOR")
            
            {
                p1= new JButton("BACK");
                p1.setPreferredSize(new Dimension(100,50));
                p1.addActionListener(this);
                
                
                redc= new JMenuItem("RED");
                redc.addActionListener(new redc());
                cyanc= new JMenuItem("CYAN");
                cyanc.addActionListener(new cyanc());
                greenc= new JMenuItem("GREEN");
                greenc.addActionListener(new greenc());
                centerc= new JMenuItem("CENTER");
                centerc.addActionListener(new centerc());
                
                yellowc= new JMenuItem("YELLOW");
                
                
                menu= new JMenu("COLORS");
                menu.add(cyanc);
                menu.add(greenc);
                menu.add(yellowc);
                menu.add(redc);
                menu.add(centerc);
                
                
                
                bar = new JMenuBar();
                bar.add(menu);
                
                yellow= new JPanel();
                yellow.setPreferredSize(new Dimension(200,200));
                yellow.setBackground(Color.yellow);
               yellow.add(p1,BorderLayout.CENTER);
                
                
                red= new JPanel();
                red.setBackground(Color.red);
                red.setPreferredSize(new Dimension(200,200));
                
                cyan= new JPanel();
                cyan.setPreferredSize(new Dimension(200,200));
                cyan.setBackground(Color.cyan);
                
                green= new JPanel();
                green.setBackground(Color.GREEN);
                green.setPreferredSize(new Dimension(200,200));
                
                center= new JPanel();
                center.setPreferredSize(new Dimension(200,200));
                center.setBackground(Color.MAGENTA);
                center.add(p1,BorderLayout.CENTER);
               
                frame1= new JFrame();
//                frame1.add(yellow, BorderLayout.AFTER_LINE_ENDS);
                frame1.add(cyan, BorderLayout.SOUTH);
                frame1.add(center, BorderLayout.CENTER);
                frame1.add(red, BorderLayout.WEST);
                frame1.add(green, BorderLayout.EAST);
                frame1.add(bar, BorderLayout.NORTH);
                
                frame1.setVisible(true);
                frame1.setSize(1000,1000);
                      
        
                color.setBackground(Color.blue);
                
                
            }
                    
            if(cmd=="BACK")
        {
            frame1.setVisible(false);
            
        }

        
        
        
        
        if(cmd=="OPERATIONS")
        {
            obtn= new JButton("RETURN");
            obtn.setPreferredSize(new Dimension(100,50));
            obtn.addActionListener(this);
            
            input1= new JLabel("INPUT1");
            input2= new JLabel("INPUT2");
            result= new JLabel("RESULT");
            
            f1= new JTextField();
            f1.setPreferredSize(new Dimension(60,60));
            f2= new JTextField();
            f2.setPreferredSize(new Dimension(60,60));
            f3= new JTextField();
            f3.setPreferredSize(new Dimension(60,60));
            
            opp= new JPanel();
            opp.setPreferredSize(new Dimension(200,200));
            opp.setBackground(Color.MAGENTA);
            opp.add(obtn, BorderLayout.WEST);
            opp.add(input1);
            opp.add(f1);
            opp.add(input2);
            opp.add(f2);
            opp.add(result);
            opp.add(f3);
            
            
            
            SUM = new JMenuItem("SUM");
            SUM.addActionListener(new SUM());
            SUB= new JMenuItem("SUB");
            SUB.addActionListener(new SUB());
            DIV= new JMenuItem("DIV");
            DIV.addActionListener(new DIV());
            MUL= new JMenuItem("MUL");
            MUL.addActionListener(new MUL());
            
            
            omenu= new JMenu("OPERATIONS");
            omenu.add(SUM);
             omenu.add(SUB);
             omenu.add(DIV);
             omenu.add(MUL);
            
            
                    obar= new JMenuBar();
                    obar.add(omenu);
                    
                    
                    opf= new JFrame();
                    opf.setSize(1000, 1000);
                    opf.add(opp, BorderLayout.CENTER);
                    opf.add(obar, BorderLayout.NORTH);
                    opf.setVisible(true);
        
        
}
        if(cmd=="RETURN")
        {
            opf.setVisible(false);
            
        
        }
        if(cmd=="COURSE")
        
        {
            c1= new JMenuItem("ENGLISH");
            c1.addActionListener(new ENGLISH());
            c2= new JMenuItem("MATHS");
            c2.addActionListener(new MATHS());
            
            
            cmenu= new JMenu("SUBJECTS");
            cmenu.add(c1);
            cmenu.add(c2);
            
            cbar= new JMenuBar();
            cbar.add(cmenu);
                    
            
            cbtn= new JButton("GOBACK");
            cbtn.setPreferredSize(new  Dimension(100,50));
            cbtn.addActionListener(this);
            cpanel= new JPanel();
            cpanel.setBackground(Color.ORANGE);
            cpanel.setPreferredSize(new Dimension(200,200));
            cpanel.add(cbtn);
            cpanel.add(cbar, BorderLayout.NORTH);
            
            cframe= new JFrame();
            cframe.setSize(1000, 1000);
            cframe.add(cpanel, BorderLayout.CENTER);
            cframe.setVisible(true);
            
            
            
            
        }
        if(cmd=="GOBACK")
      {
          cframe.setVisible(false);
      }
    
        
    }
    
    
    public class redc implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
    
            String cmd= ae.getActionCommand();
            if(cmd=="RED");
            {
                red.setBackground(Color.WHITE);
                redc.setText("CHANGED");
            }
        if(cmd=="CHANGED")
        {
            red.setBackground(Color.red);
            redc.setText("RED");
        }
        }
    }
    
    public class greenc implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
    
            String cmd= ae.getActionCommand();
            if(cmd=="GREEN");
            {
                green.setBackground(Color.BLACK);
                greenc.setText("CHANGED");
            }
        if(cmd=="CHANGED")
        {
            green.setBackground(Color.green);
            greenc.setText("GREEN");
        }
        }
    }
    
    
    public class cyanc implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
    
            String cmd= ae.getActionCommand();
            if(cmd=="CYAN");
            {
                cyan.setBackground(Color.blue);
                cyanc.setText("CHANGED");
            }
        if(cmd=="CHANGED")
        {
            cyan.setBackground(Color.cyan);
            cyanc.setText("CYAN");
        }
        }
    }
    
    public class centerc implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
    
            String cmd= ae.getActionCommand();
            if(cmd=="CENTER");
            {
                center.setBackground(Color.PINK);
                centerc.setText("CHANGED");
            }
        if(cmd=="CHANGED")
        {
            center.setBackground(Color.MAGENTA);
            centerc.setText("CENTER");
        }
        }
    }
    
    
        public class SUM implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
    a=Double.valueOf(f1.getText());
    b=Double.valueOf(f2.getText());
    d=a+b;
    f3.setText(String.valueOf(d));
    
    }
    }
    
    
        public class SUB implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
    a=Double.valueOf(f1.getText());
    b=Double.valueOf(f2.getText());
    d=a-b;
    f3.setText(String.valueOf(d));
    
    }
    }
        
            public class DIV implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
    a=Double.valueOf(f1.getText());
    b=Double.valueOf(f2.getText());
    d=a/b;
    f3.setText(String.valueOf(d));
    
    }
    }

            
                public class MUL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
    a=Double.valueOf(f1.getText());
    b=Double.valueOf(f2.getText());
    d=a*b;
    f3.setText(String.valueOf(d));
    
    }
    }
                
     class MATHS implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
        
    try{
        PDDocument d= PDDocument.load(new File("E:\\calculus.pdf"));
        
        PDFTextStripper pdf= new PDFTextStripper();
        String text = pdf.getText(d);
        
        System.out.println(text);
        
        
        
    }
    
    catch(IOException e)
    {
        e.printStackTrace();
    
    
    }
    
    
        
        
        }
        
     }    
        
        
        
        class ENGLISH implements  ActionListener{

            @Override
            public void actionPerformed(ActionEvent ae) {
            
            
            
    try{
        PDDocument d= PDDocument.load(new File("E:\\art of public.pdf"));
        
        PDFTextStripper pdf= new PDFTextStripper();
        String text = pdf.getText(d);
        
        System.out.println(text);
        
        
        
    }
    
    catch(IOException e)
    {
        e.printStackTrace();
    
    
    }
            
            }
        }
        
    
                
    

    
    
    
    }


