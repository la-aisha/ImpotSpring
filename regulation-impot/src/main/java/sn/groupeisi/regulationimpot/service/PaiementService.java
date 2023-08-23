package sn.groupeisi.regulationimpot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import sn.groupeisi.regulationimpot.entities.Paiement;
import sn.groupeisi.regulationimpot.repositories.PaiementRepository;

import java.util.List;

@Service
public class PaiementService {

    private PaiementRepository paiementRepository;

    public PaiementService(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    public Paiement addPaiement(Paiement paiement){
        return this.paiementRepository.save(paiement);
    }

    public List<Paiement> getAllPaiements(){
        return this.paiementRepository.findAll();
    }
}
