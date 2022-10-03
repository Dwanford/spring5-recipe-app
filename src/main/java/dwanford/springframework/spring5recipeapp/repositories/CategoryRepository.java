package dwanford.springframework.spring5recipeapp.repositories;

import dwanford.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
