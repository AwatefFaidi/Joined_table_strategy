package org.sid.joined.dao;
import org.sid.joined.model.Infantry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface InfantryRepository extends CrudRepository<Infantry, Long> {

}
