package sn.groupeisi.regulationimpot.web;


import org.modelmapper.ModelMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.groupeisi.regulationimpot.DTO.DeclarationDTO;
import sn.groupeisi.regulationimpot.entities.Declaration;
import sn.groupeisi.regulationimpot.service.DeclarationService;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path="declarations")
public class DeclarationController {

    private DeclarationService declarationService;

    public DeclarationController(DeclarationService declarationService) {
        this.declarationService = declarationService;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public Declaration addDeclaration(@RequestBody Declaration declaration) {
        return this.declarationService.addDeclaration(declaration);
    }

   // @GetMapping(produces = APPLICATION_JSON_VALUE)
   // public List<Declaration> getAllDeclarations() {

   //     return this.declarationService.getAllDeclarations();
   // }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DeclarationDTO> getAllDeclarations() {
        List<Declaration> declarations = declarationService.getAllDeclarations();
        List<DeclarationDTO> declarationDTOs = new ArrayList<>();

        ModelMapper modelMapper = new ModelMapper();

        for (Declaration declaration : declarations) {
            DeclarationDTO dto = modelMapper.map(declaration, DeclarationDTO.class);
            declarationDTOs.add(dto);
        }

        return declarationDTOs;
    }
}
