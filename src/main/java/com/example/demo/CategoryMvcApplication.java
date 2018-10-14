package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.entitie.Produit;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.web"})
public class CategoryMvcApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(CategoryMvcApplication.class, args);
		/*ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
		produitRepository.save(new Produit("HP RAM 4",1000.00, 100));
		produitRepository.save(new Produit("TOSHIBA RAM 4",1000.00, 100));
		produitRepository.save(new Produit("HP RAM 8",1000.00, 100));
		produitRepository.save(new Produit("TOSHIBA RAM 8",1000.00, 100));
		
		produitRepository.findAll().forEach(p->System.out.println(p.getDesignation()));*/
	}
}
