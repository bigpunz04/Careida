package rpunzalan.careida.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import rpunzalan.careida.entity.RideEvent;

@Repository
public interface RideEventRepository extends JpaRepository<RideEvent, Long> {
}
