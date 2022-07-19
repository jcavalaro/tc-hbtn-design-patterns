public class WesterosPersonagemFactory extends PersonagemFactory{
    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {
        if(tipo.equals(TipoPersonagem.MAGO)){
            //nome = "Mago";
            return new Mago(nome, 8, 3, 3, 3, 4);
        } else if (tipo.equals(TipoPersonagem.LADRAO)) {
            //nome = "Ladrao";
            return new Ladrao(nome, 1, 8, 7,  7, 10);
        }else
            //nome = "Guerreiro";
        return new Guerreiro(nome, 0, 9, 7, 10, 7);
    }
}
