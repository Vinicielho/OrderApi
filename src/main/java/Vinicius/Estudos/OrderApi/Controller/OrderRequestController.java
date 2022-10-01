package Vinicius.Estudos.OrderApi.Controller;

import Vinicius.Estudos.OrderApi.Model.OrderRequest;
import Vinicius.Estudos.OrderApi.Service.OrderRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRequestController {

    @Autowired
    private OrderRequestService orderRequestService;

    @PostMapping("/Order/{id}")
    public ResponseEntity saveOrder(@RequestBody OrderRequest incomingOrderRequest){

        return ResponseEntity.ok( orderRequestService.saveOrder(incomingOrderRequest));
    }

}