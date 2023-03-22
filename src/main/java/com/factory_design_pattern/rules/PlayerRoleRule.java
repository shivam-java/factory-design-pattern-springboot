package com.factory_design_pattern.rules;

import com.factory_design_pattern.chain.TransformationRuleCommand;
import com.factory_design_pattern.model.Player;

public class PlayerRoleRule extends TransformationRuleCommand
{


    @Override
    public void processData(Player player) {
          player.setRole("batsman");
    }
}
