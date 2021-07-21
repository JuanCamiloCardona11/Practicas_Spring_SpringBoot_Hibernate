package j3c.dev.validacion;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodigoMatriculaValidacion 
	implements ConstraintValidator<CodigoMatricula, String> {

	private String prefijo;
	
	@Override
	public void initialize(CodigoMatricula codigoMatricula) {
		this.prefijo = codigoMatricula.value();
	}
	
	@Override
	public boolean isValid(String matriculaIngresada, ConstraintValidatorContext constraintValidatorContext) {
		//Dentro de este metodo podemos tener cualquier regla de validacion
		boolean result;
		if(matriculaIngresada != null) {
			result = matriculaIngresada.startsWith(this.prefijo);
		} else {
			result = true;
		}
		return result;
	}

}
