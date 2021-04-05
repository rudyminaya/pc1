import java.util.ArrayList;

public class Sistema {

    ArrayList<Paciente> pacientes;

    public Sistema(){
        this.pacientes = new ArrayList<Paciente>();
    }

    void registrar(Paciente datosPaciente){
        pacientes.add(datosPaciente);
    }
    void listar(){
        for (int i = 0; i<pacientes.size(); i++){
            System.out.println("\nDNI: " + pacientes.get(i).getDni() + " - " + pacientes.get(i).getNombres());
            System.out.println(" Edad: " + pacientes.get(i).getEdad() + " - Altura: " + pacientes.get(i).getAltura() + "m - Peso: " + pacientes.get(i).getPeso() + " - Sangre: " + pacientes.get(i).getTipoSangre() + " - Distrito: " + pacientes.get(i).getDistrito());
            System.out.println("Se obtiene el valor del IMC de " + pacientes.get(i).getImc() + " y un Peso Corporal de " + pacientes.get(i).getPesoCorporal());
        }
    }

    void listarObesos(){
        System.out.println("\n||========== LISTA DE PERSONAS CON OBESIDAD ==========||\n");
        for (int i = 0; i<pacientes.size(); i++){
            if(pacientes.get(i).getPesoCorporal() == "Obesidad"){
            System.out.println("\nDNI: " + pacientes.get(i).getDni() + " - " + pacientes.get(i).getNombres());
            System.out.println(" Edad: " + pacientes.get(i).getEdad() + " - Altura: " + pacientes.get(i).getAltura() + "m - Peso: " + pacientes.get(i).getPeso() + " - Sangre: " + pacientes.get(i).getTipoSangre() + " - Distrito: " + pacientes.get(i).getDistrito());
            System.out.println("Se obtiene el valor del IMC de " + pacientes.get(i).getImc() + " y un Peso Corporal de " + pacientes.get(i).getPesoCorporal());
            }
        }
    }
}
