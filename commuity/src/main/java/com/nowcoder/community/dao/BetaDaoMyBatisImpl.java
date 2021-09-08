package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class BetaDaoMyBatisImpl  implements  BetaDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
