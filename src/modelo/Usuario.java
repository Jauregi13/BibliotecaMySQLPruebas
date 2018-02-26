package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
	
	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	private Date fecha_nacimiento;
	private int cuota;
	private ArrayList<Prestamo> prestamos;
	
	
	
	
	public float getCuota() {
		return cuota;
	}
	public void setCuota(int cuota) {
		this.cuota = cuota;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	
	public int calcularCuota(int edad){
		if(edad < 18){
			this.cuota = 10;
			return this.cuota;
		}
		else if(edad >= 18 && edad < 25){
			this.cuota = 15;
			return this.cuota;
		}
		else if(edad >=25 && edad < 65){
			this.cuota = 20;
			return this.cuota;
		}
		else{
			this.cuota = 10;
			return this.cuota;
		}
	}
	

}
