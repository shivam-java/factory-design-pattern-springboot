package com.factory_design_pattern.chain;

import com.factory_design_pattern.model.Player;
import org.springframework.web.bind.annotation.RequestBody;

public interface ITransformData {

public void processData( Player player);
}
