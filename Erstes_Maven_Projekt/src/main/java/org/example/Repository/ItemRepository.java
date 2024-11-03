package org.example.Repository;

import org.example.tableclasses.item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort;
import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<item, Long> {
    List<item> findAll(Sort sort);
}
