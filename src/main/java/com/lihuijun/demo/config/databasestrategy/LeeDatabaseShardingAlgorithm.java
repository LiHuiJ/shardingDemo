package com.lihuijun.demo.config.databasestrategy;


import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.database.SingleKeyDatabaseShardingAlgorithm;
import com.lihuijun.demo.config.Database0Config;
import com.lihuijun.demo.config.Database1Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * 分库逻辑
 */
@Component
public class LeeDatabaseShardingAlgorithm implements SingleKeyDatabaseShardingAlgorithm<Integer> {

    @Autowired
    private Database0Config database0Config;
    @Autowired
    private Database1Config database1Config;

    @Override
    public String doEqualSharding(Collection<String> collection, ShardingValue<Integer> shardingValue) {
        int value = shardingValue.getValue();
        if (value % 2 == 0){
            return database0Config.getDatabaseName();
        }else {
            return database1Config.getDatabaseName();
        }
    }

    @Override
    public Collection<String> doInSharding(Collection<String> collection, ShardingValue<Integer> shardingValue) {

        return null;
    }

    @Override
    public Collection<String> doBetweenSharding(Collection<String> collection, ShardingValue<Integer> shardingValue) {
        return null;
    }
}
