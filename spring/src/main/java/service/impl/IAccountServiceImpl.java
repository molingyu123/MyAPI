package service.impl;

import dao.IAccountDao;
import dao.impl.IAccountDaoImpl;
import factory.BeanFactory;
import service.IAccountService;

/**
 * 实现类
 */
public class IAccountServiceImpl implements IAccountService {

//    private IAccountDao iAccountDao = new IAccountDaoImpl();
      private IAccountDao iAccountDao =(IAccountDao)BeanFactory.getBean("accountDao");

    public IAccountServiceImpl() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
    }

    @Override
    public void saveAccount() {
         iAccountDao.saveAccount();
    }
}
