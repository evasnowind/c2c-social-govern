package com.prayerlaputa.c2c.social.govern.reward.service;

import com.prayerlaputa.c2c.social.govern.reward.api.RewardService;
import com.prayerlaputa.c2c.social.govern.reward.dao.RewardCoinDAO;
import com.prayerlaputa.c2c.social.govern.reward.domain.RewardCoin;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(
        version = "1.0.0",
        interfaceClass = RewardService.class,
        cluster = "failfast",
        loadbalance = "roundrobin"
)
public class RewardServiceImpl implements RewardService {

    /**
     * 奖励金币DAO组件
     */
    @Autowired
    private RewardCoinDAO rewardCoinDAO;

    /**
     * 发放奖励
     * @param reviewerIds 评审员id
     */
    @Override
    public void giveReward(List<Long> reviewerIds) {
        for(Long reviewerId : reviewerIds) {
            RewardCoin rewardCoin = new RewardCoin();
            rewardCoin.setReviewerId(reviewerId);
            rewardCoin.setCoins(10L);
            rewardCoinDAO.add(rewardCoin);
        }
    }
}
