package sn.groupeisi.regulationimpot.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class DeclarationDTO {
    private Long id;
    private Date dateDeclaration;
    private double montantDeclaration;


}
