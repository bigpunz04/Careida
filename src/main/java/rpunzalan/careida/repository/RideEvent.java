package rpunzalan.careida.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface RideEvent extends CrudRepository<rpunzalan.careida.entity.RideEvent, Long> {


}
