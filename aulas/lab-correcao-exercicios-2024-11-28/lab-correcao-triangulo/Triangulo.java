public class Triangulo {
    private Ponto vertice1, vertice2, vertice3;

    public Triangulo(Ponto vertice1, Ponto vertice2, Ponto vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public Ponto[] getVertices()
    {
        Ponto[] vertices = new Ponto[3];
        vertices[0] = vertice1;
        vertices[1] = vertice2;
        vertices[2] = vertice3;
        return vertices;
    }

    public Ponto getVertice1() {
        return vertice1;
    }
    public Ponto getVertice2() {
        return vertice2;
    }
    public Ponto getVertice3() {
        return vertice3;
    }

    public double getPerimetro()
    {
        return vertice1.distancia(vertice2)+
            vertice2.distancia(vertice3)+
            vertice3.distancia(vertice1);
    }

    
}
