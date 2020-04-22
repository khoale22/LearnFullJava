package jcg.demo.zheng.springbootbatchdemo.step;


import jcg.demo.zheng.springbootbatchdemo.config.Wallet;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;


public class SimpleProcessor implements ItemProcessor<Wallet,Wallet> {

	private EntityManager entityManager;

	public SimpleProcessor(EntityManager entityManager){
		this.entityManager = entityManager;
	}

    @Override
	public Wallet process(Wallet test) throws Exception {
		entityManager.detach(test);
		test.setAmount(new BigDecimal(45));
		return test;
	}

}
