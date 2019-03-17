package com.mycompany.app;

/**
 * @author MM Formations
 * Hello world! classe pour démo Maven/Jenkins
 */
public class App
{
	/**
	 * Constante du message Hello World!
	 */
    private String message = "Hello World!";

    /**
     * Constructeur par défaut
     */
    public App() {}

    /**
     * Méthode de lancement de l'application console
     * @param args Arguments du programme
     */
    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    /**
     * Récupère la constante du message à afficher
     * @return Le message Hello World!
     */
    private String getMessage() {
        return message;
    }
}
