package com.orderFoods.DAO;
import com.orderFoods.bean.*;
import java.util.List;
import java.util.Set;
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
 * Seller entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.orderFoods.DAO.Seller
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class SellerDAO {
	private static final Logger log = LoggerFactory.getLogger(SellerDAO.class);
	// property constants
	public static final String LOGIN_NAME = "loginName";
	public static final String PASSWORD = "password";
	public static final String REAL_NAME = "realName";
	public static final String ID = "id";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String ADDRESS = "address";
	public static final String IS_PASS = "isPass";

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

	public void save(Seller transientInstance) {
		log.debug("saving Seller instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Seller persistentInstance) {
		log.debug("deleting Seller instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Seller findById(java.lang.Integer id) {
		log.debug("getting Seller instance with id: " + id);
		try {
			Seller instance = (Seller) getCurrentSession().get(
					"com.orderFoods.bean.Seller", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Seller instance) {
		log.debug("finding Seller instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.orderFoods.bean.Seller")
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
		log.debug("finding Seller instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Seller as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLoginName(Object loginName) {
		return findByProperty(LOGIN_NAME, loginName);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByRealName(Object realName) {
		return findByProperty(REAL_NAME, realName);
	}

	public List findById(Object id) {
		return findByProperty(ID, id);
	}

	public List findByPhoneNumber(Object phoneNumber) {
		return findByProperty(PHONE_NUMBER, phoneNumber);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByIsPass(Object isPass) {
		return findByProperty(IS_PASS, isPass);
	}

	public List findAll() {
		log.debug("finding all Seller instances");
		try {
			String queryString = "from Seller";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Seller merge(Seller detachedInstance) {
		log.debug("merging Seller instance");
		try {
			Seller result = (Seller) getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Seller instance) {
		log.debug("attaching dirty Seller instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Seller instance) {
		log.debug("attaching clean Seller instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SellerDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SellerDAO) ctx.getBean("SellerDAO");
	}
}