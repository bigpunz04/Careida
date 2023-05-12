package rpunzalan.careida.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;
import rpunzalan.careida.entity.CareEvent;
import rpunzalan.careida.entity.RideEvent;

//@Component("careEventRepository")
@NoRepositoryBean
public interface CareEventRepository extends JpaRepository<RideEvent, Long> {

}
