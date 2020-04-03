package wiredrtn.demo.Domain.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SubscriberRepository extends JpaRepository<Subscriber,Long> {
}
