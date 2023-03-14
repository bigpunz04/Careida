package rpunzalan.careida.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import rpunzalan.careida.entity.RideEvent;
import rpunzalan.careida.entity.SupplyPickupEvent;

@NoRepositoryBean
public interface SupplyPickupEventRepository extends JpaRepository<SupplyPickupEvent, Long> {
}


