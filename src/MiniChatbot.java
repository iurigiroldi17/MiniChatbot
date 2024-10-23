public class MiniChatbot {
    public String responder(String usuarioInput) {
        if (usuarioInput.contains("sair")) {
            return "Até mais! Espero ter ajudado.";
        } else if (usuarioInput.contains("olá") || usuarioInput.contains("oi")) {
            return "Olá! Como posso ajudar você hoje?";
        } else if (usuarioInput.contains("qual é o seu nome")) {
            return "Meu nome é MiniChatbot.";
        } else if (usuarioInput.contains("como está você")) {
            return "Estou funcionando perfeitamente, obrigado.";
        } else {
            return "Desculpe, eu não entendi sua pergunta. Pode reformular?";
        }
    }
}


