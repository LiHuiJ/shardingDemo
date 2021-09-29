package com.lihuijun.demo.config.tablestrategy;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/**
 * 分表逻辑
 */
@Component
public class LeeTableShardingAlgorithm implements SingleKeyTableShardingAlgorithm<Date> {

    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("HHmm");

    @Override
    public String doEqualSharding(Collection<String> availableTargetNames, ShardingValue<Date> shardingValue) {
        for (String targetName : availableTargetNames) {
            if (targetName.endsWith(FORMAT.format(shardingValue.getValue()))){
                return targetName;
            }
        }
        throw new IllegalArgumentException("无匹配的分表表名称");
    }

    @Override
    public Collection<String> doInSharding(Collection<String> availableTargetNames, ShardingValue<Date> shardingValue) {
        return null;
    }

    @Override
    public Collection<String> doBetweenSharding(Collection<String> availableTargetNames, ShardingValue<Date> shardingValue) {
        return null;
    }
}
