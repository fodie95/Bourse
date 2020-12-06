package rim.merstic.bourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rim.merstic.bourse.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
