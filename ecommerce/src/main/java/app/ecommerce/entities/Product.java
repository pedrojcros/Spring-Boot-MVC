package app.ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private Long idProduct;
    private String name;
    private String description;
    private Double price;
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;
}
