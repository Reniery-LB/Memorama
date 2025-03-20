package memorama;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class memorama {

	private JFrame frame;
	private JButton boton16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memorama window = new memorama();
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
	public memorama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mipanel = new JPanel();
		frame.getContentPane().add(mipanel, BorderLayout.CENTER);
		mipanel.setLayout(null);
		
		
		JLabel titulo = new JLabel("MEMORAMA");
		titulo.setFont(new Font("Dialog", Font.BOLD, 24));
		titulo.setBounds(248, 48, 151, 44);
		mipanel.add(titulo);
		
		JButton boton1 = new JButton("");
		boton1.setBounds(49, 102, 127, 111);
		boton1.setBackground(Color.decode("#0071e3"));
		boton1.setOpaque(true);
		mipanel.add(boton1);
		
		JButton boton2 = new JButton("");
		boton2.setOpaque(true);
		boton2.setBackground(new Color(0, 113, 227));
		boton2.setBounds(186, 102, 127, 111);
		mipanel.add(boton2);
		
		JButton boton3 = new JButton("");
		boton3.setOpaque(true);
		boton3.setBackground(new Color(0, 113, 227));
		boton3.setBounds(323, 102, 127, 111);
		mipanel.add(boton3);
		
		JButton boton4 = new JButton("");
		boton4.setOpaque(true);
		boton4.setBackground(new Color(0, 113, 227));
		boton4.setBounds(461, 102, 127, 111);
		mipanel.add(boton4);
		
		JButton boton5 = new JButton("");
		boton5.setOpaque(true);
		boton5.setBackground(new Color(0, 113, 227));
		boton5.setBounds(49, 226, 127, 111);
		mipanel.add(boton5);
		
		JButton boton6 = new JButton("");
		boton6.setOpaque(true);
		boton6.setBackground(new Color(0, 113, 227));
		boton6.setBounds(49, 347, 127, 111);
		mipanel.add(boton6);
		
		JButton boton7 = new JButton("");
		boton7.setOpaque(true);
		boton7.setBackground(new Color(0, 113, 227));
		boton7.setBounds(49, 468, 127, 111);
		mipanel.add(boton7);
		
		JButton boton8 = new JButton("");
		boton8.setOpaque(true);
		boton8.setBackground(new Color(0, 113, 227));
		boton8.setBounds(186, 223, 127, 111);
		mipanel.add(boton8);
		
		JButton boton9 = new JButton("");
		boton9.setOpaque(true);
		boton9.setBackground(new Color(0, 113, 227));
		boton9.setBounds(186, 344, 127, 111);
		mipanel.add(boton9);
		
		JButton boton10 = new JButton("");
		boton10.setOpaque(true);
		boton10.setBackground(new Color(0, 113, 227));
		boton10.setBounds(186, 465, 127, 111);
		mipanel.add(boton10);
		
		JButton boton11 = new JButton("");
		boton11.setOpaque(true);
		boton11.setBackground(new Color(0, 113, 227));
		boton11.setBounds(323, 226, 127, 111);
		mipanel.add(boton11);
		
		JButton boton12 = new JButton("");
		boton12.setOpaque(true);
		boton12.setBackground(new Color(0, 113, 227));
		boton12.setBounds(323, 347, 127, 111);
		mipanel.add(boton12);
		
		JButton boton13 = new JButton("");
		boton13.setOpaque(true);
		boton13.setBackground(new Color(0, 113, 227));
		boton13.setBounds(323, 468, 127, 111);
		mipanel.add(boton13);
		
		JButton boton14 = new JButton("");
		boton14.setOpaque(true);
		boton14.setBackground(new Color(0, 113, 227));
		boton14.setBounds(461, 223, 127, 111);
		mipanel.add(boton14);
		
		JButton boton15 = new JButton("");
		boton15.setOpaque(true);
		boton15.setBackground(new Color(0, 113, 227));
		boton15.setBounds(461, 344, 127, 111);
		mipanel.add(boton15);
		
		boton16 = new JButton("");
		boton16.setOpaque(true);
		boton16.setBackground(new Color(0, 113, 227));
		boton16.setBounds(461, 465, 127, 111);
		mipanel.add(boton16);
		
		JLabel aciertos = new JLabel("\r\nACIERTOS:");
		aciertos.setFont(new Font("Dialog", Font.BOLD, 24));
		aciertos.setBackground(Color.decode("#0d7cc1")); 
		aciertos.setOpaque(true);
		aciertos.setForeground(Color.white);
		aciertos.setBounds(630, 143, 234, 139);
		mipanel.add(aciertos);
		
		JButton reiniciar = new JButton("REINICIAR");
		reiniciar.setForeground(new Color(255, 255, 255));
		reiniciar.setFont(new Font("Dialog", Font.BOLD, 33));
		reiniciar.setBackground(Color.decode("#0d7cc1")); 
		reiniciar.setOpaque(true);
		reiniciar.setBounds(630, 392, 234, 111);
		mipanel.add(reiniciar);
		
		JLabel score = new JLabel();
		score.setBounds(616, 125, 259, 413);
		score.setBackground(Color.decode("#92d4f7"));
		score.setOpaque(true);
		mipanel.add(score);
		
		JLabel memorama = new JLabel();
		memorama.setBounds(31, 35, 575, 557);
		memorama.setBackground(Color.decode("#f9d052"));
		memorama.setOpaque(true);
		mipanel.add(memorama);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon("D:\\MATERIAS DE LA UNI\\PROGRAMACION 3\\TRABAJOS ECLIPSE\\Memorama\\img\\fondo.jpg"));
		fondo.setBounds(0, 0, 900, 700);
		mipanel.add(fondo);
		
		
	}
}
