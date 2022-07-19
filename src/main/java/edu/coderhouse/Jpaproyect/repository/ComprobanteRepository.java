package edu.coderhouse.Jpaproyect.repository;

import edu.coderhouse.Jpaproyect.model.Comprobante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprobanteRepository extends JpaRepository<Comprobante, Integer> {
}
