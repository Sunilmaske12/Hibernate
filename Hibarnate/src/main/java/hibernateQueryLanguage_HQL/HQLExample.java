package hibernateQueryLanguage_HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Hibernate.Hibarnate.Student;

import manyToManyMapping.Employee;

public class HQLExample {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/Hibernate/Hibarnate/hibernate.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
	//get data
		String select = "from Student_Details";
		//here Student is a name of table not a name of class
		Query query = session.createQuery(select);
		List<Student> list = query.list(); 
		for(Student st:list) {
			System.out.println(st.getId()+" : "+st.getName()+" : "+st.getVillage());
		}
		
		String selectByName = "from Student_Details where StudentName = 'Anil'";
         Query query1 = session.createQuery(selectByName);
		List<Student> list1 = query1.list(); 
		for(Student st:list1) {
			System.out.println(st.getId()+" : "+st.getName());
		}
	
		//dynamic value
		String selectById = "from Student_Details where id =: x";
        Query query2 = session.createQuery(selectById);
		query2.setParameter("x", 2);
		List<Student> list2 = query2.list(); 
		for(Student st:list2) {
			System.out.println(st.getId()+" : "+st.getName());
		}
		
		
		String selectByVillage = "from Student_Details   where StudentVillage = 'Khurshipar' and id = 2";
        Query query3 = session.createQuery(selectByVillage);
		List<Student> list3 = query3.list(); 
		for(Student st:list3) {
			System.out.println(st.getId()+" : "+st.getName());
		}
		
		String delete = "delete from Student_Details where id=2";
		Transaction tx= session.beginTransaction();
		Query query4 = session.createQuery(delete);
		int r = query4.executeUpdate();
		System.out.println("row delete :"+r);
		
		String update = "update  Student_Details set StudentVillage = 'Rajegav' where id=1";
		Query query5 = session.createQuery(update);
		int r1 = query5.executeUpdate();
		System.out.println("row updated :"+r1);
		
		
	//join query
		//it rerquired join relationship: eg: many to many
		String join = "select e.eName , p.pName from Employee e INNER JOIN e.project p";
		Query query6 = session.createQuery(join);
		List<Object []> list6 = query6.list(); 
		for(Object[] st:list6) {
			System.out.println(Arrays.toString(st));
		}
		
		tx.commit();
		session.close();
		factory.close();

	}

}
