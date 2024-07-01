package com.codeWithSrb.solidPrinciple.openClosed;

/**
 * a service which doesn't depend on the concrete implementation of the different graph service
 * it's dependent on the abstract graph which means we can any number of graph but this service will never change
 */
public class DrawProgresGraph {

    private final GraphService graphService;

    public DrawProgresGraph(GraphService graphService) {
        this.graphService = graphService;
    }

    public void drawProgressGraph() {
        graphService.createProgressGraph();
    }
}
