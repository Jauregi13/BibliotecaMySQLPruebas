package Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import modelo.Usuario;

public class MockUsuario {
	
	ArrayList<Usuario> usuarios;
	boolean fallo_conexion;

	public MockUsuario(boolean fallo_conexion) {
		usuarios = new ArrayList<Usuario>();
		this.fallo_conexion = fallo_conexion;

	}

	public void compruebaConexion() throws SQLException {

		if (fallo_conexion) {
			throw new SQLException("Fallo al conectar con BD");
		}

	}

	public void insertarUsuario(Usuario usuario) throws SQLException {

		this.compruebaConexion();
		if(this.selectPorId(usuario.getId()) == null){
			usuarios.add(usuario);
		}
		else{
			throw new SQLException("El usuario ya existe");
		}
	}
	
	public void deleteUsuario(int id_usuario) throws SQLException{
		
		this.compruebaConexion();
		Usuario usuario = this.selectPorId(id_usuario);
		if(usuario == null){
			throw new SQLException("El usuario no existe");
		}
		else{
			this.usuarios.remove(usuario);
		}
	}
	
	public Usuario selectPorId(int id_usuario) throws SQLException{
		
		this.compruebaConexion();
		Iterator<Usuario> i = usuarios.iterator();
		
		while(i.hasNext()){
			Usuario usuario = i.next();
			
			if(usuario.getId() == id_usuario){
				return usuario;
			}
		}
		return null;
	}
	
	
	
	
	public ArrayList<Usuario> selectUsuario() throws SQLException{
		
		this.compruebaConexion();
		return usuarios;
	}

}
