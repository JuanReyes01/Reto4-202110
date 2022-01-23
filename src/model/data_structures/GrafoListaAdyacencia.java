package model.data_structures;

public class GrafoListaAdyacencia<K extends Comparable<K>, V> implements IGrafoListaAdyacencia<K, V>{

	TablaHashSeparateChaining<K, Vertex<K, V>> vertices;
	
	public GrafoListaAdyacencia(int numVertices) {
		vertices = new TablaHashSeparateChaining<>(numVertices, 1.5);
	}
	
	
	public boolean containsVertex(K id) {
		
			Vertex<K, V> buscado = vertices.get(id); 
			if(buscado!=null){
				return true;
			}
		
		return false;
	}

	
	public int numVertices() {
		return vertices.size();
	}

	@Override
	public int numEdges() {
		
		return 0;
	}

	@Override
	public void insertVertex(K id, V value) {
		boolean encontro = false; 
		
			Vertex<K, V> buscado = vertices.get(id); 
			if(buscado!=null){
				buscado.setValue(value);
				encontro = true;
			}
		
		
		if(!encontro)
		vertices.put(id,(new Vertex<>(id, value)));
	}

	@Override
	public void addEdge(K source, K dest, float weight) {
		
	}

	@Override
	public Vertex<K, V> getVertex(K id) {
		return vertices.get(id);
	}

	@Override
	public Edge<K, V> getEdge(K idS, K idD) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ILista<Edge<K, V>> adjacentEdges(K id) {
		ArregloDinamico<Edge<K, V>> edges = (ArregloDinamico<Edge<K, V>>) vertices.get(id).edges(); 
		return edges;
	}

	public ILista<Vertex<K,V>> adjacentVertex(K id) {
		ArregloDinamico<Vertex<K, V>> vertex = (ArregloDinamico<Vertex<K,V>>) vertices.get(id).vertices();
		return vertex;
	}

	@Override
	public int indegree(K vertex) {
		ArregloDinamico<Edge<K, V>> edges = (ArregloDinamico<Edge<K, V>>) vertices.get(id).edges();
		return edges.size();
	}

	@Override
	public int outdegree(K vertex) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ILista<Edge<K, V>> edges() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public ILista<Vertex<K, V>> vertices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void unmark() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dfs(K id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bfs(K id) {
		// TODO Auto-generated method stub
		
	}

}
