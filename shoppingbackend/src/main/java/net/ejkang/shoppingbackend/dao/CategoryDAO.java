package net.ejkang.shoppingbackend.dao;

import java.util.List;

import net.ejkang.shoppingbackend.dto.Category;

public interface CategoryDAO {
    List<Category> list();
}