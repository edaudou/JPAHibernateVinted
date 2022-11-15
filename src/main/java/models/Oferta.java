package models;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Oferta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = true)
    private Integer id_oferta;
    @NotNull
    private double precio_oferta;
    @NotNull
    private Date fecha;
    @NotNull
    private String mensaje;
    @ManyToOne(optional = false)
    @JoinColumn(name="usuario_id", referencedColumnName = "id")
    private Usuario usuario;
    @ManyToOne(optional = false)
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    private Producto producto;

}
