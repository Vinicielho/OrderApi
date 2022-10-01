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
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID userId;

    @Column
    private String userName;

    @Column
    private String email;

    @Column
    private String documentNumber;

    @Column
    @OneToOne
    private Address userAddress;
}