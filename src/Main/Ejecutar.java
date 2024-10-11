
package Main;

import Objetos.Medicamento;
import Objetos.Medicamento.Posología;

public class Ejecutar {
        
    public static void main(String[] args) {
        Medicamento medicamento = new Medicamento(
                "Aspirina",
                "Bayer",
                "Oral");
        System.out.println(medicamento.toString());
        
        Medicamento.Posología info = medicamento.new Posología(
                "Adultos y mayores de 16 años",
                "500 mg", " 6 horas",
                "No puede tomar este medicamento con el estomago vacío");
        System.out.println(info.toString());
    }
}
