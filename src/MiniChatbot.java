public class MiniChatbot {

    public String responder(String usuarioInput) {

        if (usuarioInput.contains("sair")) {
            return "Ate mais! Espero ter ajudado.";

        } else if (usuarioInput.contains("ola") || usuarioInput.contains("oi")) {
            return "Olá! Como posso te ajudar?";

        } else if (usuarioInput.contains("qual é o seu nome")) {

            return "Meu nome é MiniChatbot. Mas para os mais próximos é Botzin";

        } else if (usuarioInput.contains("como esta voce")) {

            return "Estou bem demais, obrigado.";
        } else {

            return "Desculpe, eu não entendi sua pergunta. Pode reformular?";
        }
    }
}


