package jcg.demo.zheng.springbootbatchdemo.step;

import java.util.List;


import jcg.demo.zheng.springbootbatchdemo.config.Wallet;
import jcg.demo.zheng.springbootbatchdemo.config.WalletRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

public class SimpleWriter implements ItemWriter<Wallet> {

	WalletRepository walletRepository;
	@Autowired
	public SimpleWriter(  WalletRepository walletRepository){
		this.walletRepository = walletRepository;
	}

	@Override
	public void write(List<? extends Wallet> messages) throws Exception {
		walletRepository.save(messages);
	}

}