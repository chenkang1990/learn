package cn.learn.springboot.restcontroller;

import cn.learn.springboot.model.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    private static List<Category> categories;

    static {
        categories = new ArrayList<>();
        // TODO init items from xml
        Category category1 = new Category();
        category1.setCategoryId(1L);
        category1.setCategoryName("手机");

        Category category2 = new Category();
        category2.setCategoryId(2L);
        category2.setCategoryName("电器");

        categories.add(category1);
        categories.add(category2);
    }

    @RequestMapping("categorys")
    public List<Category> getCateogry() {
        return categories;
    }

}
