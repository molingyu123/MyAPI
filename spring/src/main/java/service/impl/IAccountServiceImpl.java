package service.impl;

import dao.IAccountDao;
import dao.impl.IAccountDaoImpl;
import service.IAccountService;

/**
 * 实现类
 */
public class IAccountServiceImpl implements IAccountService {

    private IAccountDao iAccountDao = new IAccountDaoImpl();

    @Override
    public void saveAccount() {

    }
}
