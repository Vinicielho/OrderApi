package Vinicius.Estudos.OrderApi.Service;
import Vinicius.Estudos.OrderApi.Client.CreditCardValidator;
import Vinicius.Estudos.OrderApi.Model.OrderRequest;
import Vinicius.Estudos.OrderApi.Repository.OrderRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderRequestService {

    @Autowired
    OrderRequestRepository orderRequestRepository;

    @Autowired
    CreditCardValidator creditCardValidator;

    public String saveOrder(OrderRequest incomingOrderRequest) {

        OrderRequest newOrderRequest = new OrderRequest();

        newOrderRequest.setOrderProducts(incomingOrderRequest.getOrderProducts());
        newOrderRequest.setOrderUser(incomingOrderRequest.getOrderUser());
        newOrderRequest.setOrderPayment(incomingOrderRequest.getOrderPayment());

        orderRequestRepository.save(newOrderRequest);

        boolean validation = creditCardValidator.getValidation(newOrderRequest.getOrderPayment());
        newOrderRequest.setOrderValidation(validation);

        orderRequestRepository.save(newOrderRequest);

        if (validation) {
            //Manda pra fila
            return "Pedido efetuado";}

        else {return "Pedido inválido";}
    }
}