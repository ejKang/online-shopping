package net.ejkang.shoppingbackend.dao;

import java.util.List;

import net.ejkang.shoppingbackend.dto.Category;

public interface CategoryDAO {
    boolean add(Category category);

    List<Category> list();

	Category get(int id);
}