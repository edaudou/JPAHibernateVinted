package models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Integer id_pedido;
    @NotNull
    private String nseguimiento;
    @OneToOne()
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    private Producto producto;
}
