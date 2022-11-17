package models;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Integer id_pedido;
    @NotNull
    private String nseguimiento;

    @Override
    public String toString() {
        return "Pedido{" +
                "id_pedido=" + id_pedido +
                ", nseguimiento='" + nseguimiento + '\'' +
                '}';
    }

    @OneToOne()
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    private Producto producto;
}
