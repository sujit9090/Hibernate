package mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
	 SessionFactory sf=cf.buildSessionFactory();
	 Session se=sf.openSession();
	 Transaction tx=se.beginTransaction();
	 Student x=(Student)se.load(Student.class,102);
	 x.setSname("manoj");
	 Student sai=new Student();
	 sai.setSid(101);
	 sai.setSname("sai prasad");
	 sai.setSmarks(399);
	 
	 se.save(sai);
	 se.update(x);
	 System.out.println(x.getSid()+" "+x.getSname()+" "+x.getSmarks());
	 tx.commit();
	 se.close();
	}

}