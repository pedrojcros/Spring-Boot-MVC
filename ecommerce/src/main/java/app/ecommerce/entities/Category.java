package app.ecommerce.entities;

import app.ecommerce.enums.CategoryType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
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

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Long idCategory;

    @Column(length = 30)
    private String name;

    @Column(length = 50)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "category_type", length = 20)
    private CategoryType type;
}
