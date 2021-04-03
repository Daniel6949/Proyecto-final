package models;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Santiago Mendez
 */
public class TransportistaValidation implements Validator{

    /**
     *
     * @param type
     * @return
     */
    @Override
    public boolean supports(Class<?> type) {
        return Transportista.class.isAssignableFrom(type);
    }

    /**
     *
     * @param o
     * @param errors
     */
    @Override
    public void validate(Object o, Errors errors) {
        Transportista transportista = (Transportista)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Id", 
                "requiered.Id",
                "El campo Id es obligatorio...");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Placa", 
                "requiered.Placa",
                "El campo Placa es obligatorio...");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Nombre", 
                "requiered.Nombre",
                "El campo Nombre es obligatorio...");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Apellido", 
                "requiered.Apellido",
                "El campo Apellido es obligatorio...");
        
         ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "telefono", 
                "requiered.telefono",
                "El campo telefono es obligatorio...");
    }
  
}

