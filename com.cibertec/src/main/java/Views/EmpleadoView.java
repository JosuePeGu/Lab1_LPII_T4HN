package Views;

import controllers.EmpleadoController;
import models.Empleado;

public class EmpleadoView {

	public static void main(String[] args) {
		
		//String empleado = new EmpleadoController().createEmpleado("Torres", "Armando", 18, "M", 1000);
		//String empleado = new EmpleadoController().createEmpleado("Brito", "Alan", 19, "M", 2000);
		String empleado = new EmpleadoController().createEmpleado("Huncachoclo", "Juanito", 20, "M", 3000);
		System.out.println(empleado);
		//String empleado = new EmpleadoController().createEmpleado("Pe;a", "Gerardo", 16, "M", 10);
		
		//String empleado = new EmpleadoController().deleteEmpleado(1);
		
		//String empleado = new EmpleadoController().updateEmpleado(2,"Peña", "Gerardo", 21, "M", 5000);
		
	}

}
