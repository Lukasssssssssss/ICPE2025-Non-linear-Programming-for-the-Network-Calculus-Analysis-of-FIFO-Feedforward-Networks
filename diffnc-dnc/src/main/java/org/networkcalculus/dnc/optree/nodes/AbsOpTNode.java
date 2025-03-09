package org.networkcalculus.dnc.optree.nodes;


/**
 * @author Lukas Herll
 *
 * An interface specifying a generic node of an operator tree.
 *
 * Recommended use: via the OpTreeAnalysis class
 * Alternatively:
 *  construct using an existing nesting tree: new OpTRootNode(nestingTree)
 *  compute the symbolic term, bounds etc: OpTRootNode.deriveSymbolics(plugin)
 *
 * A binary operator tree can also be assembled manually by explicitly creating the needed OpTNodes and manually adding
 * parent/child relationships. But take care, this is not well tested.
 */
public interface AbsOpTNode {

    void setId(int id);
    int getId();
    int setAllIDs(int rootId);
    void printOpTree();
    @Override
    String toString();



}
