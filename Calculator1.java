import java.awt.*;
import java.awt.event.*;

class Calculator1 extends Frame implements ActionListener
{
	Frame f;
	Label l;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bminus,bmul,bdiv,bmod,bclear,bback,bneg,bpts,bequal;
	TextField t1;
	double num1,num2,check,xd;

	Calculator1()
	{
		f = new Frame("Calculator");
		f.setBackground(Color.black);

		t1 = new TextField();
		t1.setFont(new Font("Arial",Font.BOLD,35));
		t1.setBounds(10,35,398,150);
		f.add(t1);

		b0 = new Button("0");
		b0.setBackground(Color.black);
		b0.setForeground(Color.white);
		b0.setFont(new Font("Arial",Font.BOLD,20));
		b0.setBounds(10,590,100,100);
		f.add(b0);
		b0.addActionListener(this);

		b1 = new Button("1");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setBounds(210,490,100,100);
		f.add(b1);
		b1.addActionListener(this);

		b2 = new Button("2");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setBounds(110,490,100,100);
		f.add(b2);
		b2.addActionListener(this);

		b3 = new Button("3");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setFont(new Font("Arial",Font.BOLD,20));
		b3.setBounds(10,490,100,100);
		f.add(b3);
		b3.addActionListener(this);

		b4 = new Button("4");
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.setFont(new Font("Arial",Font.BOLD,20));
		b4.setBounds(210,390,100,100);
		f.add(b4);
		b4.addActionListener(this);

		b5 = new Button("5");
		b5.setBackground(Color.black);
		b5.setForeground(Color.white);
		b5.setFont(new Font("Arial",Font.BOLD,20));
		b5.setBounds(110,390,100,100);
		f.add(b5);
		b5.addActionListener(this);

		b6 = new Button("6");
		b6.setBackground(Color.black);
		b6.setForeground(Color.white);
		b6.setFont(new Font("Arial",Font.BOLD,20));
		b6.setBounds(10,390,100,100);
		f.add(b6);
		b6.addActionListener(this);

		b7 = new Button("7");
		b7.setBackground(Color.black);
		b7.setForeground(Color.white);
		b7.setFont(new Font("Arial",Font.BOLD,20));
		b7.setBounds(210,290,100,100);
		f.add(b7);
		b7.addActionListener(this);

		b8 = new Button("8");
		b8.setBackground(Color.black);
		b8.setForeground(Color.white);
		b8.setFont(new Font("Arial",Font.BOLD,20));
		b8.setBounds(110,290,100,100);
		f.add(b8);
		b8.addActionListener(this);

		b9 = new Button("9");
		b9.setBackground(Color.black);
		b9.setForeground(Color.white);
		b9.setFont(new Font("Arial",Font.BOLD,20));
		b9.setBounds(10,290,100,100);
		f.add(b9);
		b9.addActionListener(this);

		bpts = new Button(".");
		bpts.setBackground(Color.black);
		bpts.setForeground(Color.yellow);
		bpts.setFont(new Font("Arial",Font.BOLD,20));
		bpts.setBounds(110,590,100,100);
		f.add(bpts);
		bpts.addActionListener(this);

		bequal = new Button("=");
		bequal.setBackground(Color.black);
		bequal.setForeground(Color.yellow);
		bequal.setFont(new Font("Arial",Font.BOLD,20));
		bequal.setBounds(210,590,100,100);
		f.add(bequal);
		bequal.addActionListener(this);

		bplus = new Button("+");
		bplus.setBackground(Color.black);
		bplus.setForeground(Color.yellow);
		bplus.setFont(new Font("Arial",Font.BOLD,20));
		bplus.setBounds(310,590,100,100);
		f.add(bplus);
		bplus.addActionListener(this);

		bminus = new Button("-");
		bminus.setBackground(Color.black);
		bminus.setForeground(Color.yellow);
		bminus.setFont(new Font("Arial",Font.BOLD,20));
		bminus.setBounds(310,490,100,100);
		f.add(bminus);
		bminus.addActionListener(this);

		bmul = new Button("*");
		bmul.setBackground(Color.black);
		bmul.setForeground(Color.yellow);
		bmul.setFont(new Font("Arial",Font.BOLD,20));
		bmul.setBounds(310,390,100,100);
		f.add(bmul);
		bmul.addActionListener(this);

		bdiv = new Button("/");
		bdiv.setBackground(Color.black);
		bdiv.setForeground(Color.yellow);
		bdiv.setFont(new Font("Arial",Font.BOLD,20));
		bdiv.setBounds(310,290,100,100);
		f.add(bdiv);
		bdiv.addActionListener(this);

		bmod = new Button("%");
		bmod.setBackground(Color.black);
		bmod.setForeground(Color.yellow);
		bmod.setFont(new Font("Arial",Font.BOLD,20));
		bmod.setBounds(210,190,100,100);
		f.add(bmod);
		bmod.addActionListener(this);

		bneg = new Button("+/-");
		bneg.setBackground(Color.black);
		bneg.setForeground(Color.yellow);
		bneg.setFont(new Font("Arial",Font.BOLD,20));
		bneg.setBounds(110,190,100,100);
		f.add(bneg);
		bneg.addActionListener(this);

		bback = new Button("Back");
		bback.setBackground(Color.black);
		bback.setForeground(Color.yellow);
		bback.setFont(new Font("Arial",Font.BOLD,20));
		bback.setBounds(10,190,100,100);
		f.add(bback);
		bback.addActionListener(this);

		bclear = new Button("C");
		bclear.setBackground(Color.black);
		bclear.setForeground(Color.yellow);
		bclear.setFont(new Font("Arial",Font.BOLD,20));
		bclear.setBounds(310,190,100,100);
		f.add(bclear);
		bclear.addActionListener(this);

		f.setBounds(450,80,420,700);
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
	}


	public void actionPerformed(ActionEvent ae)
	{ 
  		String z,zt; 
		if(ae.getSource()==b1)
		{
 			zt=t1.getText();
  			z=zt+"1";
  			t1.setText(z);
		}
		if(ae.getSource()==b2)
		{
			zt=t1.getText();
			z=zt+"2";
			t1.setText(z);
		}
		if(ae.getSource()==b3)
		{
  			zt=t1.getText();
  			z=zt+"3";
  			t1.setText(z);
		}
		if(ae.getSource()==b4)
		{
  			zt=t1.getText();
  			z=zt+"4";
  			t1.setText(z);
		}
		if(ae.getSource()==b5)
		{
  			zt=t1.getText();
  			z=zt+"5";
  			t1.setText(z);
		}
		if(ae.getSource()==b6)
		{
  			zt=t1.getText();
  			z=zt+"6";
  			t1.setText(z);
		}
		if(ae.getSource()==b7)
		{
  			zt=t1.getText();
  			z=zt+"7";
  			t1.setText(z);
		}
		if(ae.getSource()==b8)
		{
  			zt=t1.getText();
  			z=zt+"8";
  			t1.setText(z);
		}
		if(ae.getSource()==b9)
		{
  			zt=t1.getText();
  			z=zt+"9";
  			t1.setText(z);
		}
		if(ae.getSource()==b0)
		{
  			zt=t1.getText();
  			z=zt+"0";
  			t1.setText(z);
		}

		if(ae.getSource()==bpts)
		{  
  			zt=t1.getText();
  			z=zt+".";
  			t1.setText(z);
		}
		if(ae.getSource()==bneg)
		{ 
  			zt=t1.getText();
  			z="-"+zt;
  			t1.setText(z);
		}

		if(ae.getSource()==bback)
		{  
  			zt=t1.getText();
  			try
			{
    				z=zt.substring(0, zt.length()-1);
    			}
			catch(StringIndexOutOfBoundsException f)
			{
				return;
			}
  			t1.setText(z);
		}


                
		if(ae.getSource()==bplus)
		{                    
  			try
			{
    				num1=Double.parseDouble(t1.getText());
    			}
			catch(NumberFormatException f)
			{
      				t1.setText("Invalid Format");
      				return;
    			}
  			z="";
  			t1.setText(z);
  			check=1;
		}
	
		if(ae.getSource()==bminus)
		{                    
  			try
			{
    				num1=Double.parseDouble(t1.getText());
    			}
			catch(NumberFormatException f)
			{
      				t1.setText("Invalid Format");
      				return;
    			}
  			z="";
  			t1.setText(z);
  			check=2;
		}

		if(ae.getSource()==bmul)
		{                   
  			try
			{
    				num1=Double.parseDouble(t1.getText());
    			}
			catch(NumberFormatException f)
			{
      				t1.setText("Invalid Format");
      				return;
    			}
  			z="";
  			t1.setText(z);
  			check=3;
		}

		if(ae.getSource()==bdiv)
		{                   
  			try
			{
    				num1=Double.parseDouble(t1.getText());
    			}
			catch(NumberFormatException f)
			{
      				t1.setText("Invalid Format");
      				return;
    			}
  			z="";
  			t1.setText(z);
  			check=4;
		}

		if(ae.getSource()==bmod)
		{                  
  			try
			{
		    		num1=Double.parseDouble(t1.getText());
	    		}
			catch(NumberFormatException f)
			{
      				t1.setText("Invalid Format");
      				return;
    			}
  			z="";
  			t1.setText(z);
  			check=5;
		}
		
		if(ae.getSource()==bequal)
		{          
  			try
			{
    			num2=Double.parseDouble(t1.getText());
    			}
			catch(Exception f)
			{
      				t1.setText("ENTER NUMBER FIRST ");
      				return;
    			}
  			if(check==1)
    				xd =num1+num2;
  			if(check==2)
    				xd =num1-num2;
  			if(check==3)
    				xd =num1*num2;
  			if(check==4)
    				xd =num1/num2; 
  			if(check==5)
    				xd =num1%num2;    
  			t1.setText(String.valueOf(xd));
		}
                        
		if(ae.getSource()==bclear)
		{
  			num1=0;
  			num2=0;
  			check=0;
  			xd=0;
   			z="";
   			t1.setText(z);
   		} 
	}

	public static void main(String[] Args)
	{
		new Calculator1();
	}
}