package co.edu.intecap.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import co.edu.intecap.inventory.domain.Bodega;

@Transactional
public interface BodegaRepository extends CrudRepository<Bodega, String> {

}
