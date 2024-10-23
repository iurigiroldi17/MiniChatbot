import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MiniChatbot chatbot = new MiniChatbot();
        System.out.println("Olá! Como posso ajudar você hoje?");

        while (true) {
            System.out.print("Você: ");
            String usuarioInput = scanner.nextLine();

            String resposta = chatbot.responder(usuarioInput);
            System.out.println("MiniChatbot: " + resposta);

            if (usuarioInput.contains("sair")) {
                break;
            }
        }

        scanner.close();
    }
}
