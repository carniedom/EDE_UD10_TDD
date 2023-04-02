import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void Test_Al_Crear_Un_Coche_Su_Velocidad_Es_Cero(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
    @Test
    public void Test_Al_Acelerar_Un_Coche_Su_Velocidad_Aumenta(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.Acelerar(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
}
