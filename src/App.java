public class App {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("70767533", "Rudy Minaya Vilchez", 28, 1.84, 95.0, "B+", "San Juan de Miraflores", "04/04/2021");
        Paciente p2 = new Paciente("87870101", "Carlos Vargas Anaya", 20, 1.72, 105.0, "O+", "Cercado de Lima", "04/04/2021");
        Paciente p3 = new Paciente("08742174", "Diana Flores Olivares", 32, 1.70, 65.0, "O-", "San Isidro", "04/04/2021");
        Paciente p4 = new Paciente("10982100", "Enrique Morales Santos", 45, 1.65, 78.0, "A+", "Miraflores", "04/04/2021");

        Sistema clinica = new Sistema();
        clinica.registrar(p1);
        clinica.registrar(p2);
        clinica.registrar(p3);
        clinica.registrar(p4);
        clinica.listar();
        clinica.listarObesos();

    }
}
