import entity.Liczba;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
public class Liczba_test {
    private Liczba liczba;

    @BeforeEach

    public void setUp() throws Exception {
        this.liczba = new Liczba(100);

        liczba.setNumer(1);
        liczba.setCzestosc(4);
        liczba.setKiedyOstatnio(0);

    }
    @Test
    @DisplayName("prawdopodobieństwo dla ponownie losowanej liczby=ok")
    public void obliczPrawdopodobienstwoPoKolejnoscix2_test(){
        liczba.setOstatnioPoKolei(2);
        var wynik=liczba.obliczPrawdopodobienstwoPoKolejnosci();//należy zmienic z private na public
        var oczekiwane=BigDecimal.valueOf(1/49.0).multiply(BigDecimal.valueOf(1/49.0)).multiply((BigDecimal.valueOf(1/49.0)));
        assertEquals(oczekiwane,wynik);
    }
    @Test
    public void obliczPrawdopodobienstwoPoKolejnoscix1_test(){
        liczba.setOstatnioPoKolei(1);
       var wynik=liczba.obliczPrawdopodobienstwoPoKolejnosci();//metoda testowana powinna być public
       var oczekiwane=BigDecimal.valueOf(1/49.0).multiply(BigDecimal.valueOf(1/49.0));
       assertEquals(wynik,oczekiwane);
    }
}
*/