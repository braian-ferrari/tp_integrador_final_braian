package ar.com.codoacodo.repository;

import java.time.LocalDate;
import java.util.List;

import ar.com.codoacodo.entity.Orador;


public class MainOradorRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Interface i = new ClaseQueImplementa();
		 OradorRepository repository = new MySqlOradorRepository();
		 
		 /*save*/
		 //Orador newOrador = new Orador("fernando", "lugones", "ferlugones@email.com", "java", LocalDate.now());
		 //repository.save(newOrador);
		 
		 /*getById*/
		 //Orador newOrador = repository.getById(3L);
		 //System.out.println(newOrador);
		 
		 /*findAll*/
		 //repository.save(new Orador("juan", "perez", "jua@mail.com", "php", LocalDate.now()));
		 
		 /*delete elimino a Juan*/
		 //repository.delete(4L);
		 //List<Orador> listado = repository.findAll();
		 //System.out.println(listado);
		 
		 Orador carlos =repository.getById(3L);
		 
		 carlos.setApellido("perez");
		 carlos.setNombre("martin");
		 carlos.setTema("c#");
		 
		 repository.update(carlos);
		 
		 System.out.println(repository.findAll());
		 
	}

	

}
