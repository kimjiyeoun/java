package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Start extends JFrame {
	public static JPanel contentPane = new JPanel();
	JLabel title = new JLabel("메뉴판");
	JButton btn1 = new JButton("열기");
	
	public Start() {
		setTitle("카페 메뉴판 보기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		
		c.setLayout(new FlowLayout());
		
		
		
		
		c.add(title);
		
		c.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Mainmenu();
			}
		});
		
				
		setSize(200,200);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	
		
	}
	public static void main(String[] args) {
		new Start();
	}
	
}

class Mainmenu extends JFrame{
	
	JLabel Americano = new JLabel("아메리카노: 3000");
	JLabel Espresso = new JLabel("에스프레소: 3000");
	JLabel Latte = new JLabel("라떼: 3500");
	JLabel Cappuccino = new JLabel("카푸치노: 3500");
	JLabel Icedtea = new JLabel("아이스티: 4000");
	JButton btn2 = new JButton("주문하기");
	
	Mainmenu(){
		
		Container c = getContentPane();
		
		
		c.setLayout(new FlowLayout());
		

		c.add(Americano);
		
			
		
		c.add(Espresso);
		
		
		c.add(Latte);
		
		
		c.add(Cappuccino);
		
		
		c.add(Icedtea);
		
		btn2.setSize(100, 100);
		btn2.setLocation(150, 480);
		c.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order();
			}
		});

		
		setSize(200,200);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
	}
			
}

class Order extends JFrame{
	JLabel o = new JLabel("주문하실 음료를 입력해주세요.");
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7, 20);
	
	
	Order(){
		setTitle("주문하기");
		Container c = getContentPane();
		
		
		c.setLayout(new FlowLayout());
		c.add(o);
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n"); 
				t.setText(""); 
			}
		});
		
		
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
				
	}
	public static void main(String[] args) {
		new Order();
	}
}


