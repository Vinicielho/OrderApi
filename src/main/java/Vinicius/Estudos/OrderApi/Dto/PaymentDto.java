package Vinicius.Estudos.OrderApi.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PaymentDto {

    private String cardNumber;
    private String cardName;
    private String cvv;
}
