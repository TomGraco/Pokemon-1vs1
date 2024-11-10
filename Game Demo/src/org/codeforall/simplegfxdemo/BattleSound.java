package org.codeforall.simplegfxdemo;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class BattleSound {
   // Lista para guardar as threads e players ativos
    private static final List<Thread> threads = new ArrayList<>();
    private static final List<Player> players = new ArrayList<>();

    public static void tocarSom(String caminhoArquivo) {
        try {
            // Carrega o arquivo MP3
            FileInputStream arquivo = new FileInputStream(caminhoArquivo);
            Player player = new Player(arquivo);
            // Cria uma nova thread para tocar o som
            Thread threadSom = new Thread(() -> {
                try {
                    player.play();
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            });
            // Adiciona o player e a thread às listas
            players.add(player);
            threads.add(threadSom);
            // Inicia a thread
            threadSom.start();
        } catch (FileNotFoundException | JavaLayerException e) {
            e.printStackTrace();
        }
    }

    public static void pararSom(int indice) {
        if (indice >= 0 && indice < players.size()) {
            Player player = players.get(indice);
            Thread threadSom = threads.get(indice);
            if (player != null) {
                player.close();  // Fecha o player (para o som)
            }
            if (threadSom != null && threadSom.isAlive()) {
                threadSom.interrupt();  // Interrompe a thread
            }
            // Remove o player e a thread das listas
            players.remove(indice);
            threads.remove(indice);
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public static void pararTodasAsMusicas() {
        // Percorre todas as músicas e para cada uma delas
        for (int i = players.size() - 1; i >= 0; i--) {
            pararSom(i);
        }
    }

}

























