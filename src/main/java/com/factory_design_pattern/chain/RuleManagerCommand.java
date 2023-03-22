package com.factory_design_pattern.chain;

import com.factory_design_pattern.model.Player;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class RuleManagerCommand  extends TransformationRuleCommand
{

    private List<ITransformData> processTransformationRules=new ArrayList<>();
    @Override
    public void processData( Player player)
    {
          for(ITransformData iTransformData:processTransformationRules)
          {
              iTransformData.processData(player);
          }
    }

    public void appendToRuleChain(ITransformData iTransformData)
    {
        processTransformationRules.add(iTransformData);
    }

    public void setRuleChain(List<ITransformData> ruleChain)
    {
        processTransformationRules=ruleChain;
    }

    public List<ITransformData> getProcessTransformationRules()
    {
       return processTransformationRules;
    }

}
