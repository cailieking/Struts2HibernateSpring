package cn.itcast.dao;



import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.itcast.entity.User;

public class UserDaoImpl implements UserDao {

	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public void add() {
		
		/*HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
		hibernateTemplate.save(entity);*/
		System.out.println("userDao......");
		User user = new User();
		user.setAddress("wuhan");
		user.setUsername("cailie");
		hibernateTemplate.save(user);
	}
}
