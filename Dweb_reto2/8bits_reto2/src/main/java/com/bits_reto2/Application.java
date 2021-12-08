package com.bits_reto2;

import com.bits_reto2.Repository.CrudRepository.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Application  implements CommandLineRunner{

    @Autowired
	private UserCrudRepository userRepo;
    
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
        
        @Override
	public void run(String... args) throws Exception {
		userRepo.deleteAll();															//Para que la base de datos se borre por cada ejecución

		/**
		userRepo.saveAll(List.of(														//Crear listado de usuarios, despues de insertarlos
			 la loca", "Calle falsa 123",  "32274986", "juanalaloca@gmail.com", "juana123", "ZONA 1", "ADM"),
			new User(2, "9546646", "Juan el loca", "Carrera falsa 123",  "32145698", "juanelloco@gmail.com", "juan123", "ZONA 1", "COOR")
		));

		System.out.println("Listado de usuarios");
		userRepo.findAll().forEach(System.out::println);

		Optional<User> usuario = userRepo.findByEmail("juanalaloca@gmail.com");

		if(usuario.isPresent()) {
			System.out.println("Datos del usuario" + usuario.get());
		}

		Optional<User> usuarioDos = userRepo.findByEmailAndPassword("juanalaloca@gmail.com", "juana123");

		if(usuarioDos.isPresent()) {
			System.out.println("Datos del usuario" + usuarioDos.get());
		}
		 */
	}

}
