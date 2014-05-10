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
 * A data access object (DAO) providing persistence and search support for Dish
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.orderFoods.DAO.Dish
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class DishDAO {
	private static final Logger log = LoggerFactory.getLogger(DishDAO.class);
	// property constants
	public static final String DISH_NAME = "dishName";
	public static final String PRICE = "price";
	public static final String IS_SOLD_OUT = "isSoldOut";
	public static final String IMAGE = "image";

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

	public void save(Dish transientInstance) {
		log.debug("saving Dish instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Dish persistentInstance) {
		log.debug("deleting Dish instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Dish findById(java.lang.Integer id) {
		log.debug("getting Dish instance with id: " + id);
		try {
			Dish instance = (Dish) getCurrentSession().get(
					"com.orderFoods.bean.Dish", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Dish instance) {
		log.debug("finding Dish instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.orderFoods.bean.Dish")
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
		log.debug("finding Dish instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Dish as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDishName(Object dishName) {
		return findByProperty(DISH_NAME, dishName);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findByIsSoldOut(Object isSoldOut) {
		return findByProperty(IS_SOLD_OUT, isSoldOut);
	}

	public List findByImage(Object image) {
		return findByProperty(IMAGE, image);
	}

	public List findAll() {
		log.debug("finding all Dish instances");
		try {
			String queryString = "from Dish";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Dish merge(Dish detachedInstance) {
		log.debug("merging Dish instance");
		try {
			Dish result = (Dish) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Dish instance) {
		log.debug("attaching dirty Dish instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Dish instance) {
		log.debug("attaching clean Dish instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DishDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DishDAO) ctx.getBean("DishDAO");
	}
}