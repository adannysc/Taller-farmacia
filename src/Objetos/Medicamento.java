
package Objetos;

public class Medicamento {
  
    private String nombre;
    private String fabricante;
    private String via_consumo;

    public Medicamento(String nombre, String fabricante, String via_consumo) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.via_consumo = via_consumo;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre del medicamento = ").append(nombre);
        sb.append("\nfabricante del medicamento = ").append(fabricante);
        sb.append("\nVia de administracion = ").append(via_consumo);
        return sb.toString();
    }
    
    public class Posología{
        private String usuario;
        private String dosis;
        private String tiempo;
        private String recomendacion;

        public Posología(String usuario, String dosis, String tiempo, String recomendacion) {
            this.usuario = usuario;
            this.dosis = dosis;
            this.tiempo = tiempo;
            this.recomendacion = recomendacion;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("\nUsuario = ").append(usuario);
            sb.append("\nDosis = ").append(dosis);
            sb.append("\nPeriodo = ").append(tiempo);
            sb.append("\nRecomemdaciones = ").append(recomendacion);
            return sb.toString();
        }  
    }      
}
