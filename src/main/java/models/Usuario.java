package models;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
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

    @Override
    public String toString() {
        return "Usuario{" +
                "id_usuario=" + id_usuario +
                ", nombre_completo='" + nombre_completo + '\'' +
                ", valoracion=" + valoracion +
                ", localizacion='" + localizacion + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
    }

    @OneToMany (mappedBy = "usuario")
    private List<Producto> productoList;
    @OneToMany(mappedBy = "usuario")
    private List<Oferta>ofertaList;
    @OneToMany(mappedBy = "usuario")
    private List<Contraoferta>contraofertas;

}
