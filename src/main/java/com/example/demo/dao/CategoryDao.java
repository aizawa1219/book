//「CategoryRepository」を呼び出すクラス
package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.common.DataNotFoundException;
import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;

@Repository
public class CategoryDao implements BaseDao<Category> {

	@Autowired
	CategoryRepository repository;

	@Override
	public List<Category> findAll() {
		return repository.findAll();
	}

	@Override
	public Category findById(Integer id) throws DataNotFoundException {
		return repository.findById(id).orElseThrow(() -> new DataNotFoundException());
	}

	@Override
	public void save(Category category) {
		repository.save(category);
	}

	@Override
	public void delete(Integer id) {
		try {
			Category category = this.findById(id);
			repository.delete(category);
		} catch (DataNotFoundException e) {
			System.out.println("do nothing");
		}
	}
}

