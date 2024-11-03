package org.example.Service;


import org.example.Repository.BuyingCompanysRepository;
import org.example.tableclasses.Buyingcompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class buying_companies_Service {

    @Autowired
    private BuyingCompanysRepository buyingCompanysRepository;

    public List<Buyingcompany> getAllBuying_companys() {
        return buyingCompanysRepository.findAll();
    }

    public Buyingcompany saveBuying_companys(Buyingcompany buying_companys) {
        return buyingCompanysRepository.save(buying_companys);
    }

    public Optional<Buyingcompany> getBuying_companysById(Long id) {
        return buyingCompanysRepository.findById(id);
    }

    public void deleteBuying_companys(Long id) {
        buyingCompanysRepository.deleteById(id);
    }
}
