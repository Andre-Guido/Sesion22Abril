package ni.edu.uam;

import ni.edu.uam.modelos.Producto;
import ni.edu.uam.servicios.ProductoServicio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        productos.agregarProducto( "Cafe", 40, 3);
        productos.agregarProducto("Tajadas con queso", 60, 3);

        System.out.println("Factura:");
        System.out.println(productos.getProductos());
        System.out.println("Total a pagar: " + productos.getMonto());
        */
        ProductoServicio productos = new ProductoServicio();
         String menu = "Jaguar Coffee \n1. Agregar. \n2. Ver. \n3. Salir. \nOpción: ";
         String nombre, precio, cantidad, opcion = "0";
         do {
             opcion = JOptionPane.showInputDialog(null, menu);
             switch (opcion) {
                 case  "1" ->{
                 nombre =  JOptionPane.showInputDialog(null, "Nombre del Producto: ");
                 precio = JOptionPane.showInputDialog(null, "Precio del Producto: ");
                 cantidad = JOptionPane.showInputDialog(null, "Cantidad del Producto: ");
                 productos.agregarProducto(nombre, Double.parseDouble(precio), Integer.parseInt(cantidad));
                 }
                 case "2" ->{
                    JOptionPane.showMessageDialog(null, productos.getProductos());
                 }
                 case "3" ->{
                     JOptionPane.showMessageDialog(null, "Adiós.");
                 }
                 default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
             }

         }while (!opcion.equals("3"));
    }
}