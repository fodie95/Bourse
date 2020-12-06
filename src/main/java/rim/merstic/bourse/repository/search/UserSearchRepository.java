package rim.merstic.bourse.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import rim.merstic.bourse.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {}
