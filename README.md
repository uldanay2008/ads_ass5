# README — Dijkstra’s Algorithm Project

## Project Description

This project implements Dijkstra’s Algorithm in Java to find the shortest path from a starting vertex to all other vertices in a weighted graph.

The graph supports weighted edges using an adjacency matrix representation.

---

## Features

* Add weighted edges
* Store graph connections
* Find shortest paths using Dijkstra’s Algorithm
* Display distances from the starting vertex

---

## Technologies

* Java
* Arrays
* Graph Algorithms

---

## Project Structure

```text
Main.java
Graph class
- addEdge()
- dijkstra()
```

---

## How It Works

The algorithm:

1. Starts from a selected vertex
2. Finds the nearest unvisited vertex
3. Updates distances to neighboring vertices
4. Repeats until all vertices are visited

---

## Example Graph

```text
0 --4-- 1
|       |
1       1
|       |
2 --5-- 3 --3-- 4
 \--2--/
```

---

## Example Output

```text
Shortest distances from vertex 0
To 0 = 0
To 1 = 3
To 2 = 1
To 3 = 4
To 4 = 7
```

![Output](Screenshot%2026-05-23%115700.png)

---

## Main Methods

### addEdge(int source, int destination, int weight)

Adds an edge with a weight between two vertices.

### dijkstra(int start)

Calculates the shortest distance from the starting vertex to all other vertices.

---

