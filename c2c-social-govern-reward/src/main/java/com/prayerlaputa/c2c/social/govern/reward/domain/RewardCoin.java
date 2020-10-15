package com.prayerlaputa.c2c.social.govern.reward.domain;

/**
 * 奖励金币
 */
public class RewardCoin {

    /**
     * 奖励金币记录id
     */
    private Long id;
    /**
     * 评审员id
     */
    private Long reviewerId;
    /**
     * 奖励金币数量
     */
    private Long coins;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public Long getCoins() {
        return coins;
    }

    public void setCoins(Long coins) {
        this.coins = coins;
    }
}
