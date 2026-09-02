package ni.edu.uam.registroproductos.repository;

import ni.edu.uam.registroproductos.model.Producto;

import java.time.LocalDate;
import java.util.List;

public class ProductoRepository {
    public List<Producto> findAll() {
        return List.of(
                new Producto(
                1,
                "Monitor Samsung",
                "Tecnológico",
                6000.63,
                LocalDate.of(2026,9,1),
                null
                ),
                new Producto(
                        2,
                        "I-phone 17 Pro Max",
                        "Lujo",
                        60000.99,
                        LocalDate.of(2026,9,1),
                        null
                ),
                new Producto(
                        3,
                        "Refrigerador Samsung",
                        "Hogar",
                        25000.99,
                        LocalDate.of(2026,9,1),
                        null
                ),
                new Producto(
                        4,
                        "Mouse-Pad",
                        "Accesorio",
                        300.99,
                        LocalDate.of(2026,9,1),
                        null
                ),
                new Producto(
                        5,
                        "Mouse Logitech",
                        "Uso Cotidiano",
                        2999.99,
                        LocalDate.of(2026,9,1),
                        null
                )
        );
    }
}
