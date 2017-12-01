package cn.learn.springboot.restcontroller;

import cn.learn.springboot.model.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

@RestController
public class ItemController {

    private static List<Item> items;

    static {
        items = new ArrayList<>();
        // TODO init items from xml
        for (int i = 0; i < 6; i++) {
            Item item = new Item();
            item.setCategoryId(1L + i % 2);
            item.setItemId(Long.valueOf(i));
            item.setName("商品" + i);
            item.setContent("content" + i);
            item.setUrl("http://image4.suning.cn/uimg/b2c/newcatentries/0000000000-000000000171958800_2_200x200.jpg?ver=2046");
            items.add(item);
        }
    }

    @RequestMapping("/items")
    public List<Item> getItems(Long categoryId) {
        List<Item> items = new ArrayList<>();
        if (categoryId == null || categoryId == 0) {
            return items;
        }
        for (Item item : this.items) {
            if (categoryId == item.getCategoryId()) {
                items.add(item);
            }
        }
        return items;
    }


}
