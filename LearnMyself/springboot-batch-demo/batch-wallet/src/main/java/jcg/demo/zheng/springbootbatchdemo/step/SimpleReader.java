package jcg.demo.zheng.springbootbatchdemo.step;

import jcg.demo.zheng.springbootbatchdemo.config.Wallet;
import jcg.demo.zheng.springbootbatchdemo.config.WalletRepository;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Iterator;

@Component
public class SimpleReader implements ItemReader<Wallet>, InitializingBean {

	private Wallet wallet;

	WalletRepository walletRepository;
	@Autowired
	public SimpleReader(  WalletRepository walletRepository){
		this.walletRepository = walletRepository;
	}

	@Override
	public Wallet read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		if(wallet != null){
			return null;
		}
		 wallet = walletRepository.findOne(1L);
		return wallet;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}
}