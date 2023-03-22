package com.factory_design_pattern.rules;

import com.factory_design_pattern.chain.ITransformData;
import com.factory_design_pattern.chain.TransformationRuleCommand;
import com.factory_design_pattern.model.Player;
import org.springframework.web.bind.annotation.RequestBody;

public class PlayerNameRule extends TransformationRuleCommand
{


    @Override
    public void processData(Player player) {
          player.setName("player1");
    }
}
