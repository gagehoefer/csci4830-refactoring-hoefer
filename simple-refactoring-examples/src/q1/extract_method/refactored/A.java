package q1.extract_method.refactored;

import java.util.List;

public class A {
	Node m1(List<GraphObject> nodes, String p) {
		printData(nodes, p);
		return null;
	}

	Edge m2(List<GraphObject> edgeList, String p) {
		printData(edgeList, p);
		return null;
	}

   void printData(List<GraphObject> graphObjectList, String string) {
		for (GraphObject graphObject : graphObjectList) {
			if (graphObject.contains(string)) {
				System.out.println(graphObject);
			}
		}
	}
}

class GraphObject {
	String name;
	public boolean contains(String p) {
		return name.contains(p);
	}
}

class Node extends GraphObject {
}

class Edge extends GraphObject {
}