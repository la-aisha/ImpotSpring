package sn.groupeisi.regulationimpot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.groupeisi.regulationimpot.entities.Declarant;
import sn.groupeisi.regulationimpot.entities.Declaration;
import sn.groupeisi.regulationimpot.repositories.DeclarantRepository;
import sn.groupeisi.regulationimpot.repositories.DeclarationRepository;

import java.util.List;

@Service
public class DeclarantService {

    private DeclarantRepository declarantRepository;

    public DeclarantService(DeclarantRepository declarantRepository) {

        this.declarantRepository = declarantRepository;
    }

    public Declarant addDeclarant(Declarant declarant) {

        return declarantRepository.save(declarant);
    }

    public List<Declarant> getAllDeclarants() {

        return declarantRepository.findAll();
    }
}
