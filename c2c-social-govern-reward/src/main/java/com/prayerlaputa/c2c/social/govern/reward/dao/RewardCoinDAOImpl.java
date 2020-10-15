package com.prayerlaputa.c2c.social.govern.reward.dao;

import com.prayerlaputa.c2c.social.govern.reward.domain.RewardCoin;
import com.prayerlaputa.c2c.social.govern.reward.mapper.RewardCoinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 奖励金币记录DAO组件
 */
@Repository
public class RewardCoinDAOImpl implements RewardCoinDAO {

    /**
     * 奖励金币Mapper组件
     */
    @Autowired
    private RewardCoinMapper rewardCoinMapper;

    /**
     * 增加奖励金币记录
     * @param rewardCoin 奖励金币记录
     */
    @Override
    public void add(RewardCoin rewardCoin) {
        rewardCoinMapper.insert(rewardCoin);
    }

}
