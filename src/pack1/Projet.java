package pack1;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Projet extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel Titre = new JLabel("Formulaire d'inscription");
	private JTextField nom;
	private JTextField prenom;
	private JTextField mdp;
	private JTextField mdp2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Projet frame = new Projet();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Projet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 281);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Titre.setBounds(86, 10, 194, 20);
		Titre.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(Titre);
		
		nom = new JTextField();
		nom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nom.setBounds(141, 59, 167, 19);
		contentPane.add(nom);
		nom.setColumns(10);
		
		JLabel label1 = new JLabel("Nom");
		label1.setHorizontalAlignment(SwingConstants.RIGHT);
		label1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label1.setBounds(25, 62, 83, 13);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Prénom");
		label2.setHorizontalAlignment(SwingConstants.RIGHT);
		label2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label2.setBounds(25, 92, 83, 13);
		contentPane.add(label2);
		
		prenom = new JTextField();
		prenom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		prenom.setColumns(10);
		prenom.setBounds(141, 89, 167, 19);
		contentPane.add(prenom);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMotDePasse.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMotDePasse.setBounds(10, 121, 98, 13);
		contentPane.add(lblMotDePasse);
		
		mdp = new JTextField();
		mdp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mdp.setColumns(10);
		mdp.setBounds(141, 118, 167, 19);
		contentPane.add(mdp);
		
		mdp2 = new JTextField();
		mdp2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mdp2.setColumns(10);
		mdp2.setBounds(141, 148, 167, 19);
		contentPane.add(mdp2);
		
		JLabel lblConfirmation = new JLabel("Confirmation ");
		lblConfirmation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmation.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirmation.setBounds(20, 151, 88, 13);
		contentPane.add(lblConfirmation);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nom.setText("");
				prenom.setText("");
				mdp.setText("");
				mdp2.setText("");
			}
		});
		btnAnnuler.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAnnuler.setBounds(211, 202, 97, 21);
		contentPane.add(btnAnnuler);
		
		JButton btnConfirmer = new JButton("Confirmer");
		btnConfirmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("bouton pressé");
				
			}
		});
		btnConfirmer.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConfirmer.setBounds(86, 202, 98, 21);
		contentPane.add(btnConfirmer);
		
		JLabel message = new JLabel("");
		message.setForeground(new Color(255, 102, 0));
		message.setFont(new Font("Tahoma", Font.PLAIN, 12));
		message.setBounds(41, 180, 267, 13);
		contentPane.add(message);
	}
}
