package rpunzalan.careida.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import rpunzalan.careida.entity.CareEvent;

@NoRepositoryBean
public interface CareEventRepository extends CrudRepository<CareEvent, Long> {
}
