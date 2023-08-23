package sn.groupeisi.regulationimpot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.groupeisi.regulationimpot.entities.Declaration;
import sn.groupeisi.regulationimpot.repositories.DeclarationRepository;

import java.util.List;

@Service
public class DeclarationService {

    private DeclarationRepository declarationRepository;

    public DeclarationService(DeclarationRepository declarationRepository) {
        this.declarationRepository = declarationRepository;
    }

    public Declaration addDeclaration(Declaration declaration){
        return this.declarationRepository.save(declaration);
    }

    public List<Declaration> getAllDeclarations(){
        return this.declarationRepository.findAll();
    }
}
