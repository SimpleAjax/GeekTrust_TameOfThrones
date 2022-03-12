package strategies.alliance;

import models.Kingdom;
import strategies.AllianceStrategy;
import utils.Util;

import java.util.Map;

public class EmblemCharacterAllianceStrategy implements AllianceStrategy {
    @Override
    public boolean checkAlliance(String message, Kingdom kingdom) {
        Map<Character, Integer> messageMap, keyMap;
        messageMap = Util.getCharCountMap(message);
        keyMap = Util.getCharCountMap(kingdom.getEmblem());

        for(char key : keyMap.keySet()) {
            if(!messageMap.containsKey(key) || keyMap.get(key)>messageMap.get(key)) return false;
        }
        return true;
    }
}
