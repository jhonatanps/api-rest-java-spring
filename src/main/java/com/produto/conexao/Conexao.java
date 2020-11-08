package com.produto.conexao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Conexao {
	public static Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream(
				"./src/main/java/config");
		props.load(file);
		return props;

	}
	
	public static void  main(String args[]) throws IOException {
		String login; //Variavel que guardará o login do servidor.
		String url; //Variavel que guardará o host do servidor.
		String password; //Variável que guardará o password do usúario.
		System.out.println("************Teste de leitura do arquivo de propriedades************");

		Properties prop = getProp();

		login = prop.getProperty("prop.server.login");
		url = prop.getProperty("prop.server.url");
		password = prop.getProperty("prop.server.password");

		System.out.println("Login = " + login);
		System.out.println("URL = " + url);
		System.out.println("Password = " + password);
	}


}
