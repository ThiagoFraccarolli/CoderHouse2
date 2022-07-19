package edu.coderhouse.Jpaproyect.repository;

import edu.coderhouse.Jpaproyect.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Cliente,Integer> {

}
