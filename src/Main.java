import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import modelo.Usuario;
import modelo.UsuarioModelo;
import vista.BibliotecaVista;
import vista.UsuarioVista;

public class Main {

	public static void main(String[] args) {
		
		BibliotecaVista menu_biblioteca = new BibliotecaVista();
		
		menu_biblioteca.menuBiblioteca();

	}

}
