package Sample_03.JogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {
    static int turno = 0;

    public static void main(String[] args) {
        String[][] tabuleiro = { 
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };
        Scanner input = new Scanner(System.in);
        
        while (true) {
            if (turno == 0) {
                System.out.println("Jogador 1, qual coordenada X quer jogar?");
                int moveX = Integer.parseInt(input.nextLine());
                System.out.println("Jogador 1, qual coordenada Y quer jogar?");
                int moveY = Integer.parseInt(input.nextLine());
                markBoard(tabuleiro, moveX, moveY, "X");
                printBoard(tabuleiro);
                turno = 1;
            } else {
                System.out.println("Jogador 2, qual coordenada X quer jogar?");
                int moveX = Integer.parseInt(input.nextLine());
                System.out.println("Jogador 2, qual coordenada Y quer jogar?");
                int moveY = Integer.parseInt(input.nextLine());
                markBoard(tabuleiro, moveX, moveY, "O");
                printBoard(tabuleiro);
                turno = 0;
            }

            String winner = checkWinner(tabuleiro);
            if (!winner.equals(" ")) {
                System.out.println("O vencedor é: " + winner);
                break;
            }

            if (isBoardFull(tabuleiro)) {
                System.out.println("O jogo empatou!");
                break;
            }
        }
    }

    public static void markBoard(String[][] tabuleiro, int moveX, int moveY, String mark) {
        if (tabuleiro[moveX][moveY].equals(" ")) {
            tabuleiro[moveX][moveY] = mark;
        } else {
            System.out.println("Essa posição já está ocupada! Tente novamente.");
            turno = (turno == 0) ? 1 : 0;  // Reverte o turno para permitir a repetição da jogada
        }
    }

    public static void printBoard(String[][] tabuleiro) {
        System.out.print("\n\n 0   1   2\n\n");
        for (int posicao1 = 0; posicao1 < 3; posicao1++) {
            for (int posicao2 = 0; posicao2 < 3; posicao2++) {
                System.out.print(" " + tabuleiro[posicao1][posicao2]);
                if (posicao2 < 2) {
                    System.out.print(" | ");
                }
                if (posicao2 == 2) {
                    System.out.print("  " + posicao1);
                }
            }
            if (posicao1 < 2) {
                System.out.print("\n------------");
            }
            System.out.println("\n");
        }
    }

    public static String checkWinner(String[][] tabuleiro) {
        // Verificando linhas
        for (int i = 0; i < 3; i++) {
            if (!tabuleiro[i][0].equals(" ") && tabuleiro[i][0].equals(tabuleiro[i][1]) && tabuleiro[i][1].equals(tabuleiro[i][2])) {
                return tabuleiro[i][0];
            }
        }

        // Verificando colunas
        for (int i = 0; i < 3; i++) {
            if (!tabuleiro[0][i].equals(" ") && tabuleiro[0][i].equals(tabuleiro[1][i]) && tabuleiro[1][i].equals(tabuleiro[2][i])) {
                return tabuleiro[0][i];
            }
        }

        // Verificando diagonais
        if (!tabuleiro[0][0].equals(" ") && tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][2])) {
            return tabuleiro[0][0];
        }
        if (!tabuleiro[0][2].equals(" ") && tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][0])) {
            return tabuleiro[0][2];
        }

        // Se ninguém ganhou, retorna " " 
        return " ";
    }

    public static boolean isBoardFull(String[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }
}
