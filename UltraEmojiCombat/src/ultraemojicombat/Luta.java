package ultraemojicombat;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador dasafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Metodos Publicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria().equals(l2.getCategoria()) && l1!=l2)){
            this.aprovada = true;
            this.desafiante = l1;
            this.dasafiado = l2;
        }
        else{
            this.aprovada = false;
            this.desafiante = null;
            this.dasafiado = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("Desafiante");
            this.desafiante.apresentar();
            System.out.println("Desafiado");
            this.dasafiado.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case(0): //Empate
                    this.dasafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case(1): //Desafiante vence
                    this.desafiante.ganharLuta();
                    this.dasafiado.perderLuta();
                    break;
                case(2): //Desafiado vence
                    this.desafiante.perderLuta();
                    this.dasafiado.ganharLuta();
                    break;
            }
        }
        else{
            System.out.println("Luta não permitida");
        }
    }
    //Metodos Especiais

    public Lutador getDasafiado() {
        return dasafiado;
    }

    public void setDasafiado(Lutador dasafiado) {
        this.dasafiado = dasafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiando) {
        this.desafiante = desafiando;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
