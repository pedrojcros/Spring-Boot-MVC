package app.ecommerce.entities;

import app.ecommerce.enums.CategoryType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// @Table(name = "categories")
// @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
// @JsonIdentityReference(alwaysAsId = true)
// @JsonInclude(JsonInclude.Include.NON_NULL)
// @JsonPropertyOrder({"id", "name", "description", "categoryType"})
// @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
// @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
// @JsonTypeName("category")
// @JsonRootName("category")
public class Category {

    @Id
    private Long idCategory;
    private String name;
    private String description;
    private CategoryType categoryType;
}
