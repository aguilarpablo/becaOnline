package edu.es.eoi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import edu.es.eoi.dto.ProductDto;
import edu.es.eoi.dto.UserDto;

public class Shop {

	public static void main(String[] args) {
		
		//final HttpHeaders headers = new HttpHeaders();
		RestTemplate restTemplate= new RestTemplate();
		final String urlGateway = "http://localhost:8080";
		final String urlUsers = urlGateway.concat("/micro-user/users");
		final String urlProducts = "http://localhost:8080/micro-product/products";
		//final String urlOrders = "http://localhost:8080/micro-order/orders";
		
		//Listado productos
		
		ResponseEntity<ProductDto[]> response = restTemplate.
				getForEntity(urlProducts, ProductDto[].class);
		
		ProductDto[] products = response.getBody();
		
		System.out.println(products.length);
		
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
		}
		
		ResponseEntity<UserDto[]> users = restTemplate.
				getForEntity(urlUsers, UserDto[].class);
		
		System.out.println(users.getBody().length);
		
	}

}
