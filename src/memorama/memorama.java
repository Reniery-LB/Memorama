package memorama;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;

public class memorama {

	private JFrame frame;
	private JLabel aciertos;
	public int c1 = -1, c2 = -1;
	public int cartas[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};
	public ArrayList<JButton> cartas2 = new ArrayList<JButton>();
	public int puntos = 0;
	
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
	
	public memorama() {
		mezclarCartas();
		initialize();
	}
	
	private void mezclarCartas() {
		List<Integer> lista = new ArrayList<>();
		for (int carta : cartas) {
			lista.add(carta);
		}
		Collections.shuffle(lista); 
		for (int i = 0; i < cartas.length; i++) {
			cartas[i] = lista.get(i);
		}
	}
	
	private void verificar() {
	    if (c1 != -1 && c2 != -1) {
	        if (c1 == c2) {
	            JOptionPane.showMessageDialog(null, "ES PAR", "PAR", JOptionPane.INFORMATION_MESSAGE);
	            
	            puntos++;
	            aciertos.setText("ACIERTOS: " + puntos);
	            
	            for (JButton boton : cartas2) {
	                boton.setEnabled(false);
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "NO ES PAR", "IMPAR", JOptionPane.ERROR_MESSAGE);
	            
	            for (JButton boton : cartas2) {
	                boton.setIcon(new ImageIcon("img/cara.png")); 
	            }
	        }
	   
	        cartas2.clear();
	        c1 = -1;
	        c2 = -1;
	        
	        if (puntos == 8) {
	            JOptionPane.showMessageDialog(null, "¡Juego terminado! Has encontrado todos los pares.", "JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
	        }
	    }
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
		
		JButton btn1 = new JButton();
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn1.setIcon(new ImageIcon("img/"+cartas[0]+".png"));
				btn1.setOpaque(true);
				cartas2.add(btn1); //ArrayList
				if(c1 == -1) {
					c1 = cartas[0];
				}
				
				else if(c2 == -1) {
					c2 = cartas[0];
				}
				
				verificar();
//				if(c1 == c2 && c1 != -1) {
//					//joption
//					JOptionPane.showMessageDialog(null, "ES PAR", "PAR", JOptionPane.INFORMATION_MESSAGE);
//				
//					//foreach
//					for (Iterator iterator = cartas2.iterator(); iterator.hasNext();) {
//						JButton jbutton = (JButton) iterator.next();
//						
//						jbutton.setEnabled(false);
//					}
//					
//					c1 = -1;
//					c2 = -1;
//				} else if (c1 != -1 && c2 != -1){
//					//joption
//					JOptionPane.showMessageDialog(null, "NO ES PAR", "IMPAR", JOptionPane.ERROR_MESSAGE);
//			
//					//foreach
//					for (Iterator iterator = cartas2.iterator(); iterator.hasNext();) {
//						JButton jbutton = (JButton) iterator.next();
//						jbutton.setIcon(new ImageIcon("img/"+cartas[0]+".png"));
//					}
//				
//					cartas2.removeAll(cartas2);
//					c1 = -1;
//					c2 = -1;
//				}
			}
		});
		btn1.setBounds(49, 102, 127, 111);
		btn1.setBackground(Color.decode("#0071e3"));
		btn1.setIcon(new ImageIcon("img/cara.png"));
		btn1.setOpaque(true);
		mipanel.add(btn1);
		
		JButton btn2 = new JButton();
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn2.setIcon(new ImageIcon("img/"+cartas[1]+".png"));
				btn2.setOpaque(true);
				cartas2.add(btn2); //ArrayList
				if(c1 == -1) {
					c1 = cartas[1];
				}
				
				else if(c2 == -1) {
					c2 = cartas[1];
				}
				
				verificar();
//				if(c1 == c2 && c1 != -1) {
//					//joption
//					JOptionPane.showMessageDialog(null, "ES PAR", "PAR", JOptionPane.INFORMATION_MESSAGE);
//				
//					//foreach
//					for (Iterator iterator = cartas2.iterator(); iterator.hasNext();) {
//						JButton jbutton = (JButton) iterator.next();
//						
//						jbutton.setEnabled(false);
//					}
//					
//					c1 = -1;
//					c2 = -1;
//				} else if (c1 != -1 && c2 != -1){
//					//joption
//					JOptionPane.showMessageDialog(null, "NO ES PAR", "IMPAR", JOptionPane.ERROR_MESSAGE);
//			
//					//foreach
//					for (Iterator iterator = cartas2.iterator(); iterator.hasNext();) {
//						JButton jbutton = (JButton) iterator.next();
//						jbutton.setIcon(new ImageIcon("img/"+cartas[1]+".png"));
//					}
//				
//					cartas2.removeAll(cartas2);
//					c1 = -1;
//					c2 = -1;
//				}
			}
		});
		btn2.setBackground(new Color(0, 113, 227));
		btn2.setBackground(Color.decode("#0071e3"));
		btn2.setBounds(186, 102, 127, 111);
		btn2.setIcon(new ImageIcon("img/cara.png"));
		btn2.setOpaque(true);
		mipanel.add(btn2);
		
		JButton btn3 = new JButton();
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn3.setIcon(new ImageIcon("img/"+cartas[2]+".png"));
				btn3.setOpaque(true);
				cartas2.add(btn3); //ArrayList
				if(c1 == -1) {
					c1 = cartas[2];
				}
				
				else if(c2 == -1) {
					c2 = cartas[2];
				}
				
				verificar();
//				if(c1 == c2 && c1 != -1) {
//					//joption
//					JOptionPane.showMessageDialog(null, "ES PAR", "PAR", JOptionPane.INFORMATION_MESSAGE);
//				
//					//foreach
//					for (Iterator iterator = cartas2.iterator(); iterator.hasNext();) {
//						JButton jbutton = (JButton) iterator.next();
//						
//						jbutton.setEnabled(false);
//					}
//					
//					c1 = -1;
//					c2 = -1;
//				} else if (c1 != -1 && c2 != -1){
//					//joption
//					JOptionPane.showMessageDialog(null, "NO ES PAR", "IMPAR", JOptionPane.ERROR_MESSAGE);
//			
//					//foreach
//					for (Iterator iterator = cartas2.iterator(); iterator.hasNext();) {
//						JButton jbutton = (JButton) iterator.next();
//						jbutton.setIcon(new ImageIcon("img/cara.png"));
//					}
//				
//					cartas2.removeAll(cartas2);
//					c1 = -1;
//					c2 = -1;
//				}
			}
		});
		btn3.setOpaque(true);
		btn3.setBackground(new Color(0, 113, 227));
		btn3.setBounds(323, 102, 127, 111);
		btn3.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn3);
		
		JButton btn4 = new JButton();
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn4.setIcon(new ImageIcon("img/"+cartas[3]+".png"));
				btn4.setOpaque(true);
				cartas2.add(btn4); //ArrayList
				if(c1 == -1) {
					c1 = cartas[3];
				}
				
				else if(c2 == -1) {
					c2 = cartas[3];
				}
				
				verificar();
			}
		});
		btn4.setOpaque(true);
		btn4.setBackground(new Color(0, 113, 227));
		btn4.setBounds(461, 102, 127, 111);
		btn4.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn4);
		
		JButton btn5 = new JButton();
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn5.setIcon(new ImageIcon("img/"+cartas[4]+".png"));
				btn5.setOpaque(true);
				cartas2.add(btn5); //ArrayList
				if(c1 == -1) {
					c1 = cartas[4];
				}
				
				else if(c2 == -1) {
					c2 = cartas[4];
				}
				
				verificar();
			}
		});
		btn5.setOpaque(true);
		btn5.setBackground(new Color(0, 113, 227));
		btn5.setBounds(49, 226, 127, 111);
		btn5.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn5);
		
		JButton btn6 = new JButton();
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn6.setIcon(new ImageIcon("img/"+cartas[5]+".png"));
				btn6.setOpaque(true);
				cartas2.add(btn6); //ArrayList
				if(c1 == -1) {
					c1 = cartas[5];
				}
				
				else if(c2 == -1) {
					c2 = cartas[5];
				}
				
				verificar();
			}
		});
		btn6.setOpaque(true);
		btn6.setBackground(new Color(0, 113, 227));
		btn6.setBounds(186, 223, 127, 111);
		btn6.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn6);
		
		JButton btn7 = new JButton();
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn7.setIcon(new ImageIcon("img/"+cartas[6]+".png"));
				btn7.setOpaque(true);
				cartas2.add(btn7); //ArrayList
				if(c1 == -1) {
					c1 = cartas[6];
				}
				
				else if(c2 == -1) {
					c2 = cartas[6];
				}
				
				verificar();
			}
		});
		btn7.setOpaque(true);
		btn7.setBackground(new Color(0, 113, 227));
		btn7.setBounds(323, 226, 127, 111);
		btn7.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn7);
		
		JButton btn8 = new JButton();
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn8.setIcon(new ImageIcon("img/"+cartas[7]+".png"));
				btn8.setOpaque(true);
				cartas2.add(btn8); //ArrayList
				if(c1 == -1) {
					c1 = cartas[7];
				}
				
				else if(c2 == -1) {
					c2 = cartas[7];
				}
				
				verificar();
			}
		});
		btn8.setOpaque(true);
		btn8.setBackground(new Color(0, 113, 227));
		btn8.setBounds(461, 223, 127, 111);
		btn8.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn8);
		
		JButton btn9 = new JButton();
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn9.setIcon(new ImageIcon("img/"+cartas[8]+".png"));
				btn9.setOpaque(true);
				cartas2.add(btn9); //ArrayList
				if(c1 == -1) {
					c1 = cartas[8];
				}
				
				else if(c2 == -1) {
					c2 = cartas[8];
				}
				
				verificar();
			}
		});
		btn9.setOpaque(true);
		btn9.setBackground(new Color(0, 113, 227));
		btn9.setBounds(49, 347, 127, 111);
		btn9.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn9);
		
		JButton btn10 = new JButton();
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn10.setIcon(new ImageIcon("img/"+cartas[9]+".png"));
				btn10.setOpaque(true);
				cartas2.add(btn10); //ArrayList
				if(c1 == -1) {
					c1 = cartas[9];
				}
				
				else if(c2 == -1) {
					c2 = cartas[9];
				}
				
				verificar();
			}
		});
		btn10.setOpaque(true);
		btn10.setBackground(new Color(0, 113, 227));
		btn10.setBounds(186, 344, 127, 111);
		btn10.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn10);
		
		JButton btn11 = new JButton();
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn11.setIcon(new ImageIcon("img/"+cartas[10]+".png"));
				btn11.setOpaque(true);
				cartas2.add(btn11); //ArrayList
				if(c1 == -1) {
					c1 = cartas[10];
				}
				
				else if(c2 == -1) {
					c2 = cartas[10];
				}
				
				verificar();
			}
		});
		btn11.setOpaque(true);
		btn11.setBackground(new Color(0, 113, 227));
		btn11.setBounds(323, 347, 127, 111);
		btn11.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn11);
		
		JButton btn12 = new JButton();
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn12.setIcon(new ImageIcon("img/"+cartas[11]+".png"));
				btn12.setOpaque(true);
				cartas2.add(btn12); //ArrayList
				if(c1 == -1) {
					c1 = cartas[11];
				}
				
				else if(c2 == -1) {
					c2 = cartas[11];
				}
				
				verificar();
			}
		});
		btn12.setOpaque(true);
		btn12.setBackground(new Color(0, 113, 227));
		btn12.setBounds(461, 344, 127, 111);
		btn12.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn12);
		
		JButton btn13 = new JButton();
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn13.setIcon(new ImageIcon("img/"+cartas[12]+".png"));
				btn13.setOpaque(true);
				cartas2.add(btn13); //ArrayList
				if(c1 == -1) {
					c1 = cartas[12];
				}
				
				else if(c2 == -1) {
					c2 = cartas[12];
				}
				
				verificar();
			}
		});
		btn13.setOpaque(true);
		btn13.setBackground(new Color(0, 113, 227));
		btn13.setBounds(49, 468, 127, 111);
		btn13.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn13);
		
		JButton btn14 = new JButton();
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn14.setIcon(new ImageIcon("img/"+cartas[13]+".png"));
				btn14.setOpaque(true);
				cartas2.add(btn14); //ArrayList
				if(c1 == -1) {
					c1 = cartas[13];
				}
				
				else if(c2 == -1) {
					c2 = cartas[13];
				}
				
				verificar();
			}
		});
		btn14.setOpaque(true);
		btn14.setBackground(new Color(0, 113, 227));
		btn14.setBounds(186, 465, 127, 111);
		btn14.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn14);
		
		JButton btn15 = new JButton();
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn15.setIcon(new ImageIcon("img/"+cartas[14]+".png"));
				btn15.setOpaque(true);
				cartas2.add(btn15); //ArrayList
				if(c1 == -1) {
					c1 = cartas[14];
				}
				
				else if(c2 == -1) {
					c2 = cartas[14];
				}
				
				verificar();
			}
		});
		btn15.setOpaque(true);
		btn15.setBackground(new Color(0, 113, 227));
		btn15.setBounds(323, 468, 127, 111);
		btn15.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn15);
		
		JButton btn16 = new JButton();
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMAGEN
				btn16.setIcon(new ImageIcon("img/"+cartas[15]+".png"));
				btn16.setOpaque(true);
				cartas2.add(btn16); //ArrayList
				if(c1 == -1) {
					c1 = cartas[15];
				}
				
				else if(c2 == -1) {
					c2 = cartas[15];
				}
				
				verificar();
			}
		});
		btn16.setOpaque(true);
		btn16.setBackground(new Color(0, 113, 227));
		btn16.setBounds(461, 465, 127, 111);
		btn16.setIcon(new ImageIcon("img/cara.png"));
		mipanel.add(btn16);
		
		aciertos = new JLabel("\r\nACIERTOS: 0");
		aciertos.setFont(new Font("Dialog", Font.BOLD, 24));
		aciertos.setBackground(Color.decode("#0d7cc1")); 
		aciertos.setOpaque(true);
		aciertos.setForeground(Color.white);
		aciertos.setBounds(630, 143, 234, 139);
		mipanel.add(aciertos);
		
		JButton reiniciar = new JButton("REINICIAR");
		reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mezclarCartas();
				puntos = 0;
				frame.dispose();
				new memorama().frame.setVisible(true);
			}
		});
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
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon("img/fondo.jpg"));
		fondo.setBounds(0, 0, 900, 700);
		mipanel.add(fondo);
		
		
	}
}
