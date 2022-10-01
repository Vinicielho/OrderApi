package Vinicius.Estudos.OrderApi.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID CardId;

    @Column
    private String cardNumber;

    @Column
    private String cardName;

    @Column
    private String CardCvv;
}