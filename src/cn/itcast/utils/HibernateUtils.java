package cn.itcast.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static final Configuration cfg; 
	private static final SessionFactory sessionFactory;
	
	//��̬�����ʵ��
	static {
		//���غ��������ļ�
		 cfg = new Configuration();
		 cfg.configure();
		 sessionFactory = cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static Session getSessionCurrent(){
		return sessionFactory.getCurrentSession();
	}
	public static void main(String[] args) {
		
	}
}
