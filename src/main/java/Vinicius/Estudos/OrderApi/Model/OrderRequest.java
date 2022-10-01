package Vinicius.Estudos.OrderApi.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID orderId;

    @OneToOne
    @Column
    private User orderUser;

    @ManyToOne
    @Column
    private List<Product> orderProducts;

    @OneToOne
    @Column
    private Payment orderPayment;

    @Column
    Boolean orderValidation;

}