package lk.ijse.orm.util;

import com.mysql.cj.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SectionFactoryConfigaration {
    private static SectionFactoryConfigaration sectionFactoryConfigaration;
    public static SectionFactoryConfigaration getInstance(){
        return sectionFactoryConfigaration == null ? sectionFactoryConfigaration = new SectionFactoryConfigaration() : sectionFactoryConfigaration;

    }
    public Session getSession(){
        StandardServiceRegistry build = new StandardServiceRegistryBuilder().configure().build();
        new MetadataSources();
    }
}
