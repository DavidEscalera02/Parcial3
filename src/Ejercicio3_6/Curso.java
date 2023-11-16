package Ejercicio3_6;

public class Curso  {
    private List<Estudiante> estudiantes;

    public Curso() {
        this.estudiantes = new ArrayList();
    }

    public void anadirEstudiante() {
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = System.console().readLine();

        System.out.println("Ingrese los apellidos del estudiante:");
        String apellidos = System.console().readLine();

        System.out.println("Ingrese el código del estudiante:");
        String codigo = System.console().readLine();

        System.out.println("Ingrese el semestre del estudiante:");
        int semestre = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese la nota del estudiante:");
        double nota = Double.parseDouble(System.console().readLine());


        Set<String> codigosExistentes = new HashSet<>();
        for (Estudiante e : estudiantes) {
            codigosExistentes.add(e.getCodigo());
        }

        if (codigosExistentes.contains(codigo)) {
            System.out.println("El código del estudiante " + codigo + " ya existe");
            return;
        }

        Estudiante estudiante = new Estudiante(nombre, apellidos, codigo, semestre, nota);
        estudiantes.add(estudiante);
    }
    public Estudiante buscarEstudiante(String código) {
        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equals(código)) {
                return e;
            }
        }

        return null;
    }

    public void eliminarEstudiante(String codigo) {
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante e = estudiantes.get(i);
            if (e.getCodigo().equals(codigo)) {
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Apellidos: " + e.getApellidos());
                System.out.println("Código: " + e.getCodigo());
                System.out.println("Semestre: " + e.getSemestre());
                System.out.println("Nota: " + e.getNota());

                System.out.println("¿Desea eliminar al estudiante? (S/N)");
                String respuesta = System.console().readLine();
                if (respuesta.equals("S")) {
                    estudiantes.remove(i);
                    return;
                }
            }
        }
    }

    public double calcularPromedio() {
        double sumaNotas = 0;
        for (Estudiante e : estudiantes) {
            sumaNotas += e.getNota();
        }

        return sumaNotas / estudiantes.size();
    }

    public int obtenerCantidadAprobados() {
        int cantidadAprobados = 0;
        for (Estudiante e : estudiantes) {
            if (e.getNota() >= 3.0) {
                cantidadAprobados++;
            }
        }

        return cantidadAprobados;
    }

}
