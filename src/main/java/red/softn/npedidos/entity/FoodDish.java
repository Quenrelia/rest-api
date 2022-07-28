package red.softn.npedidos.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "food_dishes")
public class FoodDish {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "name", nullable = false, length = 250)
    private String name;
    
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "types_dishes_id", nullable = false)
    private TypeDish typeDishes;
    
    public boolean equals(final Object o) {
        if (o == this) {return true;}
        if (!(o instanceof final FoodDish other)) {return false;}
        if (!other.canEqual(this)) {return false;}
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (!Objects.equals(this$id, other$id)) {return false;}
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (!Objects.equals(this$name, other$name)) {return false;}
        final Object this$typeDishes = this.getTypeDishes();
        final Object other$typeDishes = other.getTypeDishes();
        return Objects.equals(this$typeDishes, other$typeDishes);
    }
    
    protected boolean canEqual(final Object other) {return other instanceof FoodDish;}
    
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $typeDishes = this.getTypeDishes();
        result = result * PRIME + ($typeDishes == null ? 43 : $typeDishes.hashCode());
        return result;
    }
    
}
