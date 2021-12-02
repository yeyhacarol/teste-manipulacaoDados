package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.sp.jandira.arquivo.Arquivo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;

	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblManipularArq = new JLabel("Manipulação de Arquivos");
		lblManipularArq.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblManipularArq.setBounds(10, 11, 191, 30);
		contentPane.add(lblManipularArq);

		JLabel lblSeuTexto = new JLabel("Texto:");
		lblSeuTexto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSeuTexto.setBounds(10, 52, 46, 14);
		contentPane.add(lblSeuTexto);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 77, 191, 173);
		contentPane.add(scrollPane);

		JTextPane txtPane = new JTextPane();
		txtPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane.setViewportView(txtPane);

		JButton btnGravar = new JButton("Gravar");
		btnGravar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGravar.setBounds(211, 77, 115, 40);
		contentPane.add(btnGravar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLimpar.setBounds(211, 128, 115, 40);
		contentPane.add(btnLimpar);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSair.setBounds(211, 179, 115, 40);
		contentPane.add(btnSair);
		
		
		Arquivo novoArq = new Arquivo();
		
		btnGravar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				novoArq.gravar("C:\\Users\\21276093\\Desktop\\Teste\\testando.txt", txtPane.getText());
				
				novoArq.ler("C:\\Users\\21276093\\Desktop\\Teste\\testando.txt");
				
				
				
				
				
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				txtPane.setText("");
				
			}
		});
		
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		
		
	}
	
}

	
