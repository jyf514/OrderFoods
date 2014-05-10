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
 * A data access object (DAO) providing persistence and search support for Zone
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.orderFoods.DAO.Zone
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class ZoneDAO {
	private static final Logger log = LoggerFactory.getLogger(ZoneDAO.class);
	// property constants
	public static final String PROVINCE = "province";
	public static final String CITY = "city";
	public static final String ZONE = "zone";

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

	public void save(Zone transientInstance) {
		log.debug("saving Zone instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Zone persistentInstance) {
		log.debug("deleting Zone instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Zone findById(java.lang.Integer id) {
		log.debug("getting Zone instance with id: " + id);
		try {
			Zone instance = (Zone) getCurrentSession().get(
					"com.orderFoods.bean.Zone", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Zone instance) {
		log.debug("finding Zone instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.orderFoods.bean.Zone")
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
		log.debug("finding Zone instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Zone as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByProvince(Object province) {
		return findByProperty(PROVINCE, province);
	}

	public List findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List findByZone(Object zone) {
		return findByProperty(ZONE, zone);
	}

	public List findAll() {
		log.debug("finding all Zone instances");
		try {
			String queryString = "from Zone";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Zone merge(Zone detachedInstance) {
		log.debug("merging Zone instance");
		try {
			Zone result = (Zone) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Zone instance) {
		log.debug("attaching dirty Zone instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Zone instance) {
		log.debug("attaching clean Zone instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ZoneDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ZoneDAO) ctx.getBean("ZoneDAO");
	}
}