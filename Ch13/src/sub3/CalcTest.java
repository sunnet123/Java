package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcTest {

	private JFrame frame;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcTest window = new CalcTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private int operator = 0; // 1:더하기, 2: 뺴기, 3: 곱하기, 4:나누기
	private int num1 = 0;
	private int num2 = 0;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 297, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setFont(new Font("굴림", Font.PLAIN, 24));
		txtResult.setText("0");
		txtResult.setBounds(12, 10, 260, 65);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(12, 98, 56, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(80, 98, 56, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(148, 98, 56, 55);
		frame.getContentPane().add(btn9);
		
		JButton btnNewButton_2_1 = new JButton("/");
		btnNewButton_2_1.setBounds(216, 98, 56, 55);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(12, 163, 56, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(80, 163, 56, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(148, 163, 56, 55);
		frame.getContentPane().add(btn6);
		
		JButton btnMulit = new JButton("*");
		btnMulit.setBounds(216, 163, 56, 55);
		frame.getContentPane().add(btnMulit);
		
		
		
		JButton btn1 = new JButton("1");
		
		btn1.setBounds(12, 228, 56, 55);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		
		btn2.setBounds(80, 228, 56, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(148, 228, 56, 55);
		frame.getContentPane().add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(216, 228, 56, 55);
		frame.getContentPane().add(btnMinus);
		
		JButton btnC = new JButton("c");
		btnC.setBounds(12, 293, 56, 55);
		frame.getContentPane().add(btnC);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(80, 293, 56, 55);
		frame.getContentPane().add(btn0);
		
		JButton btnEq = new JButton("=");
		
		btnEq.setBounds(148, 293, 56, 55);
		frame.getContentPane().add(btnEq);
		
		JButton btnPlus = new JButton("+");
		
		//버튼 리스너
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 1;
			}
		});
		
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = 0;
				
				if(operator == 1) {
					result = num1 + num2;
				}else if(operator == 2) {
					result = num1 - num2;
				}else if(operator == 3) {
					result = num1 / num2;
				}else if(operator == 4) {
					result = num1 / num2;
				}
				
				txtResult.setText(""+result);
			}
		});
		
		
		btnPlus.setBounds(216, 293, 56, 55);
		frame.getContentPane().add(btnPlus);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("1");
				num1 = 1;
				
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("2");
				num2 = 2;
			}
		});
	}

}
