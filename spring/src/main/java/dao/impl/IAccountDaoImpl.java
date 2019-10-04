package dao.impl;

import dao.IAccountDao;

/**
 * 账户持久层实现类
 */
public class IAccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("将账户保存到了数据库");
    }
}
