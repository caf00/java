package ar.alexdev.codoacodo.test;

import java.util.Objects;
import java.util.Scanner;

import ar.alexdev.codoacodo.test.filter.impl.FilterByAuthor;
import ar.alexdev.codoacodo.test.filter.impl.FilterByEditorial;
import ar.alexdev.codoacodo.test.filter.impl.FilterByIsbn;
import ar.alexdev.codoacodo.test.filter.impl.FilterByTitle;
import ar.alexdev.codoacodo.test.filter.impl.NoneFilter;
import ar.alexdev.codoacodo.test.repository.ArrayRepository;
import ar.alexdev.codoacodo.test.service.FindBookService;
import ar.alexdev.codoacodo.test.service.impl.FindBookServiceImpl;

public class Client {

    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        String opc = "";
        while(!Objects.equals(opc, "6")) {
            System.out.println("\n\n------------------------------------");
            System.out.println("| (1) Listar todos los libros      |");
            System.out.println("| (2) Filtrar por isbn             |");
            System.out.println("| (3) Filtrar libros por título    |");
            System.out.println("| (4) Filtrar libros por autor     |");
            System.out.println("| (5) Filtrar libros por editorial |");
            System.out.println("| (6) Salir                        |");
            System.out.println("------------------------------------");
            System.out.print("-- Ingrese una opción: ");
            opc = scanner.nextLine();
            if(Objects.equals(opc, "1")) listAllBooks(FindBookServiceImpl.newInstance(ArrayRepository.newInstance()));
            if(Objects.equals(opc, "2")) listBooksByIsbn(FindBookServiceImpl.newInstance(ArrayRepository.newInstance()));
            if(Objects.equals(opc, "3")) listBooksByTitle(FindBookServiceImpl.newInstance(ArrayRepository.newInstance()));
            if(Objects.equals(opc, "4")) listBooksByAuthor(FindBookServiceImpl.newInstance(ArrayRepository.newInstance()));
            if(Objects.equals(opc, "5")) listBooksByEditorial(FindBookServiceImpl.newInstance(ArrayRepository.newInstance()));
        }
    }

    private static void listBooksByIsbn(FindBookService findBookService) {
        System.out.print("\n-- Ingrese el isbn (o parte de él) del libro: ");
        String input = scanner.nextLine();
        System.out.println("-- Resultado de la búsqueda:");
        findBookService
            .execute(FilterByIsbn.newInstance(input))
            .forEach(System.out::println);
    }

    private static void listBooksByEditorial(FindBookService findBookService) {
        System.out.print("\n-- Ingrese el nombre de una editorial: ");
        String input = scanner.nextLine();
        System.out.println("-- Resultado de la búsqueda:");
        findBookService
            .execute(FilterByEditorial.newInstance(input))
            .forEach(System.out::println);
        
    }

    private static void listBooksByAuthor(FindBookService findBookService) {
        System.out.print("\n-- Ingrese el nombre del autor: ");
        String input = scanner.nextLine();
        System.out.println("-- Resultado de la búsqueda:");
        findBookService
            .execute(FilterByAuthor.newInstance(input))
            .forEach(System.out::println);
    }

    private static void listBooksByTitle(FindBookService findBookService) {
        System.out.print("\n-- Ingrese el título del libro: ");
        String input = scanner.nextLine();
        System.out.println("-- Resultado de la búsqueda:");
        findBookService
            .execute(FilterByTitle.newInstance(input))
            .forEach(System.out::println);
    }

    private static void listAllBooks(FindBookService findBookService) {
        System.out.println("-- Lista de libros:");
        findBookService
            .execute(NoneFilter.newIntance())
            .forEach(System.out::println);
    }
}
