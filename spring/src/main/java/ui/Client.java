package ui;

import service.IAccountService;
import service.impl.IAccountServiceImpl;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
        IAccountService accountService = new IAccountServiceImpl();
        accountService.saveAccount();
    }
}
