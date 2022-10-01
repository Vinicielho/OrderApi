package Vinicius.Estudos.OrderApi.Repository;

import Vinicius.Estudos.OrderApi.Model.OrderRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRequestRepository extends JpaRepository<OrderRequest, UUID> {
}