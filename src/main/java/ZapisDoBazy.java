import entity.Liczba;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ZapisDoBazy {

    private static ZapisDoBazy zapisDoBazy;

    private ZapisDoBazy() {
        inserting();
    }

    public static ZapisDoBazy getInstance() {
        if (zapisDoBazy == null) {
            zapisDoBazy = new ZapisDoBazy();
        }
        return zapisDoBazy;
    }

    private void inserting() {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        conf.addAnnotatedClass(Liczba.class);

        //stworzenie obiektu SessionFactory
        SessionFactory factory = conf.buildSessionFactory();
        //pobranie sesji
        Session session = factory.getCurrentSession();
      //  Liczba liczba = new Liczba(getLiczbaLosowan());



        session.beginTransaction();
     //   session.save(liczba);
        session.getTransaction().commit();
        factory.close();

    }
}