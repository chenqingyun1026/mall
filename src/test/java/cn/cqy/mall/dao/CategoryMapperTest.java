package cn.cqy.mall.dao;

import cn.cqy.mall.MallApplicationTests;
import cn.cqy.mall.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
public class CategoryMapperTest extends MallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;
    @Test
    public void findById() {
        Category category = categoryMapper.findById(100001);
        System.out.println(category);
    }

    @Test
    public void queryById() {
        Category category = categoryMapper.queryById(100001);
        System.out.println(category);
    }
}