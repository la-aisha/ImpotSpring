package sn.groupeisi.regulationimpot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "test")
public class TestController {

    @GetMapping (path = "string")
    public String getString(){

        return "chaine de caractere pour regulation impot";
    }

    @GetMapping ()
    public List<String> getList(){

        return List.of("chaine de caractere" ,"pour regulation impot");
    }
}
