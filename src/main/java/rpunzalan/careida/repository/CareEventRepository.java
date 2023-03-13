package rpunzalan.careida.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import rpunzalan.careida.entity.CareEvent;

@NoRepositoryBean
public interface CareEventRepository extends JpaRepository<CareEvent, Long> {

}
