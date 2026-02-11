package customersystem;

import java.util.Scanner;

public class SellingSystem {

    static Scanner sc= new Scanner(System.in);

    // Product Atributees

    static int id;
    static String description;
    static double price;
    static int quantity;
    static boolean state;
    static int idCustomer;
    static String name;
    static String lastName;
    static String direction;
    static long phone;
    static String email;


    public static void main(String[] args) {

        String respuesta;
        createProducts();
        getProducts();
        while (true){
            System.out.println("¿desea actualizar algun producto? (Si/NO)");
            respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("si")){
                System.out.println("ingrese el Id del producto a actualizar");
                id = sc.nextInt();
                sc.nextLine();
                updateProducts(id);
            } else if (respuesta.equals("no")) {
                break;
            }
            else {
                System.out.println("Respuesta invalida. Escriba si o no.");
            }
        }
        while (true){
            System.out.println("¿Desea eliminar algun producto? (Si/NO) ");
            respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("si")){
                System.out.println("Ingrese el Id del producto que desea eliminar");
                id = sc.nextInt();
                sc.nextLine();
                deletProducts(id);
            } else if (respuesta.equals("no")) {
                break;
            }
            else {
                System.out.println("Respuesta invalida. Escriba si o no.");
            }
        }

        createCustomer();
        getCustomer();
        while (true){
            System.out.println("¿desea actualizar algun cliente? (Si/NO)");
            respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("si")){

                System.out.println("ingrese el Id del cliente a actualizar");
                int idCustomer = sc.nextInt();
                sc.nextLine();
                updateCustomer(idCustomer);
            } else if (respuesta.equals("no")) {
                break;
            }
            else {
                System.out.println("Respuesta invalida. Escriba si o no.");
            }
        }
        while (true){
            System.out.println("¿Desea eliminar un cliente? (Si/NO)");
            respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("si")){
                System.out.println("Ingrese el Id del cliente para eliminar");
                idCustomer =sc.nextInt();
                sc.nextLine();
                deleteCustomer(idCustomer);
            } else if (respuesta.equals("no")) {
                break;
            }
            else {
                System.out.println("Respuesta invalida. Escriba si o no.");
            }
        }
    }

    // Class Methods

    public static void createProducts(){

        System.out.println("Ingrese el Id del producto");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre del producto");
        description = sc.nextLine();
        System.out.println("Ingrese el precio del producto");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese la cantidad");
        quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el estado del producto");
        state = sc.nextBoolean();

    }

    public static void getProducts(){

        System.out.println("Id: " + id + "\n" +
                "Desciption: " + description + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + quantity + "\n" +
                "State: " + price + "\n");

        sc.nextLine();

    }

    public static void updateProducts(int finId){

        if (finId == id){

            System.out.println("Ingrese el nombre del producto");
            description = sc.nextLine();
            System.out.println("Ingrese el precio del producto");
            price = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la cantidad");
            quantity = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el estado del producto");
            state = sc.nextBoolean();
        }else{
            System.out.println("Producto no encontrado");
        }

        sc.nextLine();

    }

    public static void deletProducts(int finId){

        if (finId == id){
            System.out.println("id = 0;\n" +
                    "            description = \" \";\n" +
                    "            price = 0.0;\n" +
                    "            quantity= 0;\n" +
                    "            state = false;");

        }else {
            System.out.println("Id " + id + " no encontrado");
        }

    }

    // cliente : id, nombre, apellido, direccion, telefono, correo

     public static void createCustomer(){

         System.out.println("Ingrese el Id del cliente (Puede ser la identificación)");
         idCustomer = sc.nextInt();
         sc.nextLine();
         System.out.println("Ingrese el nombre del cliente");
         name = sc.nextLine();
         System.out.println("Ingrese el apellido del cliente");
         lastName = sc.nextLine();
         System.out.println("Ingrese al direccion del cliente");
         direction = sc.nextLine();
         System.out.println("Ingrese el telefono del cliente");
         phone = sc.nextLong();
         sc.nextLine();
         System.out.println("ingrese el correo electronico del cliente");
         email = sc.nextLine();

     }

     public static void getCustomer(){

         System.out.println("Id cliente: " + idCustomer + "\n" +
                            "Nombre Cliente: " + name + "\n" +
                            "Apellido: " + lastName + "\n" +
                            "Dirección: " + direction + "\n" +
                            "telefono: " + phone + "\n" +
                            "Correo electronico: " + email + "\n");

     }

     public static void updateCustomer(int findId){

        if (findId == idCustomer){
            System.out.println("Ingrese el nombre del cliente");
            name = sc.nextLine();
            System.out.println("Ingrese el apellido del cliente");
            lastName = sc.nextLine();
            System.out.println("Ingrese al direccion del cliente");
            direction = sc.nextLine();
            System.out.println("Ingrese el telefono del cliente");
            phone = sc.nextLong();
            sc.nextLine();
            System.out.println("ingrese el correo electronico del cliente");
            email = sc.nextLine();
        }else {
            System.out.println("cliente no encontrado");
        }

        sc.nextLine();
     }

     public static void deleteCustomer(int finId){

        if (finId == idCustomer){
            System.out.println("idCustomer = 0;\n" +
                    "            name = \" \";\n" +
                    "            lastName = \" \";\n" +
                    "            direction = \" \";\n" +
                    "            phone = 0;\n" +
                    "            email = \" \";");

        }else {
            System.out.println("Id " + idCustomer + " no encontrado");
        }
     }


}
