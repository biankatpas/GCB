package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.bean.BaseEntity;


public class GenericDAO {

	protected EntityManager manager;

	public GenericDAO() {
		manager = JPAFactory.getEntityManager();
	}

	public BaseEntity insert(BaseEntity entity) {
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		return entity;
	}
 
	public BaseEntity update(BaseEntity entity) {
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		return entity;
	}

	public void remove(BaseEntity entity) {
		entity = selectById(entity);
		manager.getTransaction().begin();
		manager.remove(entity);
		manager.getTransaction().commit();
	}

	public BaseEntity selectById(BaseEntity entity) {
		System.out.println("DAO selectById START ##############"+entity.getId());
		entity = manager.find(entity.getClass(), entity.getId());
		System.out.println("DAO selectById END ##############"+entity.getId());
		return entity;
	}

	public List<BaseEntity> selectByNamedQuery(String namedQuery) {
		return selectByNamedQuery(namedQuery, new String[0], new Object[0]);
	}

	public List<BaseEntity> selectByNamedQuery(String namedQuery,
			String[] parameterNames, Object... parameters) {
		try {
			Query query = manager.createNamedQuery(namedQuery);
			if (parameters != null && parameters.length > 0) {
				for (int i = 0; i < parameters.length; i++) {
					query.setParameter(parameterNames[i], parameters[i]);
				}
			}
			@SuppressWarnings("unchecked")
			List<BaseEntity> list = query.getResultList();
			return list;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
