package jcg.demo.zheng.springbootbatchdemo.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.adapter.ItemReaderAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jcg.demo.zheng.springbootbatchdemo.step.SimpleProcessor;
import jcg.demo.zheng.springbootbatchdemo.step.SimpleReader;
import jcg.demo.zheng.springbootbatchdemo.step.SimpleWriter;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
public class BatchConfig {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
	public WalletRepository walletRepository;

	@Autowired
	public JobExecutionListener listener;

	@Autowired
	public SimpleAdapterReader simpleAdapter;

	@Autowired
	@PersistenceContext
	private transient EntityManager entityManager;

	private int STEP_CHUNK_SIZE = 2;

	private static final String SIMPLE_JOB_NAME = "simpleJob";
	private static final String STEP_ONE_NAME = "oneStep";
	private static final String STEP_A_NAME = "adapterStep";

	@Bean
	public Job simpleJob() {
		return jobBuilderFactory.get(SIMPLE_JOB_NAME).incrementer(new RunIdIncrementer()).listener(listener)
				.flow(oneStep()).end().build();
	}

	@Bean
	public Job simpleAdapterJob() {
		return jobBuilderFactory.get("simpleAdapterJob").incrementer(new RunIdIncrementer()).listener(listener)
				.flow(adapterStep()).end().build();
	}

	@Bean
	public Step oneStep() {
		return stepBuilderFactory.get(STEP_ONE_NAME).<Wallet, Wallet> chunk(STEP_CHUNK_SIZE).reader(new SimpleReader(walletRepository))
				.processor(new SimpleProcessor(entityManager)).writer(new SimpleWriter(walletRepository)).build();
	}

	@Bean
	public Step adapterStep() {
		return stepBuilderFactory.get(STEP_A_NAME).<Wallet, Wallet>chunk(STEP_CHUNK_SIZE).reader(simpleAdaperReader())
				.processor(new SimpleProcessor(entityManager)).writer(new SimpleWriter(walletRepository)).build();
	}

	@Bean
	public ItemReaderAdapter<Wallet> simpleAdaperReader() {
		ItemReaderAdapter<Wallet> adapter = new ItemReaderAdapter<Wallet>();
		adapter.setTargetObject(simpleAdapter);
		adapter.setTargetMethod("nextItem");
		return adapter;
	}

}
