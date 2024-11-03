package org.example.Repository;

import org.example.tableclasses.Buyingcompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort;
import java.util.List;

@Repository
public interface BuyingCompanysRepository extends JpaRepository<Buyingcompany, Long> {
    List<Buyingcompany> findAll(Sort sort);
}