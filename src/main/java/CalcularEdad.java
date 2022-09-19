
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Damián Sasia Ybar
 */
public class CalcularEdad {
    public long getEdad (String fechaNac){ 
        LocalDate fechaNacimiento = LocalDate.parse(fechaNac);
        Temporal fechaNacmiento = null;
        long edad = ChronoUnit.YEARS.between (fechaNacmiento, LocalDate.now());
        return edad;
    }
    
}
