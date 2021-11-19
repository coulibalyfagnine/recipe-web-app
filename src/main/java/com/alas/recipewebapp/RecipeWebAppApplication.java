package com.alas.recipewebapp;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
//@EntityScan(basePackages = {"com.alas.recipewebapp", "com.alas.recipewebapp.domain"})
public class RecipeWebAppApplication implements CommandLineRunner {
	
	
	public static void main(String[] args) {
		SpringApplication.run(RecipeWebAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("recipe application by Fagninovic !+!-!");
		/*
		Recipe placali = new Recipe();
		placali.setDescription("placali à rue princess");
		recipeRepository.save(placali);
		*/
		
		
	}

}
