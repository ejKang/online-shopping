package net.ejkang.shoppingbackend.daoimple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.ejkang.shoppingbackend.dao.CategoryDAO;
import net.ejkang.shoppingbackend.dto.Category;

@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

    @Autowired
    SessionFactory sessionFactory;

    private static List<Category> categories = new ArrayList<>();

    static {
        Category category = new Category();
        category.setId(1);
        category.setName("Television");
        category.setDescription("This is some description for television");
        category.setImageURL("CAT_1.png");

        categories.add(category);

        category = new Category();
        category.setId(2);
        category.setName("Mobile");
        category.setDescription("This is some description for mobile");
        category.setImageURL("CAT_2.png");

        categories.add(category);

        category = new Category();
        category.setId(3);
        category.setName("Laptop");
        category.setDescription("This is some description for laptop");
        category.setImageURL("CAT_3.png");

        categories.add(category);
    }

    @Override
    public List<Category> list() {
        return categories;
    }

    @Override
    public Category get(int id) {
        List<Category> list = categories.stream().filter(c-> (c.getId() == id)).collect(Collectors.toList());
        if (list.size() > 0) 
            return list.get(0);
        else 
            return null;
    }

    @Transactional
    @Override
    public boolean add(Category category) {
        
        try {
            sessionFactory.getCurrentSession().persist(category);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
}