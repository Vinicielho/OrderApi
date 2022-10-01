package Vinicius.Estudos.OrderApi.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
public class OrderRequestDto {

    private UUID orderId;
    private UserDto orderUserDto;
    private List<ProductDto> orderProductsDto;
    private PaymentDto orderPaymentDto;
    private Boolean orderValidationDto;

}
