package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
