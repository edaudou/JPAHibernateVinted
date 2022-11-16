package models;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id_usuario;
    @NotNull
    private String nombre_completo;
    @Nullable
    private double valoracion;
    @Nullable
    private String localizacion;
    @NotNull
    private String contrasenia;
    @OneToMany (mappedBy = "usuario")
    private List<Producto> productoList;
    @OneToMany(mappedBy = "usuario")
    private List<Oferta>ofertaList;
    @OneToMany(mappedBy = "usuario")
    private List<Contraoferta>contraofertas;

}
