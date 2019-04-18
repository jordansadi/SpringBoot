package us.jsadi.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    @RequestMapping("/items")
    public List<Item> getAllItems() {
        int nextProductNumber = 1;

        List<Item> items = new ArrayList<>();

        items.add(new Item(nextProductNumber++, "MilwaukeeHome Shirt", 30.99));
        items.add(new Item(nextProductNumber++, "Wiskullsin Shirt", 30.99));
        items.add(new Item(nextProductNumber++, "Orchard Street Apparel Shirt", 30.99));
        items.add(new Item(nextProductNumber++, "Brew City Brand Shirt", 30.99));
        items.add(new Item(nextProductNumber++, "Fern & Nettle Soap", 8.99));
        items.add(new Item(nextProductNumber++, "Tactile Craftworks Wallet", 15.99));
        items.add(new Item(nextProductNumber++, "Dear Darlington Jewelry", 20.99));
        items.add(new Item(nextProductNumber++, "Paper Pleasers Mug", 12.99));
        items.add(new Item(nextProductNumber++, "Indulgence Chocolatiers Chocolate", 6.99));

        return items;
    }
}