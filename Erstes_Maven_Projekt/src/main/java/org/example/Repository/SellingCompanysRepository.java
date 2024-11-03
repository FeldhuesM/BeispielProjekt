package org.example.Repository;

import org.example.tableclasses.Sellingcompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort;
import java.util.List;

@Repository
public interface SellingCompanysRepository extends JpaRepository<Sellingcompany, Long> {
    List<Sellingcompany> findAll(Sort sort);
}