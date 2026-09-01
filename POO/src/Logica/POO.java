package Logica;

public class POO {

    public static void  main (String[] args) {
        

        Alumno alu1 = new Alumno ();
        Alumno alu2 = new Alumno ("Rodriguez", 15 ,"Raul");

        System.out.println("El nmbre del alumno es"+ alu2.getNombre());
        System.out.println("El nmbre del apellido es"+ alu2.getApellido());
        System.out.println("El id del alumno es"+ alu2.getId());

        alu1.setId(8);
        alu1.setNombre("papa");
        alu1.setApellido("mama");


        System.out.println("El nmbre del alumno es"+ alu1.getNombre());
        System.out.println("El nmbre del apellido es"+ alu1.getApellido());
        System.out.println("El id del alumno es"+ alu1.getId());
    }
}