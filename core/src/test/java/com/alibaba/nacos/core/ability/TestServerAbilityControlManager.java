/*
 * Copyright 1999-2022 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.core.ability;

import com.alibaba.nacos.api.ability.constant.AbilityKey;
import com.alibaba.nacos.common.JustForTest;
import com.alibaba.nacos.core.ability.control.ServerAbilityControlManager;

import java.util.Map;
import java.util.Set;

public class TestServerAbilityControlManager extends ServerAbilityControlManager {

    @JustForTest
    public void setCurrentSupportingAbility(Map<AbilityKey, Boolean> ability) {
        currentRunningAbility.putAll(ability);
    }

    @JustForTest
    public void setClusterAbility(Map<AbilityKey, Boolean> ability) {
        super.setClusterAbilityTable(ability);
    }

    @JustForTest
    public int handlerMappingCount() {
        return super.handlerMapping().size();
    }
    
    @JustForTest
    public Set<String> getServerNotSupportAbility() {
        return super.serverNotSupport();
    }
    
}