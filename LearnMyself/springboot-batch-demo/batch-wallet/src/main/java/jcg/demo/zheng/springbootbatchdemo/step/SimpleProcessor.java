package jcg.demo.zheng.springbootbatchdemo.step;


import jcg.demo.zheng.springbootbatchdemo.config.Wallet;
import org.springframework.batch.item.ItemProcessor;

import java.math.BigDecimal;


public class SimpleProcessor implements ItemProcessor<Wallet,Wallet> {



    @Override
	public Wallet process(Wallet test) throws Exception {

		test.setAmount(new BigDecimal(44));
		return test;
	}

}
