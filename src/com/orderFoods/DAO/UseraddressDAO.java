package com.orderFoods.DAO;
import com.orderFoods.bean.*;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

/**
 * A data access object (DAO) providing persistence and search support for
 * Useraddress entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.orderFoods.DAO.Useraddress
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class UseraddressDAO {
	private static final Logger log = LoggerFactory
			.getLogger(UseraddressDAO.class);
	// property constants
	public static final String ADDRESS = "address";
	public static final String PHONE_NUMBER = "phoneNumber";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(Useraddress transientInstance) {
		log.debug("saving Useraddress instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Useraddress persistentInstance) {
		log.debug("deleting Useraddress instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Useraddress findById(java.lang.Integer id) {
		log.debug("getting Useraddress instance with id: " + id);
		try {
			Useraddress instance = (Useraddress) getCurrentSession().get(
					"com.orderFoods.bean.Useraddress", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Useraddress instance) {
		log.debug("finding Useraddress instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.orderFoods.bean.Useraddress")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Useraddress instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Useraddress as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByPhoneNumber(Object phoneNumber) {
		return findByProperty(PHONE_NUMBER, phoneNumber);
	}

	public List findAll() {
		log.debug("finding all Useraddress instances");
		try {
			String queryString = "from Useraddress";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Useraddress merge(Useraddress detachedInstance) {
		log.debug("merging Useraddress instance");
		try {
			Useraddress result = (Useraddress) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Useraddress instance) {
		log.debug("attaching dirty Useraddress instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Useraddress instance) {
		log.debug("attaching clean Useraddress instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UseraddressDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (UseraddressDAO) ctx.getBean("UseraddressDAO");
	}
}