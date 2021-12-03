package br.senai.sp.jandira.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.sp.jandira.arquivo.Arquivo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Frame extends JFrame {

	private JPanel contentPane;
	// private Arquivo arquivo = null;
	// private String caminho = "";

	public Frame() {

		// this.arquivo = new Arquivo();
		// caminho = "C:\\Users\\21276093\\Desktop\\Teste\\testando.txt";

		setBackground(new Color(0, 0, 0));
		setForeground(new Color(0, 0, 0));
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 370);
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

		JScrollPane scrollPaneConteudo = new JScrollPane();
		scrollPaneConteudo.setBounds(10, 77, 191, 173);
		contentPane.add(scrollPaneConteudo);

		JTextPane txtConteudo = new JTextPane();
		scrollPaneConteudo.setViewportView(txtConteudo);
		txtConteudo.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JButton btnGravar = new JButton("Gravar");
		btnGravar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGravar.setBounds(211, 77, 115, 40);
		contentPane.add(btnGravar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLimpar.setBounds(211, 128, 115, 40);
		contentPane.add(btnLimpar);

		JButton btnSair = new JButton("Sair");

		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSair.setBounds(211, 179, 115, 40);
		contentPane.add(btnSair);

		JLabel lblHistorico = new JLabel("Histórico:");
		lblHistorico.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHistorico.setBounds(336, 54, 75, 14);
		contentPane.add(lblHistorico);

		JScrollPane scrollHistorico = new JScrollPane();
		scrollHistorico.setBounds(336, 77, 191, 173);
		contentPane.add(scrollHistorico);

		JTextPane txtHistorico = new JTextPane();
		txtHistorico.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtHistorico.setEditable(false);
		scrollHistorico.setViewportView(txtHistorico);


		Arquivo novoArq = new Arquivo();
		String caminho = "C:\\Users\\21276093\\Desktop\\Teste\\testando.txt";

		btnGravar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String arquivo = novoArq.ler(caminho) + txtConteudo.getText();

				novoArq.gravar(caminho, arquivo);

				novoArq.ler(caminho);

				txtHistorico.setText(novoArq.ler(caminho));

				// String textoArquivo = arquivo.ler(caminho);
				// String texto = textoArquivo + txtConteudo.getText();
				// arquivo.gravar(caminho, texto);

				/*if (novoArq.gravar(caminho, arquivo)) {

					JOptionPane.showMessageDialog(null, "Gravado com sucesso!", "GRAVAÇÃO",
							JOptionPane.INFORMATION_MESSAGE);

				} else {

					JOptionPane.showMessageDialog(null, "Erro na gravação!", "GRAVAÇÃO", JOptionPane.ERROR_MESSAGE);

				}*/

			}
		});

		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				txtConteudo.setText("");
				txtHistorico.setText("");

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

//códigos comentados são a solução dele
