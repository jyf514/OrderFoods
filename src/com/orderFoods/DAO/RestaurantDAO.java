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
 * Restaurant entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.orderFoods.DAO.Restaurant
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class RestaurantDAO {
	private static final Logger log = LoggerFactory
			.getLogger(RestaurantDAO.class);
	// property constants
	public static final String RESTAURANT_NAME = "restaurantName";
	public static final String ADDRESS = "address";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String INTRODUCTION = "introduction";
	public static final String CHECK_PRICE = "checkPrice";
	public static final String BUSINESS_HOUR = "businessHour";
	public static final String IS_OPEN = "isOpen";

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

	public void save(Restaurant transientInstance) {
		log.debug("saving Restaurant instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Restaurant persistentInstance) {
		log.debug("deleting Restaurant instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Restaurant findById(java.lang.Integer id) {
		log.debug("getting Restaurant instance with id: " + id);
		try {
			Restaurant instance = (Restaurant) getCurrentSession().get(
					"com.orderFoods.bean.Restaurant", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Restaurant instance) {
		log.debug("finding Restaurant instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.orderFoods.bean.Restaurant")
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
		log.debug("finding Restaurant instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Restaurant as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRestaurantName(Object restaurantName) {
		return findByProperty(RESTAURANT_NAME, restaurantName);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByPhoneNumber(Object phoneNumber) {
		return findByProperty(PHONE_NUMBER, phoneNumber);
	}

	public List findByIntroduction(Object introduction) {
		return findByProperty(INTRODUCTION, introduction);
	}

	public List findByCheckPrice(Object checkPrice) {
		return findByProperty(CHECK_PRICE, checkPrice);
	}

	public List findByBusinessHour(Object businessHour) {
		return findByProperty(BUSINESS_HOUR, businessHour);
	}

	public List findByIsOpen(Object isOpen) {
		return findByProperty(IS_OPEN, isOpen);
	}

	public List findAll() {
		log.debug("finding all Restaurant instances");
		try {
			String queryString = "from Restaurant";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Restaurant merge(Restaurant detachedInstance) {
		log.debug("merging Restaurant instance");
		try {
			Restaurant result = (Restaurant) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Restaurant instance) {
		log.debug("attaching dirty Restaurant instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Restaurant instance) {
		log.debug("attaching clean Restaurant instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RestaurantDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RestaurantDAO) ctx.getBean("RestaurantDAO");
	}
}