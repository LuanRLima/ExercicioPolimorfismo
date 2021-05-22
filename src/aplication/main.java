package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Importedproduct;
import entities.Product;
import entities.UsedProduct;

public class main {
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list =  new ArrayList<Product>();
		
		System.out.print("Enter the number of products: ");
		int qtdeProducts = sc.nextInt();
		for(int a = 0 ;a < qtdeProducts; a++) {
			System.out.print("Product #"+ (a+1) + " data");
			System.out.print("Common, used or imported (c/u/i)? ");
			char answer = sc.next().charAt(0);
			if(answer == 'c' || answer == 'C') {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				Product product = new Product(name, price);
				list.add(product);
				
			}else if(answer == 'u' || answer == 'U') {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY):");
				sc.nextLine();
				String manufactureDate =  sc.next();
				UsedProduct product = new UsedProduct(name, price, manufactureDate);
				list.add(product);
				
			}else if(answer == 'i' || answer == 'I') {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				Double customsFee =  sc.nextDouble();
				Importedproduct product = new Importedproduct(name, price, customsFee);
				list.add(product);
			}
		}
		System.out.println("\nPRICE TAGS:");
		for (Product product : list) {
			System.out.println(product.priceTag());
			
		}
		sc.close();
	}
}
