package br.com.s2it.incubadora.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.s2it.incubadora.model.Client;


@Repository
public class ClientRepository extends AbstractRepository{

	@SuppressWarnings("unchecked")
	public List<Client> listAll() {
		Criteria criteria = getSession().createCriteria(Client.class);
        return criteria.list();
	}

	@Override
	public Object findById(int id) {
		Criteria criteria = getSession().createCriteria(Client.class);
        criteria.add(Restrictions.eq("id",id));
        return criteria.uniqueResult();
	}
	
}
