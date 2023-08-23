package sn.groupeisi.regulationimpot.web;


import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import sn.groupeisi.regulationimpot.DTO.PaiementDTO;
import sn.groupeisi.regulationimpot.entities.Paiement;
import sn.groupeisi.regulationimpot.service.PaiementService;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path="paiements")

public class PaiementController {

    private PaiementService paiementService;

    public PaiementController(PaiementService paiementService) {
        this.paiementService = paiementService;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public Paiement addPaiement(@RequestBody Paiement paiement){

        return this.paiementService.addPaiement(paiement);
    }

    //@GetMapping(produces = APPLICATION_JSON_VALUE)
   // public List<Paiement> getAllPaiements() {

      //  return this.paiementService.getAllPaiements();
    //}

    @GetMapping()
    public List<PaiementDTO> getAllPaiements() {
        List<Paiement> paiements = paiementService.getAllPaiements();
        List<PaiementDTO> paiementDTOs = new ArrayList<>();

        ModelMapper modelMapper = new ModelMapper();

        for (Paiement paiement : paiements) {
            PaiementDTO dto = modelMapper.map(paiement, PaiementDTO.class);
            paiementDTOs.add(dto);
        }

        return paiementDTOs;
    }

}
