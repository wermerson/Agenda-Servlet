package br.com.service;

import java.util.ArrayList;

import br.com.model.Contato;
import br.com.model.Usuario;

public class Database {
	public static ArrayList<Contato> contatos = new ArrayList<Contato>();
	public static ArrayList<Contato> contatosUser = new ArrayList<Contato>();
	public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	//public static ArrayList<Contato> getContatos() {
		
	//}
	
	public static boolean checkUsuarioCadastrado(String email) {
		for (Usuario usuario : Database.usuarios) {
            if (usuario.getEmail().equals(email)) {
            	return true;
            }
        }
		return false;
	}
	
	public static void initUser() {
		if (!Database.checkUsuarioCadastrado("wermersonwca@gmail.com")) {
			Usuario novoUsuario = new Usuario();
			novoUsuario.setNome("Wermerson Washington");
			novoUsuario.setEmail("wermersonwca@gmail.com");
			novoUsuario.setTelefone("83999118089");
			novoUsuario.setEndereco("Rua 123");
			novoUsuario.setSenha("wermerson123");
			Database.usuarios.add(novoUsuario);
		}
	}
	
	public static void updateContatosUser(String emailUser) {
		Database.contatosUser = new ArrayList<Contato>();
		for (Contato contatoCadastrado : Database.contatos) {
            if (contatoCadastrado.getEmailUser().equals(emailUser)) {
            	Database.contatosUser.add(contatoCadastrado);
            }
        }
	}
}
