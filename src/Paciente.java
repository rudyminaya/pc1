public class Paciente {
    public Paciente(String dni, String nombres, int edad, Double altura, Double peso, String tipoSangre, String distrito, String fecha) {
        this.dni = dni;
        this.nombres = nombres;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.distrito = distrito;
        this.fecha = fecha;
    }
    String dni;
    String nombres;
    int edad;
    Double altura;
    Double peso;
    String tipoSangre;
    String distrito;
    String fecha;
    
    public Double getImc(){
        Double imc = peso / Math.pow(altura,2);
        return imc;
    }
    public String getPesoCorporal(){
        String pesoCorporal = "";
        if (getImc() < 18.5){
            pesoCorporal = "Bajo peso";
        }
        else if (getImc() >= 18.5 && getImc()<25){
            pesoCorporal = "Peso Normal";
        }
        else if (getImc() >= 25 && getImc()<30){
            pesoCorporal = "Sobrepeso";
        }
        else{
            pesoCorporal = "Obesidad";
        }
        return pesoCorporal;
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public int getEdad() {
        return edad;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getFecha() {
        return fecha;
    }
}
