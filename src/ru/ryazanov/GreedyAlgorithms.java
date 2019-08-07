package ru.ryazanov;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GreedyAlgorithms {

    public static Set<String> findStations(Set<String> statesNeeded, Map<String, Set<String>> stations) {
        Set<String> finalStation = new HashSet<>();
        Set<String> needStates = new HashSet<>(statesNeeded);
        while (!needStates.isEmpty()) {
            String bestStation = "";
            Set<String> statesCovered = new HashSet<>();

            for (Map.Entry<String, Set<String>> entry :
                    stations.entrySet()) {
                Set<String> covered = new HashSet<>(needStates);
                covered.retainAll(entry.getValue());

                if (covered.size() > statesCovered.size()) {
                    bestStation = entry.getKey();
                    statesCovered = Set.copyOf(covered);
                }
            }

            needStates.removeAll(statesCovered);
            finalStation.add(bestStation);
        }
        return finalStation;
    }
}
