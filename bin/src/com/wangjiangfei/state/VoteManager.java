package com.wangjiangfei.state;

import java.util.HashMap;
import java.util.Map;

/**
 * 投票管理
 *
 * @author wangjiangfei
 */
public class VoteManager {

    /**
     * 持有状态处理对象
     */
    private VoteState state = null;

    /**
     * 记录用户投票的结果，用户的名称---投票的选项
     */
    private Map<String, String> mapVote = new HashMap<>();

    /**
     * 记录用户投票次数，用户名称---投票的次数
     */
    private Map<String, Integer> mapVoteCount = new HashMap<>();

    /**
     * 获取记录用户投票结果的map
     * @return 记录用户投票结果的map
     */
    public Map<String, String> getMapVote() {
        return mapVote;
    }

    /**
     * 投票
     * @param user 投票人，即用户名
     * @param voteItem 投票的选项
     */
    public void vote(String user, String voteItem) {
        // 先为该用户增加投票的次数
        // 从记录中取出已有的投票次数
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        oldVoteCount = oldVoteCount + 1;
        mapVoteCount.put(user, oldVoteCount);

        // 判断该用户投票的类型，就相当于判断对应的状态
        // 到底是正常投票、重复投票、恶意投票、黑名单状态
        if (oldVoteCount == 1) {
            state = new NormalVoteState();
        } else if (oldVoteCount > 1 && oldVoteCount < 5) {
            state = new RepeatVoteState();
        } else if (oldVoteCount >= 5 && oldVoteCount < 8) {
            state = new SplitVoteState();
        } else if (oldVoteCount >= 8) {
            state = new BlackVoteState();
        }

        // 然后转调状态对象来进行相应的操作
        state.vote(user, voteItem, this);
    }
}
