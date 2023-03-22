package com.factory_design_pattern.configrules;

import com.factory_design_pattern.chain.ITransformData;
import com.factory_design_pattern.chain.RuleManagerCommand;
import com.factory_design_pattern.rules.PlayerNameRule;
import com.factory_design_pattern.rules.PlayerRoleRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuleConfig {

    @Bean(name="processTransformationRules")
    RuleManagerCommand getProcessTransformationRules()
    {
        RuleManagerCommand ruleManagerCommand=new RuleManagerCommand();
        ruleManagerCommand.appendToRuleChain(getPlayerNameRule());
        ruleManagerCommand.appendToRuleChain(getPlayerRoleRule());
        return ruleManagerCommand;

    }
    @Bean
    ITransformData getPlayerNameRule()
    {
        return new PlayerNameRule();
    }
    @Bean
    ITransformData getPlayerRoleRule()
    {
        return new PlayerRoleRule();
    }

}
