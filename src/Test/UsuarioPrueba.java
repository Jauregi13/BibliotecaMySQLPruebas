package Test;

import java.sql.SQLException;

import modelo.Usuario;

public class UsuarioPrueba {
	
	public int calcularCuota(int id_usuario) throws SQLException{
		MockUsuario conexionFicticia = new MockUsuario(false);
		
		try{
			Usuario usuario = conexionFicticia.selectPorId(id_usuario);
			
			if(usuario == null){
				throw new SQLException ("El usuario no existe");
			}
			
			return usuario.calcularCuota(usuario.getEdad());
		}
		catch(SQLException e){
			
		}
		
		
		return 0;
	}

}