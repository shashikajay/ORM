package lk.ijse.orm.util;

import com.mysql.cj.Session;
import lk.ijse.orm.entity.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SectionFactoryConfigaration {
    private static SectionFactoryConfigaration sectionFactoryConfigaration;
    public static SectionFactoryConfigaration getInstance(){
        return sectionFactoryConfigaration == null ? sectionFactoryConfigaration = new SectionFactoryConfigaration() : sectionFactoryConfigaration;

    }
    public Session getSession(){
        StandardServiceRegistry build = new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources(build)
                .addAnnotatedClass(Customer.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        Session session = sessionFactory.openSession();
    }
}
