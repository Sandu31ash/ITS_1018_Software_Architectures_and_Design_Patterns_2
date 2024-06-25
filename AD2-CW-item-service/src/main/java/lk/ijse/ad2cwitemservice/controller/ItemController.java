package lk.ijse.ad2cwitemservice.controller;

import lk.ijse.ad2cwitemservice.dto.ItemDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    @GetMapping("health")
    public String checkItemHealth(){
        return "Item health ok!";
    }

    @PostMapping("saveItem")
    public ItemDTO saveItem(@RequestBody ItemDTO item){
        item.setItemCode(item.getItemCode()+" updated code");
        item.setUnitPrice(item.getUnitPrice()+10);
        item.setQty(item.getQty()+10);

        return item;
    }

}
