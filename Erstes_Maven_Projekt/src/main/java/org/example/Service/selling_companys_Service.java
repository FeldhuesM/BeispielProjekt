package org.example.Service;


import org.example.Repository.SellingCompanysRepository;
import org.example.tableclasses.Sellingcompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class selling_companys_Service {

    @Autowired
    private SellingCompanysRepository sellingCompanysRepository;

    public List<Sellingcompany> getAllSelling_companys() {
        return sellingCompanysRepository.findAll();
    }

    public Sellingcompany saveSelling_companys(Sellingcompany selling_companys) {
        return sellingCompanysRepository.save(selling_companys);
    }

    public Optional<Sellingcompany> getSelling_companysById(Long id) {
        return sellingCompanysRepository.findById(id);
    }

    public void deleteSelling_companys(Long id) {
        sellingCompanysRepository.deleteById(id);
    }
}
