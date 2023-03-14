package rpunzalan.careida.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rpunzalan.careida.entity.Member;
import rpunzalan.careida.entity.RideEvent;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
