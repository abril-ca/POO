import static java.lang.Double.*;

public class App {
    public static void main(String[] args) {
        if (args.length!=6) 
        {
            System.err.println("Use 6 parâmetros com as coordenadas do triângulo.");
            return;
        }

        // atenção: ainda não estamos tratando os possíveis erros na formatação
        // dos parâmetros
        Ponto v1 = new Ponto(parseDouble(args[0]),parseDouble(args[1]));
        Ponto v2 = new Ponto(parseDouble(args[2]),parseDouble(args[3]));
        Ponto v3 = new Ponto(parseDouble(args[4]),parseDouble(args[5]));
        
        Triangulo t = new Triangulo(v1, v2, v3);
        System.out.println(t.getPerimetro());
    }
}