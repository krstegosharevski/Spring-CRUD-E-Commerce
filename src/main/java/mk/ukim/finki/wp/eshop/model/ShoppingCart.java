package mk.ukim.finki.wp.eshop.model;


import lombok.Data;
import mk.ukim.finki.wp.eshop.model.enumeration.ShoppingCardStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateCreated;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<Product> products;

    @Enumerated(EnumType.STRING)
    private ShoppingCardStatus status;

    public ShoppingCart() {

    }

    public ShoppingCart(User user) {
        this.dateCreated = LocalDateTime.now();
        this.user = user;
        this.status = ShoppingCardStatus.CREATED;
        this.products = new ArrayList<>();
    }
}
