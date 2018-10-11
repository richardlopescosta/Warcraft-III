package warcraft.objetos.construcoes;

import warcraft.objetos.Objeto;
import warcraft.racas.Raca;
import warcraft.util.*;

public class Construcao extends Objeto {
    private int ataque = 0;
    private int alcance = 0;

    public Construcao(Posicao posicao, String imagem, Custo custo, boolean estado, int vida, int ataque, int alcance, Raca raca) {
        super(posicao, imagem, custo, estado, vida, raca);
    }
}
