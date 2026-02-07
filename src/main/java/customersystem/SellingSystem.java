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


    public static void main(String[] args) {

        createProducts();
        getProducts();
        System.out.println("ingrese el Id del producto a actualizar");
        int id = sc.nextInt();
        sc.nextLine();
        updateProducts(id);
        System.out.println("ingrese el Id del producto a actualizar");
        id = sc.nextInt();
        sc.nextLine();
        deletProducts(id);
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

    }

    public static void updateProducts(int finId){

        if (finId == id){
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
        }else{
            System.out.println("Producto no encontrado");
        }

    }

    public static void deletProducts(int finId){

        if (finId == id){

            id = 0;
            description = " ";
            price = 0.0;
            quantity= 0;
            state = false;

        }else {
            System.out.println("Producto no encontrado");
        }

    }

    // cliente : id, nombre, apellido, direccion, telefono, correo
}
