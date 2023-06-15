package nativeQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;


public class Main {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		String select = "select * from customer_address";
		NativeQuery query=session.createNativeQuery(select);
		List<Object[]> list = query.list();
		for(Object[] c:list) {
			System.out.println(Arrays.toString(c));
		}
		
		session.close();
	}

}
