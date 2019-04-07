package com.wangjiangfei.state;

public class BlackVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 黑名单
        // 计入黑名单中，禁止登陆系统了
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
