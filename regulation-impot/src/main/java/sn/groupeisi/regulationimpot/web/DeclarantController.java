package sn.groupeisi.regulationimpot.web;


import org.springframework.web.bind.annotation.*;
import sn.groupeisi.regulationimpot.entities.Declarant;
import sn.groupeisi.regulationimpot.repositories.DeclarantRepository;
import sn.groupeisi.regulationimpot.service.DeclarantService;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "declarants")


public class DeclarantController {

    private DeclarantService declarantService;

    public DeclarantController(DeclarantService declarantService) {

        this.declarantService = declarantService;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public Declarant addDeclarant(@RequestBody Declarant declarant) {
       return this.declarantService.addDeclarant(declarant);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Declarant> getAllDeclarants() {

        return this.declarantService.getAllDeclarants();
    }

}
