package pl.rlnkoo.memegeneratorspringapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.rlnkoo.memegeneratorspringapp.models.MemeItem;

@Repository
public interface MemeItemRepository extends CrudRepository<MemeItem, Long> {
}
