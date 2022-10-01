package Vinicius.Estudos.OrderApi.Client;

import Vinicius.Estudos.OrderApi.Model.Payment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CreditCardValidator {

    @PostMapping("validate")
    boolean getValidation(@RequestBody Payment payment);
}

