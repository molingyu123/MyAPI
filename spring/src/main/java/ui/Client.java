package ui;

import factory.BeanFactory;
import service.IAccountService;
import service.impl.IAccountServiceImpl;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//        IAccountService accountService = new IAccountServiceImpl();
        for(int i=0;i<5;i++){
            IAccountService accountService = (IAccountService) BeanFactory.getBean("accountService");
            accountService.saveAccount();
            System.out.println(accountService);
        }

    }
}
