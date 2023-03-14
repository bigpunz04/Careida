package rpunzalan.careida.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import rpunzalan.careida.entity.RideEvent;

@NoRepositoryBean
public interface RideEventRepository extends JpaRepository<RideEvent, Long> {
}
