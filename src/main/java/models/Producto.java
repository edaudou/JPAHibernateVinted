package models;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Integer id_producto;
    @NotNull
    private String nombre;
    @NotNull
    private String categoria;
    @NotNull
    private String talla;
    @NotNull
    private String estado;
    @NotNull
    private String marca;
    @NotNull
    private String detalles;
    @NotNull
    private double precio;

    @OneToOne(mappedBy = "producto",optional = true)
    private Pedido pedido;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuario;

    @Override
    public String toString() {
        return "Producto{" +
                "id_producto=" + id_producto +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", talla='" + talla + '\'' +
                ", estado='" + estado + '\'' +
                ", marca='" + marca + '\'' +
                ", detalles='" + detalles + '\'' +
                ", precio=" + precio +
                '}';
    }
}
