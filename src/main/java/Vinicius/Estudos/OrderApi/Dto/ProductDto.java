package Vinicius.Estudos.OrderApi.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ProductDto {

    private String productName;
    private Double productPrice;
}