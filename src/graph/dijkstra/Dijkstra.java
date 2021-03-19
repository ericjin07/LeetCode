package graph.dijkstra;

import java.util.LinkedList;

public class Dijkstra {
    int v;
    Graph graph;

    public Dijkstra(int v) {
        this.v = v;
        graph = new Graph(v);
    }

    public void dijkstra (int s, int t) {
        int[] preprocess = new int[v];
        Vertex[] vertices = new Vertex[v];
        for (int i = 0; i < v; i++) {
            vertices[i] = new Vertex(i, Integer.MAX_VALUE);
        }
        PriorityQueen queen = new PriorityQueen(v);
        boolean[] inQueen = new boolean[v];
        vertices[s].setDist(0);
        queen.add(vertices[s]);
        inQueen[s] = true;
        while (!queen.isEmpty()) {
            Vertex minVertex = queen.poll();
            if (s == minVertex.getId()) return;
            for (int i = 0; i < graph.adj[minVertex.getId()].size(); i++) {
                Edge edge = graph.adj[minVertex.getId()].get(i);
                Vertex nextVertex = vertices[edge.getTid()];
                if (minVertex.getDist() + edge.getW() < nextVertex.getDist()) {
                    nextVertex.setDist(minVertex.getDist() + edge.getW());
                    preprocess[nextVertex.getId()] = minVertex.getId();
                    if (inQueen[nextVertex.getId()]) {
                        queen.update(nextVertex);
                    } else {
                        queen.add(nextVertex);
                        inQueen[nextVertex.getId()] = true;
                    }
                }
            }
        }
        System.out.println(s);
        print(s, t, preprocess);
    }

    private void print(int s, int t, int[] preprocess) {
        if (s == t) return;
        print(s, preprocess[t], preprocess);
        System.out.print("->" + t);
    }
}

class PriorityQueen {
    Vertex[] nodes;
    int count;

    public PriorityQueen(int v) {
        nodes = new Vertex[v + 1];
        this.count = v;
    }

    public void update(Vertex v) {}

    public Vertex poll() { return null; }

    public void add(Vertex v) {}

    public boolean isEmpty() {return false;}
}

class Graph {
    LinkedList<Edge>[] adj;

    public Graph(int v) {
        this.adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int t, int w) {
        adj[s].add(new Edge(s, t, w));
    }
}

class Edge {
    private int sid; //start point
    private int tid; //end point
    private int w; // weight of this edge

    public Edge(int sid, int tid, int w) {
        this.sid = sid;
        this.tid = tid;
        this.w = w;
    }

    public int getSid() {
        return sid;
    }

    public int getTid() {
        return tid;
    }

    public int getW() {
        return w;
    }
}

class Vertex {
    private int id;
    private int dist;   // start point to this vertex

    public Vertex(int id, int dist) {
        this.id = id;
        this.dist = dist;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public int getId() {
        return id;
    }
}
