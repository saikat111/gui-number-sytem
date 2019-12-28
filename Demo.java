import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener{
	Button b1,b2;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Demo(){
	addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        }); 
	b1 = new Button("banary"); 
	b2 = new Button("Decimal"); 

	l1 = new Label("banary");
	l2 = new Label("Decimal");
	l3 = new Label("Result");
	t1 = new TextField();
	t2 = new TextField();
	t3 = new TextField();
	add(b1);add(t1);add(t2);add(t3);add(b2);add(l1);add(l2);add(l3);
	b1.setBounds(100,250,50,30);
	l1.setBounds(50,100,40,30);
	l2.setBounds(50,150,40,30);
	l3.setBounds(50,200,40,30);
	b2.setBounds(180,250,50,30);
	t1.setBounds(100,100,100,30);
	t2.setBounds(100,150,100,30);
	t3.setBounds(100,200,100,30);
	setSize(400,400);
	setLayout(null);
	setVisible(true);
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	}
 public void actionPerformed(ActionEvent e) {
	int bdd;
	
	//String b =t1.getText();
	//String d =t2.getText();
	int bi,de;
	bi = Integer.parseInt(t1.getText());
	//de = Integer.parseInt(t2.getText());
	if(e.getSource() == b1){
	BinarryToDecimal bd = new BinarryToDecimal();
	
		System.out.println(bi);
		bdd =bd.getDecimal(bi);
		String bee;
		bee = String.valueOf(bdd);
		t3.setText(bee);
    }
	

		
	

	}

public static void main(String args[]){
		new Demo();

	}
}