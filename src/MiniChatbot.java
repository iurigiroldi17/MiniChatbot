import java.util.Scanner;

public class MiniChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Como posso ajudar você hoje?");

        while (true) {
            System.out.print("Você: ");
            String usuarioInput = scanner.nextLine();

            if (usuarioInput.contains("sair")) {


                System.out.println("MiniChatbot: Até mais! Espero ter ajudado.");
                break;

            } else if (usuarioInput.contains("olá") || usuarioInput.contains("oi")) {

                System.out.println("MiniChatbot: Olá! Como posso ajudar você hoje?");

            } else if (usuarioInput.contains("qual é o seu nome")) {


                System.out.println("MiniChatbot: Meu nome é MiniChatbot.");

            } else if (usuarioInput.contains("como está você")) {

                System.out.println("MiniChatbot: Estou funcionando perfeitamente, obrigado");

            } else {

                System.out.println("MiniChatbot: Desculpe, eu não entendi sua pergunta. Pode reformular?");

            }}
        scanner.close();
    }
}

