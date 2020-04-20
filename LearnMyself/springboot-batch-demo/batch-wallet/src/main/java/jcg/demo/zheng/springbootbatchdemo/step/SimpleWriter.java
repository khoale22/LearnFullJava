package jcg.demo.zheng.springbootbatchdemo.step;

import java.util.List;


import jcg.demo.zheng.springbootbatchdemo.config.Wallet;
import org.springframework.batch.item.ItemWriter;

public class SimpleWriter implements ItemWriter<Wallet> {


	@Override
	public void write(List<? extends Wallet> messages) throws Exception {
		String a = "5";
	}

}