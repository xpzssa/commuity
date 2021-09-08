package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("hibernate")
public class BetaDaoHibernateImpl implements BetaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
