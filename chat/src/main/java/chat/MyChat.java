package chat;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyChat extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3167155801733073713L;

	private JPanel contentPane;
	private JTextField textField;

	private String ip;

	private final JTextArea textArea = new JTextArea();

	public JTextArea getTextArea() {
		return textArea;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyChat frame = new MyChat();
					frame.setVisible(true);
					Thread servidor = new ChatServidor(frame);
					servidor.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyChat() {
		setResizable(false);
		setTitle("MyChat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textArea.setEditable(false);
		textArea.setBounds(250, 40, 510, 440);
		contentPane.add(textArea);

		final JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(null, textField.getText());

				String message = textField.getText();

				textArea.append("YO: " + message + "\n");

				Thread client = new ChatCliente(ip, message);
				client.start();

				textField.setText("");
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 22));
		btnNewButton.setBounds(540, 500, 220, 40);
		contentPane.add(btnNewButton);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (textField.getText().length() > 0) {
					btnNewButton.setEnabled(true);
				} else {
					btnNewButton.setEnabled(false);
				}
			}
		});
		textField.setForeground(new Color(25, 25, 112));
		textField.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField.setBounds(20, 500, 500, 40);
		contentPane.add(textField);
		textField.setColumns(10);

		final JList list = new JList();

		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				Contacto contacto = (Contacto) list.getSelectedValue();
				ip = contacto.getIp();
			}
		});
		ContactModel model = new ContactModel();
		list.setModel(model);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(20, 40, 200, 440);
		contentPane.add(list);

	}
}
