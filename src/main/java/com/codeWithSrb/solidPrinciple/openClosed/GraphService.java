package com.codeWithSrb.solidPrinciple.openClosed;

/**
 * earlier we had a graph service class where we were drawing all the graphs in one service
 * which was more prone to modification in case we want to add more graphs
 * but in open closed principle we can create an interface which is open for extension but closed for modification
 */
public interface GraphService {
    public void createProgressGraph();
}
