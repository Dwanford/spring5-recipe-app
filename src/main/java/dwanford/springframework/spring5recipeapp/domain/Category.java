package dwanford.springframework.spring5recipeapp.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    public Set<Recipe> getRecipe() {
        return recipes;
    }

    public void setRecipe(Set<Recipe> recipe) {
        this.recipes = recipe;
    }
}
